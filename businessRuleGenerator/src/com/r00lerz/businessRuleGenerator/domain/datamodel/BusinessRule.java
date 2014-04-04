package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.ArrayList;
import java.util.List;

public class BusinessRule {
	
	private int id;
	private String name;
	private String description;
	private BusinessRule condition;
	
	private Value lhsValue;
	private Operator operator;
	private List<Value> rhsValues;
	
	private BackEndRuleType backEndRuleType;
	private FrontEndRuleType frontEndRuleType;
	private List<GeneratedCode> generatedCode;
	
	public BusinessRule(){}
	
	public BusinessRule(String appPartRuleName, String description, String lhsValue,String operator, List<String> rhsValues, String frontEndRuleType, String generatedCode){
		System.out.println("\n\nBusinessRule::Constructing BusinessRule");
		
		this.description = description;
		
		this.lhsValue = new Value(lhsValue);
		this.operator = new Operator(operator); //TODO::This should be replaced with a call to the database to get an excisting operator
		this.rhsValues = new ArrayList<Value>();
		for (String valueString : rhsValues){
			this.rhsValues.add(new Value(valueString));
		}
		this.backEndRuleType = null; //TODO::This needs to be replaced with some way to get the backendRuleType.
		this.frontEndRuleType = new FrontEndRuleType(frontEndRuleType);
		
		this.generatedCode = new ArrayList<GeneratedCode>();
		this.generatedCode.add(new GeneratedCode(generatedCode, this.name));
		
		this.name = this.generateName(appPartRuleName);
	}
	
	public String generateName(String appPartRuleName){
		String entityAbr = lhsValue.abbreviateEntityName();
		String ruleTypeAbr = frontEndRuleType.getAbbreviation();
		
		return appPartRuleName + "_" + entityAbr + "_" + "TRG" + "_" + ruleTypeAbr + "_" + "GENERATED_NUMBER_HERE";
    	//Entity abbreviation
    	//dynamic numbering*/
	}
	
	@Override
	public String toString() {
		return "BusinessRule:\n"
				+ "id= " + id+"\n"
				+ "name= " + name+"\n" 
				+ "description= " + description + "\n" 
				+ "condition= " + condition + "\n" 
				+ "lhsValue= "+ lhsValue + "\n" 
				+ "operator= " + operator + "\n" 
				+ "rhsValues= " 	+ rhsValues + "\n" 
				+ "backEndRuleType= " + backEndRuleType + "\n"
				+ "frontEndRuleType= " + frontEndRuleType + "\n" 
				+ "generatedCode= " + generatedCode;
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

	public List<Value> getRhsValues() {
		return rhsValues;
	}

	public void setRhsValues(List<Value> rhsValues) {
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

	public List<GeneratedCode> getGeneratedCode() {
		return generatedCode;
	}

	public void setGeneratedCode(List<GeneratedCode> generatedCode) {
		this.generatedCode = generatedCode;
	}
}
