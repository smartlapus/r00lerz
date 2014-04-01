package com.r00lerz.businessRuleGenerator.domain.codeGenerator;

import java.util.Map;

public interface CodeGenerator {
	public Map<String,String> generateRule(String rule, String realPath);
	public String generateRuleSet(String ruleSet);
}
