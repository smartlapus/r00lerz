package com.r00lerz.businessRuleGenerator.domain.datamodel_old;

public class Operator {
	
	private String name;
	
	public Operator(String operator) {
		this.name = operator;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
