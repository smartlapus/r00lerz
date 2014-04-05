package com.r00lerz.businessRuleGenerator.communication.struts;

import com.opensymphony.xwork2.ActionSupport;

public class ActiveRuleAction extends ActionSupport { // implements UserAware

	// names of parameters here

	@Override
	public String execute() {
		// action here
		return ActionSupport.SUCCESS;
	}

	@Override
	public void validate() {
		// validation rules here
	}

	// seters/getters for parameters here

}
