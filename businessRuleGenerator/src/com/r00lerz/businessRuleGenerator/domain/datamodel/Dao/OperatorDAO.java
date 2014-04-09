package com.r00lerz.businessRuleGenerator.domain.datamodel.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Operator;

public class OperatorDAO {
	Session currentSession;

	public OperatorDAO() {
		currentSession = HibernateUtil.getSession();
	}

	public Operator retrieveOperatorByName(String name) throws IndexOutOfBoundsException{
		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("FROM Operator WHERE lower(name) = :name");
		query.setParameter("name", name.toLowerCase());
		List<Operator> result = query.list();
		return result.get(0);
	}
}
