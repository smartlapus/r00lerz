package com.r00lerz.businessRuleGenerator.domain.datamodel;

public class FrontEndRuleType {
	private String name;
	private String abbreviation;
	
	public FrontEndRuleType(String frontEndRuleType) {
		this.name = frontEndRuleType;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
