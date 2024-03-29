package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection.OracleTargetConnection;
import com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection.TargetConnection;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.CodeGenerator;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.PLSQL_Generator;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.ApplicationDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.BusinessRuleDAO;
import com.r00lerz.ruleDef.RuleDefException;

public class Application {

	private static CodeGenerator codeGenerator = new PLSQL_Generator();
	private static TargetConnection targetConnection = new OracleTargetConnection();
	
	private int id;
	private String appName;
	private String appNameAbbreviation;

	private Set<BusinessRule> businessRules;
	

	public Application() {
		businessRules = new HashSet<BusinessRule>();
	}

	public String generateRule(final String lhsValue, final String operator, final List<String> rhsValues, final String realPath) throws RuleDefException {
		final String ruleString = generateRuleSting(lhsValue, operator, rhsValues);
		final String appPartRuleName = "BRG" + "_" + appNameAbbreviation;

		final Map<String, String> generationResult = codeGenerator.generateRule(ruleString, realPath);
		final BusinessRule generatedRule = new BusinessRule(appPartRuleName, ruleString, lhsValue, operator, rhsValues, generationResult.get("ruleType"), generationResult.get("generatedCode"));
		
		this.getBusinessRules().add(generatedRule);
		new ApplicationDAO().updateApplication(this);
		
		return Integer.toString(generatedRule.getId());
	}

	private String generateRuleSting(final String lhsValue, final String operator, final List<String> rhsValues) {
		final StringBuffer ruleString = new StringBuffer().append(lhsValue + " " + operator + " ");

		for (int i = 0; i < rhsValues.size(); i++) {
			ruleString.append(rhsValues.get(i));

			if (rhsValues.size() == 2 && i == 0){
				ruleString.append(" and ");
			}
			else if(rhsValues.size() > 2) {
				// code to generate list here
			}
		}
		return ruleString.toString();
	}
	
	public void activateRule(final int id, final String realPath) throws RuleDefException, SQLException {
		final BusinessRule businessRuleToActivate = new BusinessRuleDAO().retrieveById(id);
		businessRuleToActivate.setStatus(businessRuleToActivate.getStatus()^1); //flips the status of the businessRule. So when its 0 it becomes 1 and the other way around
		//TODO:: WE NEED TO LOOK INTO THIS, BECAUSE THER IS THERE IS A CHANCE THAT GENERATED TRIGGER NAMES ARE NOT UNIQUE...
		final 	String triggername = generateNamePartOne()+"_"+businessRuleToActivate.getLhsValue().abbreviateEntityName()+"_TRIGGER";
		final String tablename = businessRuleToActivate.getEntity();
		
		final List<BusinessRule> rulesToInclude = new BusinessRuleDAO().retrieveRulesForActivation(businessRuleToActivate.getEntity());
		final 	StringBuffer ruleSet = new StringBuffer().append( "${ENTITYNAME: " + tablename + " RESULTSETNAME: " + triggername + "}");
		for(final BusinessRule rule : rulesToInclude){
			ruleSet.append(rule.getDescription());
			ruleSet.append(" ${NAME:"+rule.getName()+"}"+"\n");
		}
		final String result = codeGenerator.generateRuleSet(ruleSet.toString(), realPath);
		System.out.println(result);
		try {
			targetConnection.executeStatement(result);
			System.out.println(result);
		} catch (SQLException e) {
			businessRuleToActivate.setStatus(businessRuleToActivate.getStatus()^1); //flips the status back if activating the trigger fails;
			throw e;
		}
	}
	
	@Override
	public String toString() {
		final StringBuffer string = new StringBuffer().append("Aplication: " + appName + id + "\n");
		for (final BusinessRule br : businessRules) {
			string.append(br);
		}
		return string.toString();

	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(final String appName) {
		this.appName = appName;
	}

	public String getAppNameAbbreviation() {
		return appNameAbbreviation;
	}

	public void setAppNameAbbreviation(final String appNameAbbreviation) {
		this.appNameAbbreviation = appNameAbbreviation;
	}

	public Set<BusinessRule> getBusinessRules() {
		return businessRules;
	}

	public void setBusinessRules(final Set<BusinessRule> businessRules) {
		this.businessRules = businessRules;
	}
	
	public String generateNamePartOne(){
		return "BRG" + "_" + appNameAbbreviation;
	}
}
