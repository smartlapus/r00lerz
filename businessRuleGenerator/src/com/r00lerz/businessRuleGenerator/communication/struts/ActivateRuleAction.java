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

public class ActivateRuleAction extends ActionSupport {
	// names of parameters here
	private int id;
	private String result;

	@Override
	public String execute() {
		String realPath = ServletActionContext.getServletContext().getRealPath("/");
		BrgService service = BrgServiceImpl.getService();

		Map<String, Object> result = new HashMap<String, Object>();
		try {//TODO::THINK OF A WAY TO HANDLE THE EXCEPTION
			service.activeBusinessRule(id, realPath);
			result.put("success", id);
		} catch (RuleDefException e) {
			e.printStackTrace();
			List<String> errors = new ArrayList<String>();
			for (Issue issue : e.getIssues()){
				System.out.println(issue);
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

	// seters/getters for parameters here
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
