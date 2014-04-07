package com.r00lerz.businessRuleGenerator.domain;

import java.util.List;

import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.ApplicationDAO;
import com.r00lerz.ruleDef.RuleDefException;

public class BrgServiceImpl implements BrgService {

	private static BrgService instance;
	private Application application;

	public static BrgService getService() {
		if (instance == null) {
			instance = new BrgServiceImpl();
		}
		return instance;
	}
	
	private BrgServiceImpl(){
		application = new ApplicationDAO().getApplicationById(1);
	};

	@Override
	public String generateRule(String lhsValue, String operator, List<String> rhsValues, String realPath) throws RuleDefException {
		return application.generateRule(lhsValue, operator, rhsValues, realPath);
	}

	@Override
	public void activeBusinessRule(int id, String realPath) throws RuleDefException {
		application.activateRule(id, realPath);
	}

	@Override
	public void deactivateBusinessRule(int id) {
		// TODO Auto-generated method stub

	}

}
