package com.r00lerz.businessRuleGenerator.domain.datamodel;

public class BackEndRuleType {
	private int id;
	private String name;
	
	public BackEndRuleType(){}
	
	public BackEndRuleType(String name){
		this.name = name;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
