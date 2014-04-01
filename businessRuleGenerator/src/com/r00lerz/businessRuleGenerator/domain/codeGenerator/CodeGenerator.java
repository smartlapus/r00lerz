package com.r00lerz.businessRuleGenerator.domain.codeGenerator;

public interface CodeGenerator {
	public String generateRule(String rule, String realPath);
	public String generateRuleSet(String ruleSet);
}
