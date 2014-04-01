package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.List;

public class BusinessRule {
	
	private String name;
	private String description;
	private BusinessRule condition;
	
	private Value lhsValue;
	private Operator operator;
	private List<Value> rhsValues;
	
	private BackEndRuleType backEndRuleType;
	private FrontEndRuleType frontEndRuleType;
	private List<GeneratedCode> generatedCode;
	
	public BusinessRule(String name, String lhsValue,String operator, List<String> rhsValues, String backEndRuleType, String frontEndRuleType, String generatedCode){
		System.out.println("\n\nBusinessRule::Constructing BusinessRule");
		System.out.println("Name = "+name);
		System.out.println("LhsValue = " + lhsValue);
		System.out.println("Operator = " + operator);
		System.out.println("RhsValues = " + rhsValues);
		System.out.println("BackendRuleType = " + backEndRuleType);
		System.out.println("FrontendRuleType = " + frontEndRuleType);
		System.out.println("GeneratedCode = \n" + generatedCode);
	}

}
