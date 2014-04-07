package com.r00lerz.businessRuleGenerator.domain.datamodel.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;
import com.r00lerz.businessRuleGenerator.domain.datamodel.BackEndRuleType;
import com.r00lerz.businessRuleGenerator.domain.datamodel.BusinessRule;

public class BusinessRuleDAO {
	Session currentSession;

	public BusinessRuleDAO() {
		currentSession = HibernateUtil.getSession();
	}

	public long retrieveConsecutiveNumber(String entity_string) {
		List result = null;
		Query query = currentSession.createQuery("SELECT count(entity) FROM BusinessRule WHERE lower(entity) = :entity");
		query.setParameter("entity", entity_string.toLowerCase());
		result = query.list();
		
		return (long) result.get(0);
	}
	
	public BusinessRule retrieveById(int id){
		return (BusinessRule) currentSession.get(BusinessRule.class, id);
	}
	
	public List<BusinessRule> retrieveRulesForActivation(String entity){
		Query query = currentSession.createQuery("FROM BusinessRule WHERE lower(entity) = :entity AND status = 1");
		query.setParameter("entity", entity.toLowerCase());
		return query.list();
	}
}
