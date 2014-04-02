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
	
	public BusinessRule(String description, String lhsValue,String operator, List<String> rhsValues, String frontEndRuleType, String generatedCode){
		System.out.println("\n\nBusinessRule::Constructing BusinessRule");
		
		this.name = "we need to add a method to generate the name";
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
	}
	
	public String generateName(String currentName){
		return "we need to implement name generation";
		
		/*TODO:: Add name to code somewhere :: -evaluates business rule «r.generateName»
    	//DYNAMIC APP NAME
    	//Entity abbreviation
    	//Implement rule type retrieval for other rule types
    	//dynamic numbering*/
		//
		//"BRG_APPNAME_"+r.lhs_value.entity.name.substring(0,3).toUpperCase+"_TRG_" +
		//case r.attributeRangeRule : "ARR"
		//case r.attributeCompareRule : "ACR"
		//case r.tupleCompareRule : "TCR"
		//default : "ERROR"
	}
	
	@Override
	public String toString() {
		return "br to string needs to be generated";
	}
}
