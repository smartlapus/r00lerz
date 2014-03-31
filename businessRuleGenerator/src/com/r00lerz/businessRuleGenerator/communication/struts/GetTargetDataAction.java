package com.r00lerz.businessRuleGenerator.communication.struts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import oracle.jdbc.pool.OracleDataSource;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class GetTargetDataAction extends ActionSupport{
	String JSON = "";
	Gson gson = new Gson();
	String jsoncallback = "";
	
	//names of parameters here
	
		@Override
		public String execute(){
			//action here
			
			HashMap<String, ArrayList<String>> target = new HashMap<String, ArrayList<String>>();
			Connection connection = null;
			
			try {
				OracleDataSource ds = new OracleDataSource();

				ds.setDriverType("thin");
				ds.setServerName("ondora01.hu.nl");
				ds.setServiceName("cursus01.hu.nl");
				ds.setNetworkProtocol("tcp");
				ds.setDatabaseName("tho7_2013_2a_team4_target");
				ds.setPortNumber(8521);
				ds.setUser("tho7_2013_2a_team4_target");
				ds.setPassword("tho7_2013_2a_team4");

				connection = ds.getConnection();
			} catch (SQLException e) {
				// Could not connect to database
			}
			
			PreparedStatement statement = null;
			try {
				statement = connection.prepareStatement("select * from tables_columns");
				
				ResultSet results = statement.executeQuery();
				
				while(results.next()) {
					String table = results.getString("table_name");
					String column = results.getString("column_name");
					
					if(target.containsKey(table)) {
						ArrayList<String> columns = target.get(table);
						if(!columns.contains(column)) {
							columns.add(column);
						}
					} else {
						ArrayList<String> columns = new ArrayList<String>(Arrays.asList(column));
						target.put(table, columns);
					}
				}

			} catch(SQLException e){
				// Could not execute statement 
			}
			
			try {
				statement.close();
				connection.close();
			} catch(Exception e) {
				// Could not close statement & connection
			}
			setJSON(gson.toJson(target));

			
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
		
		public String getJsoncallback() {
			return jsoncallback;
		}
		
		public void setJsoncallback(String jsoncallback) {
			this.jsoncallback = jsoncallback;
		}
}
