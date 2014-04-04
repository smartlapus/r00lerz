package com.r00lerz.businessRuleGenerator.communication.struts.listeners;

import java.net.URL;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;

public class HibernateListener implements ServletContextListener {

	private Configuration config;
	private SessionFactory sessionFactory;
	private ServiceRegistry serviceRegistry;
	public static final String KEY_NAME = HibernateListener.class.getName();

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	    if ( sessionFactory != null ) {
	        sessionFactory.close();
	    }
	
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
	    System.out.println("HIBERNATELISTENER:::Setting up service factory");
		
	    
		try {
			
			config = new Configuration();
	        config.configure();
	        serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).build();
			sessionFactory = new Configuration().configure().buildSessionFactory();
			
			arg0.getServletContext().setAttribute("sessionFactory", sessionFactory);
	        Application.factory = sessionFactory;
	        System.out.println("HIBERNATELISTENER:::sessionFactory = " + Application.factory);
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}