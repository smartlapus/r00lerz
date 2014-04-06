package com.r00lerz.businessRuleGenerator.domain.datamodel.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.ValueType;

public class ValueTypeDAO {
	Session currentSession;

	public ValueTypeDAO() {
		currentSession = HibernateUtil.getSession();
	}

	public ValueType retrieveTypeByName(String name) {

		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("FROM ValueType WHERE lower(name) = :name");
		query.setParameter("name", name.toLowerCase());
		List<ValueType> result = query.list();
		return result.get(0);
	}
}
