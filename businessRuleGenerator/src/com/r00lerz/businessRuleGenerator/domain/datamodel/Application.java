package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection.TargetConnection;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.CodeGenerator;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.PLSQL_Generator;



public class Application {
	
	private int id;
	private String appName;
	private String appNameAbbreviation;
	
	private Set<BusinessRule> businessRules;
	private CodeGenerator codeGenerator;
	private TargetConnection targetConnection;
	
	public Application(){
		codeGenerator = new PLSQL_Generator();
		businessRules = new HashSet<BusinessRule>();
		
		this.appName = "ApplicationNameHere";
		this.appNameAbbreviation = "ANH";
	}
	
	public String generateRule(String lhsValue, String operator, List<String> rhsValues, String realPath){
		String ruleString = lhsValue + " ";
		ruleString+= operator + " ";
		
		for (int i = 0; i < rhsValues.size(); i++){
			ruleString+= rhsValues.get(i);
			
			if ((rhsValues.size() == 2) && i == 0){
				ruleString += " and ";
			}
			else if (rhsValues.size() > 2){
				//code to generate list here
			}
		}
		
		String appPartRuleName = "BRG" + "_" + appNameAbbreviation;
		
		Map<String,String> generationResult = codeGenerator.generateRule(ruleString, realPath);
		BusinessRule generatedRule = new BusinessRule(appPartRuleName, ruleString, lhsValue, operator, rhsValues, generationResult.get("ruleType"), generationResult.get("generatedCode"));
		
		return generatedRule.toString();
	}
	
	public String toString(){
		String s = "";
		for(BusinessRule br : businessRules){
			s += br;
		}
		return s;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppNameAbbreviation() {
		return appNameAbbreviation;
	}

	public void setAppNameAbbreviation(String appNameAbbreviation) {
		this.appNameAbbreviation = appNameAbbreviation;
	}

	public Set<BusinessRule> getBusinessRules() {
		return businessRules;
	}

	public void setBusinessRules(Set<BusinessRule> businessRules) {
		this.businessRules = businessRules;
	}
	
}
