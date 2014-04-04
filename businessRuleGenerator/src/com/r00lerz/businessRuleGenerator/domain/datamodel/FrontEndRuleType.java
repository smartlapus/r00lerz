package com.r00lerz.businessRuleGenerator.domain.datamodel;

public class FrontEndRuleType {
	private int id;
	private String name;
	private String abbreviation;
	
	public FrontEndRuleType(){}
	
	public FrontEndRuleType(String frontEndRuleType) {
		this.name = frontEndRuleType;
		this.generateAbbreviation();
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	private void generateAbbreviation(){
		switch (name) {
		case "Attribute Range Rule":	abbreviation = "ARR";
										break;
		case "Attribute Compare Rule":	abbreviation = "ACR";
										break;
		case "Tuple Compare Rule":		abbreviation = "TCR";
										break;
		default:						abbreviation = "ERR";
		}
	}
	
	public String getAbbreviation(){
		return abbreviation;
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

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
}
