package com.r00lerz.businessRuleGenerator.domain.datamodel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DatabaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		  		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); // What configuration file are you using.
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		TestingClass myTest = new TestingClass();
		myTest.setName("Martin");
			
		s.save(myTest);  	// This would save the object in session
		s.flush();  	// SQL Query is generated
		tx.commit();	// Commits the transaction
		s.close();		// Session is closed
		

	}

}
