package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;

public class BackEndRuleType {
	private int id;
	private String name;
	private Set<Operator> allowedOperators;
	
	public BackEndRuleType(){
		this.allowedOperators = new HashSet<Operator>();
	}
	
	public BackEndRuleType(String name){
		super();
		this.name = name;
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

	public Set<Operator> getAllowedOperators() {
		return allowedOperators;
	}

	public void setAllowedOperators(Set<Operator> allowedOperators) {
		this.allowedOperators = allowedOperators;
	}
}
