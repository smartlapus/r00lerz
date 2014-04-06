package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.io.Serializable;

import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.LanguageDAO;

public class GeneratedCode implements Serializable{
	
	private int id;
	private String generatedCode;
	private Language language;
	
	public GeneratedCode(){}
	
	public GeneratedCode(String generatedCode, String businessRuleName) {
		this.generatedCode = "--Evaluates businessrule: " + businessRuleName + "\n";
		this.generatedCode += generatedCode;
		this.language = new LanguageDAO().retrieveLanguageByName("PL/SQL");
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
