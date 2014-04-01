package com.r00lerz.businessRuleGenerator.domain;

import java.util.List;

public interface BrgService {
	
	public void generateRule(String lhsValue, String operator, List<String> rhsValues, String realPath);
	
	
	public void activeBusinessRule(int id);
	
	
	public void deactivateBusinessRule(int id);
	
}
