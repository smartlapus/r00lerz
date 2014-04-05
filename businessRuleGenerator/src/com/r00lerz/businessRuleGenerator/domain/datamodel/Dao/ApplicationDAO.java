package com.r00lerz.businessRuleGenerator.domain.datamodel.Dao;

import org.hibernate.Session;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;

public class ApplicationDAO {
	Session currentSession;

	public ApplicationDAO() {
		currentSession = HibernateUtil.getSession();
	}

	public Application getApplicationById(int itemId) {
		return (Application) currentSession.get(Application.class, itemId);
	}
}
