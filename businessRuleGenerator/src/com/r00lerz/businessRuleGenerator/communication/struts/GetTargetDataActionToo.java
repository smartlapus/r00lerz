package com.r00lerz.businessRuleGenerator.communication.struts;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class GetTargetDataActionToo extends ActionSupport{
	String JSON = "";
	Gson gson = new Gson();
	
	//names of parameters here
	
		@Override
		public String execute(){
			//action here
			
			HashMap<String, String> map = new HashMap<String, String>(); 
			map.put("test", "test");
			
			setJSON(gson.toJson(map));
			
			return ActionSupport.SUCCESS;
		}
		
		@Override
		public void validate() {
			//validation rules here
		}
		
		public String getJSON() {
			return JSON;
		}
		
		public void setJSON(String JSON) {
			this.JSON = JSON;
		}
}
