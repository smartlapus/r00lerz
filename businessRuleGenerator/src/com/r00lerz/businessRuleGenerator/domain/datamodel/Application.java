package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;

import com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection.TargetConnection;
import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.CodeGenerator;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.PLSQL_Generator;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.ApplicationDAO;

public class Application {

	private int id;
	private String appName;
	private String appNameAbbreviation;

	private Set<BusinessRule> businessRules;
	private CodeGenerator codeGenerator;
	private TargetConnection targetConnection;

	public Application() {
		codeGenerator = new PLSQL_Generator();
		businessRules = new HashSet<BusinessRule>();
	}

	public String generateRule(String lhsValue, String operator, List<String> rhsValues, String realPath) {
		String ruleString = generateRuleSting(lhsValue, operator, rhsValues);
		String appPartRuleName = "BRG" + "_" + appNameAbbreviation;

		Map<String, String> generationResult = codeGenerator.generateRule(ruleString, realPath);
		BusinessRule generatedRule = new BusinessRule(appPartRuleName, ruleString, lhsValue, operator, rhsValues, generationResult.get("ruleType"), generationResult.get("generatedCode"));
		
		this.getBusinessRules().add(generatedRule);
		new ApplicationDAO().updateApplication(this);
		
		return Integer.toString(generatedRule.getId());
	}

	private String generateRuleSting(String lhsValue, String operator, List<String> rhsValues) {
		String ruleString = lhsValue + " " + operator + " ";

		for (int i = 0; i < rhsValues.size(); i++) {
			ruleString += rhsValues.get(i);

			if ((rhsValues.size() == 2) && i == 0) {
				ruleString += " and ";
			} else if (rhsValues.size() > 2) {
				// code to generate list here
			}
		}
		return ruleString;
	}
	
	public String toString() {
		String s = "Aplication: " + appName + id + "\n";
		for (BusinessRule br : businessRules) {
			s += br;
		}
		return s;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppNameAbbreviation() {
		return appNameAbbreviation;
	}

	public void setAppNameAbbreviation(String appNameAbbreviation) {
		this.appNameAbbreviation = appNameAbbreviation;
	}

	public Set<BusinessRule> getBusinessRules() {
		return businessRules;
	}

	public void setBusinessRules(Set<BusinessRule> businessRules) {
		this.businessRules = businessRules;
	}
}
