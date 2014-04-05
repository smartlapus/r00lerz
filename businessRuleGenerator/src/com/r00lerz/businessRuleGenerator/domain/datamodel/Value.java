package com.r00lerz.businessRuleGenerator.domain.datamodel;

import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.ValueTypeDAO;

public class Value {

	private int id;
	private String value;
	private ValueType type;

	public Value(){}
	
	public Value(String valueString) {
		this.value = valueString;
		this.type = new ValueTypeDAO().retrieveTypeByName("Static value");
		System.out.println(value + " " + type);
		// TODO: A way to dynamicly retrieve the value type
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
