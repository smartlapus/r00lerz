package com.r00lerz.businessRuleGenerator.communication.struts;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.r00lerz.businessRuleGenerator.domain.BrgService;
import com.r00lerz.businessRuleGenerator.domain.BrgServiceImpl;
import com.r00lerz.ruleDef.RuleDefException;

public class ActivateRuleAction extends ActionSupport { // implements UserAware

	// names of parameters here
	private int id;

	@Override
	public String execute() {
		String realPath = ServletActionContext.getServletContext().getRealPath("/");
		BrgService service = BrgServiceImpl.getService();
		
		String result = "";
		try {//TODO::THINK OF A WAY TO HANDLE THE EXCEPTION
			service.activeBusinessRule(id, realPath);
		} catch (RuleDefException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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