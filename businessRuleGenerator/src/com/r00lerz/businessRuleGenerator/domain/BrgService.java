package com.r00lerz.businessRuleGenerator.domain;

import java.util.List;

import com.r00lerz.ruleDef.RuleDefException;

public interface BrgService {
	
	public String generateRule(String lhsValue, String operator, List<String> rhsValues, String realPath) throws RuleDefException;
	
	
	public void activeBusinessRule(int id, String realPath) throws RuleDefException;
	
	
	public void deactivateBusinessRule(int id);
	
}
