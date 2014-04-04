package com.r00lerz.businessRuleGenerator.domain;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory factory) {
		sessionFactory = factory;
	}

	public static SessionFactory configureSessionFactory()
			throws HibernateException {

		try {
			Configuration config = new Configuration();
			config.configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
					.applySettings(config.getProperties()).build();
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		return sessionFactory;
	}

	public static Session getSession() {
		if (sessionFactory == null) {
			sessionFactory = configureSessionFactory();
		}
		return sessionFactory.getCurrentSession();
	}

	public static void closeSessionFactory() {
		getSessionFactory().close();
	}
}
