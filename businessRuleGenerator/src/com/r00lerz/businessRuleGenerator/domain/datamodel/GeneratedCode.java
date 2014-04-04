package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.io.Serializable;

public class GeneratedCode implements Serializable{
	
	private int id;
	private String generatedCode;
	private Language language;
	
	public GeneratedCode(){}
	
	public GeneratedCode(String generatedCode, String language) {
		//TODO:: add the name to the generated code
		//TODO:: set the language of the generated code
		this.generatedCode = generatedCode;
		this.language = Language.retrieveLanguageByName(language);
	}
	
	@Override
	public String toString() {
		return generatedCode;
	}

	public String getBusiness_rule_code() {
		return generatedCode;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGeneratedCode() {
		return generatedCode;
	}

	public void setGeneratedCode(String generatedCode) {
		this.generatedCode = generatedCode;
	}
}
