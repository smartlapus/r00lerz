package com.r00lerz.businessRuleGenerator.domain.datamodel;

import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.ValueTypeDAO;

public class Value {

	private int id;
	private String value;
	private ValueType type;

	public Value(){}
	
	public Value(String valueString) {
		this.value = valueString;
		this.type = evaluateValueType(valueString);
	}

	private ValueType evaluateValueType(String valueString){
		ValueType resultType = null;
		if (valueString.length() > 0 && (Character.isDigit(valueString.charAt(0)) || !value.contains("."))){
			resultType = new ValueTypeDAO().retrieveTypeByName("static value");
		}
		else if (valueString.length() > 2 && (Character.isAlphabetic(valueString.charAt(0)) && valueString.contains("."))){
			resultType = new ValueTypeDAO().retrieveTypeByName("dynamic value");
		}
		return resultType;
	}
	
	@Override
	public String toString() {
		return value + " VALUE_TYPE: " + type;
	}
	
	protected String parseEntityName(){
		String entity = null;
		if(this.type.isDynamic()){
			entity = value.split("\\.")[0];
			entity = entity.replace("DEMO_", ""); // Just removing the DEMO_ part for now.
		}
		return entity;
	}
	
	protected String parseAttributeName(){
		String attribute = null;
		if(this.type.isDynamic()){
			attribute = value.split("\\.")[1];
		}
		return attribute;
	}
	
	public String abbreviateEntityName(){
		String abbr = parseEntityName().substring(0,3).toUpperCase();
		return abbr;
	}
	
	
	protected String abbreviateAttributeName(){
		return parseAttributeName().substring(0,3).toUpperCase();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ValueType getType() {
		return type;
	}

	public void setType(ValueType type) {
		this.type = type;
	}
}
