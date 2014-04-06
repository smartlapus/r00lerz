package com.r00lerz.businessRuleGenerator.domain.codeGenerator;

import java.util.Map;

import com.r00lerz.ruleDef.RuleDefException;

public interface CodeGenerator {
	public Map<String,String> generateRule(String rule, String realPath) throws RuleDefException;
	public String generateRuleSet(String ruleSet);
}
