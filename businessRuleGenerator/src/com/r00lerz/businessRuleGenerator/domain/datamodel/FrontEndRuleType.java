package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FrontEndRuleType {
	private int id;
	private String name;
	private String abbreviation;

	public FrontEndRuleType() {
	}

	public FrontEndRuleType(String frontEndRuleType) {
		this.name = frontEndRuleType;
		this.generateAbbreviation();
	}

	@Override
	public String toString() {
		return name;
	}

	private void generateAbbreviation() {
		switch (name) {
		case "Attribute Range Rule":
			abbreviation = "ARR";
			break;
		case "Attribute Compare Rule":
			abbreviation = "ACR";
			break;
		case "Tuple Compare Rule":
			abbreviation = "TCR";
			break;
		default:
			abbreviation = "ERR";
		}
	}

	public static FrontEndRuleType retrieveTypeByName(String name) {

		// TODO::replace this block with a call to a method that returns the
		// sessionfactory
		SessionFactory factory;
		List<FrontEndRuleType> result = null;
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
					.createQuery("FROM FrontEndRuleType WHERE name = :name");
			query.setParameter("name", name);

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

	public String getAbbreviation() {
		return abbreviation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
}
