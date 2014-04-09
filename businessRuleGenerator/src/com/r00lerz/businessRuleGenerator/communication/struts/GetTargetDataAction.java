package com.r00lerz.businessRuleGenerator.communication.struts;

import java.util.ArrayList;
import java.util.Map;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection.OracleTargetConnection;
import com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection.TargetConnection;

public class GetTargetDataAction extends ActionSupport{
	String JSON = "";
	Gson gson = new Gson();
	String callback = "";
	
	//names of parameters here
	
		@Override
		public String execute(){
			
			Map<String, ArrayList<String>> target = null;
			
			try {
				TargetConnection connection = new OracleTargetConnection();
				target = connection.getTargetData();
			} catch(Exception e) {
				e.printStackTrace();
			}
			if(target != null) {
				setJSON(gson.toJson(target));
			}

			
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
		
		public String getCallback() {
			return callback;
		}
		
		public void setCallback(String callback) {
			this.callback = callback;
		}
}