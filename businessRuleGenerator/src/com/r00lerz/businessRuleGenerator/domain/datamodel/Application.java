package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.List;
import java.util.Map;

import com.r00lerz.businessRuleGenerator.connection.TargetConnection;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.CodeGenerator;

public class Application {
	
	private static Application applicationInstance;
	
	private String brgNaam;
	private String appNaam;
	
	private List businessRules;
	private CodeGenerator codeGenerator;
	private TargetConnection targetConnection;
	
	private Application(){
	}
	
	public static Application getInstance(){
		if(applicationInstance == null){
			applicationInstance = new Application();
		}
		return applicationInstance;
	}
	
	public void generateRule(String lhsValue, String operator, List<String> rhsValues){
		String ruleString = lhsValue + " ";
		ruleString+= operator + " ";
		for (int i = 0; i < rhsValues.size(); i++){
			ruleString+= rhsValues.get(i);
			if ((rhsValues.size() == 2) && i == 0){
				ruleString += " and ";
			}
		}
		
		System.out.println(ruleString);
	}
}
