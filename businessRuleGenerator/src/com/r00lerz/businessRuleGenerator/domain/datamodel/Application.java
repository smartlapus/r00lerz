package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection.TargetConnection;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.CodeGenerator;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.PLSQL_Generator;



public class Application {
	
	private static Application applicationInstance;
	
	private String appName;
	private String appNameAbbreviation;
	
	private List<BusinessRule> businessRules;
	private CodeGenerator codeGenerator;
	private TargetConnection targetConnection;
	
	public Application(){
		codeGenerator = new PLSQL_Generator();
		businessRules = new ArrayList<BusinessRule>();
		
		this.appName = "ApplicationNameHere";
		this.appNameAbbreviation = "ANH";
	}
	
	public String generateRule(String lhsValue, String operator, List<String> rhsValues, String realPath){
		String ruleString = lhsValue + " ";
		ruleString+= operator + " ";
		
		for (int i = 0; i < rhsValues.size(); i++){
			ruleString+= rhsValues.get(i);
			
			if ((rhsValues.size() == 2) && i == 0){
				ruleString += " and ";
			}
			else if (rhsValues.size() > 2){
				//code to generate list here
			}
		}
		
		String appPartRuleName = "BRG" + "_" + appNameAbbreviation;
		
		Map<String,String> generationResult = codeGenerator.generateRule(ruleString, realPath);
		BusinessRule generatedRule = new BusinessRule(appPartRuleName, ruleString, lhsValue, operator, rhsValues, generationResult.get("ruleType"), generationResult.get("generatedCode"));
		
		return generatedRule.toString();
	}
	
	public static void main(String[]args){

		
		ArrayList<String> rhsValues = new ArrayList<String>();
		rhsValues.add("18");
		BusinessRule br = new BusinessRule("bla_bla_bla_01", "person.age must be bigger than 18", "person.age", "must be bigger than", rhsValues, "Attribute compare rule", "some generated code here");
		Application app = new Application();
		app.businessRules.add(br);
		System.out.println(app);
		//TODO::Some code to persist the rule here.
		
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
		applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(app);  //	This would save the object in session
		s.flush();  	//SQL Query is generated
		tx.commit();	//Commits the transaction
		s.close();		//Session is closed
		
	}
	
	public String toString(){
		String s = "";
		for(BusinessRule br : businessRules){
			s += br;
		}
		return s;

	}
	
}
