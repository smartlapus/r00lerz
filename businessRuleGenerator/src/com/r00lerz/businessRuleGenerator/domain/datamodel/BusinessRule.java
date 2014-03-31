package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.List;

public class BusinessRule {
	
	private String name;
	private String description;
	private String condition;
	
	private Value lhsValue;
	private Operator operator;
	private List<Value> rhsValue;
	
	private BackEndRuleType backEndRuleType;
	private FrontEndRuleType frontEndRuleType;
	private List<GeneratedCode> generatedCode;

}
