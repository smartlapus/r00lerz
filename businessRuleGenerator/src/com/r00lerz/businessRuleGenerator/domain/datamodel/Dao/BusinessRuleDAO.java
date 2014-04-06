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

	public int retrieveConsecutiveNumber() {
		List<Integer> result = null;
		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("count(Entity) FROM BusinessRule");
		
		result = query.list();
		return result.get(0);
		
	
	}
}
