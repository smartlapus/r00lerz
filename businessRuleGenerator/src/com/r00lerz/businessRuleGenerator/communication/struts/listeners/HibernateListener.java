package com.r00lerz.businessRuleGenerator.communication.struts.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;

public class HibernateListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		HibernateUtil.closeSessionFactory();
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
	    HibernateUtil.configureSessionFactory();
	}
}