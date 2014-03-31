package com.r00lerz.businessRuleGenerator.domain;

import java.util.HashMap;

public interface BrgService {
	public void generateRule(HashMap businessRule);
	
	
	public void activeBusinessRule(int id);
	
	
	public void deactivateBusinessRule(int id);
	
}
