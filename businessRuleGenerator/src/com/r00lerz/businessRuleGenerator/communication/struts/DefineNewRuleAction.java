package com.r00lerz.businessRuleGenerator.communication.struts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;

public class DefineNewRuleAction extends ActionSupport {

	private String lhsValue;
	private String operator;
	private List<String> rhsValues;
	

	@Override
	public String execute() {
		
		Map<String, String> businessRuleMap = new HashMap<String, String>();
		Application application = Application.getInstance();
		
		businessRuleMap.put("lhsValue", lhsValue);
		businessRuleMap.put("operator", operator);
		
		int index = 1;
		for (String value : rhsValues){
			businessRuleMap.put("rhsValue"+index, value);
			index++;
		}
		
		application.generateRule(lhsValue, operator, rhsValues);
		
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
	
	public void setRhsValues(List<String> rhsValues){
		this.rhsValues = rhsValues;
	}
}
