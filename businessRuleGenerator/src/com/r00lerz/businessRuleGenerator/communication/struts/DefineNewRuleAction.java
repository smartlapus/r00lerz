package com.r00lerz.businessRuleGenerator.communication.struts;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;

public class DefineNewRuleAction extends ActionSupport {

	private String lhsValue;
	private String rhsValue1;
	private String rhsValue2;
	private String operator;

	@Override
	public String execute() {
		
		Map<String, String> businessRuleMap = new HashMap<String, String>();
		businessRuleMap.put("lhsValue", lhsValue);
		businessRuleMap.put("rhsValue1", rhsValue1);
		businessRuleMap.put("rhsValue2", rhsValue2);
		businessRuleMap.put("operator", operator);
		
		Application application = Application.getInstance();
		
		application.generateRule(businessRuleMap);
		
		return ActionSupport.SUCCESS;
	}

	@Override
	public void validate() {
		// validation rules here
	}
	
	public void setLhsValue(String lhsValue){
		this.lhsValue = lhsValue;
	}
	
	public void setOperator(String operator){
		this.operator = operator;
	}
	
	public void setRhsValue1(String rhsValue1){
		this.rhsValue1 = rhsValue1;
	}
	
	public void setRhsValue2(String rhsValue2){
		this.rhsValue2 = rhsValue2;
	}
}
