package com.r00lerz.businessRuleGenerator.domain.datamodel.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.FrontEndRuleType;

public class FrontEndRuleTypeDAO {
	Session currentSession;

	public FrontEndRuleTypeDAO() {
		currentSession = HibernateUtil.getSession();
	}

	public FrontEndRuleType retrieveTypeByName(String name) {
		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("FROM FrontEndRuleType WHERE name = :name");
		query.setParameter("name", name);
		List<FrontEndRuleType> result = query.list();
		return result.get(0);
		
	
	}
}
