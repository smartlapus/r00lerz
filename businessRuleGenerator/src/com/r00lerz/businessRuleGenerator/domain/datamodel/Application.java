package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.List;
import java.util.Map;

import com.r00lerz.businessRuleGenerator.connection.TargetConnection;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.CodeGenerator;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.PLSQL_Generator;

public class Application {
	
	private static Application applicationInstance;
	
	private String brgNaam;
	private String appNaam;
	
	private List businessRules;
	private CodeGenerator codeGenerator;
	private TargetConnection targetConnection;
	
	public Application(){
		codeGenerator = new PLSQL_Generator();
	}
	
	public void generateRule(String lhsValue, String operator, List<String> rhsValues, String realPath){
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
		
		Map<String,String> generationResult = codeGenerator.generateRule(ruleString, realPath);
		BusinessRule generatedRule = new BusinessRule(ruleString, lhsValue, operator, rhsValues, generationResult.get("ruleType"), generationResult.get("generatedCode"));
	}
}
