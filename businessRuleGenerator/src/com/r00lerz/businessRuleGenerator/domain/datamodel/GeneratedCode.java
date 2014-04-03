package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.io.Serializable;

public class GeneratedCode implements Serializable{
	private String business_rule_code;
	
	private Language language;
	
	public GeneratedCode(String generatedCode, String name) {
		//TODO:: add the name to the generated code
		//TODO:: set the language of the generated code
		this.business_rule_code = generatedCode;
	}
	
	@Override
	public String toString() {
		return business_rule_code;
	}

	public String getBusiness_rule_code() {
		return business_rule_code;
	}

	public void setBusiness_rule_code(String business_rule_code) {
		this.business_rule_code = business_rule_code;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
}
