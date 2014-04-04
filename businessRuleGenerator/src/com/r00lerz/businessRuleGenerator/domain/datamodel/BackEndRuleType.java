package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;

public class BackEndRuleType {
	private int id;
	private String name;
	
	public BackEndRuleType(){}
	
	public BackEndRuleType(String name){
		this.name = name;
	}
	
	public static BackEndRuleType retrieveTypeByName(String name) {
		List<BackEndRuleType> result = null;
		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("FROM BackEndRuleType WHERE name = :name");
		query.setParameter("name", name);

		result = query.list();
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
	
}
