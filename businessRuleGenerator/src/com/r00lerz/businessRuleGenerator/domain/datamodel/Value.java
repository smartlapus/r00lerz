package com.r00lerz.businessRuleGenerator.domain.datamodel;

public class Value {

	private String value;
	private ValueType type;

	public Value(String valueString) {
		this.value = valueString;
		// TODO: Something to set the valueType;
	}

	@Override
	public String toString() {
		return value;
	}
}
