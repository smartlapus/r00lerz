package com.r00lerz.businessRuleGenerator.communication.struts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.eclipse.xtext.validation.Issue;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.r00lerz.businessRuleGenerator.domain.BrgService;
import com.r00lerz.businessRuleGenerator.domain.BrgServiceImpl;
import com.r00lerz.ruleDef.RuleDefException;

public class DefineNewRuleAction extends ActionSupport {
	
	//In parameters
	private String lhsValue;
	private String operator;
	private List<String> rhsValues;
	private String callback;
	
	//Out parameters
	private String result;

	@Override
	public String execute() {
		String realPath = ServletActionContext.getServletContext().getRealPath("/");
		BrgService service = BrgServiceImpl.getService();
		
		String id = "";
		
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> errors = new ArrayList<String>();
		
		try {
			id = service.generateRule(lhsValue, operator, rhsValues, realPath);
			result.put("success", id);
		} catch (RuleDefException e) {
			for (Issue issue : e.getIssues()){
				errors.add(issue.getMessage());
			}
			result.put("errors", errors);
		}
		
		Gson gson = new Gson();
		this.result = gson.toJson(result);
		
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
	
	public String getResult(){
		return result;
	}
	
	public String getCallback() {
		return callback;
	}
	
	public void setCallback(String callback) {
		this.callback = callback;
	}
}
