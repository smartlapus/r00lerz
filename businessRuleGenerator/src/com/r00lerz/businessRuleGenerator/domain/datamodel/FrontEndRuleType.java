package com.r00lerz.businessRuleGenerator.domain.datamodel;

public class FrontEndRuleType {
	private String name;
	private String abbreviation;
	
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
}
