package com.r00lerz.businessRuleGenerator.domain.datamodel.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.BackEndRuleType;

public class BusinessRuleDAO {
	Session currentSession;

	public BusinessRuleDAO() {
		currentSession = HibernateUtil.getSession();
	}

	public long retrieveConsecutiveNumber(String entity_string) {
		List result = null;
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("SELECT count(entity) FROM BusinessRule WHERE lower(entity) = :entity");
		query.setParameter("entity", entity_string.toLowerCase());
		result = query.list();
		
		return (long) result.get(0);
		
	
	}
}
