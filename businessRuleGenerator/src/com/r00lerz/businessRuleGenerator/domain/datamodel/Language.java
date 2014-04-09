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
	private int id; // Hibernate is mapped with variable names. id is what our column name is.
	private String name;

	public Language() { // PMD: empty constructors are required for Hibernate
	}

	public Language(final String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}
}
