package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ValueType {
	private String name;
	private int id;
	
	public ValueType(){}
	
	public ValueType(String name){
		this.name = name;
	}
	
	public static ValueType retrieveTypeByName(String name){
		
		//TODO::replace this block with a call to a method that returns the sessionfactory
		SessionFactory factory;
		List<ValueType> result = null;
		try{
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		Session session = factory.openSession();
		Transaction tx = null;
	
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM ValueType WHERE name = :name");
			query.setParameter("name", name);
			
			result = query.list();
			
			tx.commit();
		}catch (HibernateException e) {
		if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return result.get(0);
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
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValueType other = (ValueType) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
