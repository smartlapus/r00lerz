package com.r00lerz.businessRuleGenerator.communication.struts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;

public class DefineNewRuleAction extends ActionSupport {

	private String lhsValue;
	private String operator;
	private List<String> rhsValues;
	

	@Override
	public String execute() {
		String realPath = ServletActionContext.getServletContext().getRealPath("/");
		
		//Skipp call, needs to be fixed
		Application application = Application.getInstance();

		application.generateRule(lhsValue, operator, rhsValues, realPath);
		
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
