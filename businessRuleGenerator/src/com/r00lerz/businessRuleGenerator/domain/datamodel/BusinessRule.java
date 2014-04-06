package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.BackEndRuleTypeDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.FrontEndRuleTypeDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.OperatorDAO;

public class BusinessRule {
	
	private int id;
	private String name;
	private String description;
	private BusinessRule condition;
	
	private Value lhsValue;
	private Operator operator;
	private Set<Value> rhsValues;
	
	private BackEndRuleType backEndRuleType;
	private FrontEndRuleType frontEndRuleType;
	private Set<GeneratedCode> generatedCode;
	
	private int status = 0; // Determines whether the business rule is active. Default is [0]: Disabled, [1]: Enabled.
	private String entity = ""; // Stores what entity the business rule applies to.
	private int consecutiveNumber = 0;
	
	public BusinessRule(){}
	
	public BusinessRule(String appPartRuleName, String description, String lhsValue,String operator, List<String> rhsValues, String frontEndRuleType, String generatedCode){
		System.out.println("\n\nBusinessRule::Constructing BusinessRule");
		
		this.description = description;
		
		this.lhsValue = new Value(lhsValue);
		this.operator = new OperatorDAO().retrieveOperatorByName(operator);
		this.rhsValues = new HashSet<Value>();
		for (String valueString : rhsValues){
			this.rhsValues.add(new Value(valueString));
		}
		this.backEndRuleType = new BackEndRuleTypeDAO().retrieveTypeByName("Compare Rule");
		this.frontEndRuleType = new FrontEndRuleTypeDAO().retrieveTypeByName(frontEndRuleType);
		
		this.generatedCode = new HashSet<GeneratedCode>();
		this.generatedCode.add(new GeneratedCode(generatedCode, this.name));
		
		this.entity = lhsValue.split("\\.")[0];
		
		
				
		this.name = this.generateName(appPartRuleName);
		
	}
	
	public String generateName(String appPartRuleName){
		String entityAbr = lhsValue.abbreviateEntityName();
		String ruleTypeAbr = frontEndRuleType.getAbbreviation();
		int generatedNumber = 5;
		
		//		BRG_VBMG_PRT_CNS_ACMP_01
		//		•	BRG: Business Rule Generator
		//		•	VMBG: Applicatie
		//		•	PRT: Entiteit “Product”
		//		•	CNS: Het is een database constraint
		//		•	ACMP: Attribute Compare Rule
		//		•	01: Volgnummer

		
		return appPartRuleName + "_" + entityAbr + "_" + "TRG" + "_" + ruleTypeAbr + "_" + generatedNumber;
    	//Entity abbreviation
		
		
		
    	//dynamic numbering*/
	}
	
	@Override
	public String toString() {
		return "BusinessRule:\n"
				+ "id= " + id+"\n"
				+ "name= " + name+"\n" 
				+ "description= " + description + "\n" 
//				+ "condition= " + condition + "\n" 
				+ "lhsValue= "+ lhsValue + "\n" 
				+ "operator= " + operator + "\n" 
				+ "rhsValues= " 	+ rhsValues + "\n" 
				+ "backEndRuleType= " + backEndRuleType + "\n"
				+ "frontEndRuleType= " + frontEndRuleType + "\n" 
				+ "generatedCode= " + generatedCode;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BusinessRule getCondition() {
		return condition;
	}

	public void setCondition(BusinessRule condition) {
		this.condition = condition;
	}

	public Value getLhsValue() {
		return lhsValue;
	}

	public void setLhsValue(Value lhsValue) {
		this.lhsValue = lhsValue;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Set<Value> getRhsValues() {
		return rhsValues;
	}

	public void setRhsValues(Set<Value> rhsValues) {
		this.rhsValues = rhsValues;
	}

	public BackEndRuleType getBackEndRuleType() {
		return backEndRuleType;
	}

	public void setBackEndRuleType(BackEndRuleType backEndRuleType) {
		this.backEndRuleType = backEndRuleType;
	}

	public FrontEndRuleType getFrontEndRuleType() {
		return frontEndRuleType;
	}

	public void setFrontEndRuleType(FrontEndRuleType frontEndRuleType) {
		this.frontEndRuleType = frontEndRuleType;
	}

	public Set<GeneratedCode> getGeneratedCode() {
		return generatedCode;
	}

	public void setGeneratedCode(Set<GeneratedCode> generatedCode) {
		this.generatedCode = generatedCode;
	}
}
