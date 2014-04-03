package com.r00lerz.businessRuleGenerator.domain.datamodel_old;

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
	
	public BusinessRule(String currentName, String description, String lhsValue,String operator, List<String> rhsValues, String frontEndRuleType, String generatedCode){
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
		
		this.name = this.generateName(currentName);
	}
	
	public String generateName(String currentName){
		return currentName + "_" + frontEndRuleType.getAbbreviation();
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
	
	
	
}
