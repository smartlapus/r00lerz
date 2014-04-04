package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection.TargetConnection;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.CodeGenerator;
import com.r00lerz.businessRuleGenerator.domain.codeGenerator.PLSQL_Generator;

public class Application {

	private int id;
	private String appName;
	private String appNameAbbreviation;

	private Set<BusinessRule> businessRules;
	private CodeGenerator codeGenerator;
	private TargetConnection targetConnection;

	public Application() {
		codeGenerator = new PLSQL_Generator();
		businessRules = new HashSet<BusinessRule>();
	}

	public String generateRule(String lhsValue, String operator,
			List<String> rhsValues, String realPath) {
		String ruleString = lhsValue + " ";
		ruleString += operator + " ";

		for (int i = 0; i < rhsValues.size(); i++) {
			ruleString += rhsValues.get(i);

			if ((rhsValues.size() == 2) && i == 0) {
				ruleString += " and ";
			} else if (rhsValues.size() > 2) {
				// code to generate list here
			}
		}

		String appPartRuleName = "BRG" + "_" + appNameAbbreviation;

		Map<String, String> generationResult = codeGenerator.generateRule(
				ruleString, realPath);
		BusinessRule generatedRule = new BusinessRule(appPartRuleName,
				ruleString, lhsValue, operator, rhsValues,
				generationResult.get("ruleType"),
				generationResult.get("generatedCode"));
		
		SessionFactory ourSessionFactory;
	    ServiceRegistry serviceRegistry;
		SessionFactory factory;
		try {
			
			Configuration configuration = new Configuration();
	        configuration.configure();
	        serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		Session session = factory.openSession();	
		Transaction tx = null;
		try{
			
			tx = session.beginTransaction();
			Application app = (Application) session.get(Application.class, 1);
			
			app.getBusinessRules().add(generatedRule);
			session.update(app);
			session.flush(); // SQL Query is generated
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}

		return generatedRule.toString();
	}

	public static Application retrieveApplicationByName(String appName) {

		// TODO::replace this block with a call to a method that returns the
		// sessionfactory
		SessionFactory factory;
		List<Application> result = null;
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			
			Query query = session
					.createQuery("FROM Application WHERE appName = :appName");
			query.setParameter("appName", appName);

			result = query.list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result.get(0);
	}

	public String toString() {
		String s = "Aplication: " + appName + id + "\n";
		for (BusinessRule br : businessRules) {
			s += br;
		}
		return s;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppNameAbbreviation() {
		return appNameAbbreviation;
	}

	public void setAppNameAbbreviation(String appNameAbbreviation) {
		this.appNameAbbreviation = appNameAbbreviation;
	}

	public Set<BusinessRule> getBusinessRules() {
		return businessRules;
	}

	public void setBusinessRules(Set<BusinessRule> businessRules) {
		this.businessRules = businessRules;
	}

}
