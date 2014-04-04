package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;

public class Language implements Serializable {
	private int id;
	private String name;

	public Language() {
	}

	public Language(String name) {
		this.name = name;
	}

	public static Language retrieveLanguageByName(String name) {
		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("FROM Language WHERE name = :name");
		query.setParameter("name", name);
		List<Language> result = query.list();
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
