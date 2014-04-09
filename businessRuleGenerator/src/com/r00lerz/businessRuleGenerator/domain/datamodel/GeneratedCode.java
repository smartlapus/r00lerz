package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.io.Serializable;

import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.LanguageDAO;

public class GeneratedCode implements Serializable{
	
	private int id; // Hibernate is mapped with variable names. id is what our column name is.
	private String generatedCode; // PMD: it's clear in the context.
	private Language language;
	
	public GeneratedCode(){} // PMD: empty constructors are required for Hibernate
	
	public GeneratedCode(final String generatedCode) {
		this.generatedCode = generatedCode;
		this.language = new LanguageDAO().retrieveLanguageByName("PL/SQL");
	}
	
	@Override
	public String toString() {
		return generatedCode;
	}

	public String getBusinessRuleCode() {
		return generatedCode;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(final Language language) {
		this.language = language;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getGeneratedCode() {
		return generatedCode;
	}

	public void setGeneratedCode(final String generatedCode) {
		this.generatedCode = generatedCode;
	}
}
