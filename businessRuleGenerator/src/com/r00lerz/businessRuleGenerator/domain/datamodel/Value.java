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
	
	protected String parseEntityName(){
		//TODO::Check if valueType = dynamic
		String entity = value.split("\\.")[0];
		return entity;
	}
	
	protected String parseAttributeName(){
		//TODO::Check if valueType = dynamic
		String attribute = value.split("\\.")[1];
		return attribute;
	}
	
	protected String abbreviateEntityName(){
		return parseEntityName().substring(0,3).toUpperCase();
	}
	
	protected String abbreviateAttributeName(){
		return parseAttributeName().substring(0,3).toUpperCase();
	}

	public static void main(String[]args){
		Value v = new Value("Entity.Attribute");
		
		System.out.println(v.abbreviateEntityName());
	}
}
