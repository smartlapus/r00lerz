package com.r00lerz.businessRuleGenerator.domain;

import java.util.List;

import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;

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
		application = new Application();
	};

	@Override
	public void generateRule(String lhsValue, String operator, List<String> rhsValues, String realPath) {
		application.generateRule(lhsValue, operator, rhsValues, realPath);
	}

	@Override
	public void activeBusinessRule(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deactivateBusinessRule(int id) {
		// TODO Auto-generated method stub

	}

}
