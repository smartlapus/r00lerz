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
	
	public void generateRule(Map businessRuleMap){
		String ruleString = "";
		ruleString+= businessRuleMap.get("lhsValue");
		ruleString+= businessRuleMap.get("operator");
		ruleString+= businessRuleMap.get("rhsValue1");
		ruleString+= businessRuleMap.get("rhsValue2");
	}
}
