package com.r00lerz.businessRuleGenerator.domain.datamodel.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Language;

public class LanguageDAO {
	Session currentSession;

	public LanguageDAO() {
		currentSession = HibernateUtil.getSession();
	}

	public Language retrieveLanguageByName(String name) {
		Session session = HibernateUtil.getSession();

		Query query = session.createQuery("FROM Language WHERE name = :name");
		query.setParameter("name", name);
		List<Language> result = query.list();
		return result.get(0);
	}
}
