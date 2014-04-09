package com.r00lerz.businessRuleGenerator.domain.datamodel.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.BackEndRuleType;

public class BackEndRuleTypeDAO {
	Session currentSession;

	public BackEndRuleTypeDAO() {
		currentSession = HibernateUtil.getSession();
	}

	public BackEndRuleType retrieveTypeByName(String name) throws IndexOutOfBoundsException{
		List<BackEndRuleType> result = null;
		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("FROM BackEndRuleType WHERE lower(name) = :name");
		query.setParameter("name", name.toLowerCase());

		result = query.list();
		return result.get(0);
		
	
	}
}
