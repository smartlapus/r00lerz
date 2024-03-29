package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;

public class FrontEndRuleType {
	private int id;
	private String name;
	private String abbreviation;

	public FrontEndRuleType() {
	}

	public FrontEndRuleType(final String frontEndRuleType) {
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

	public String getAbbreviation() {
		return abbreviation;
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

	public void setAbbreviation(final String abbreviation) {
		this.abbreviation = abbreviation;
	}
}
