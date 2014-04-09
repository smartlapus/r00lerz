package com.r00lerz.businessRuleGenerator.testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;
import com.r00lerz.businessRuleGenerator.domain.datamodel.BusinessRule;
import com.r00lerz.businessRuleGenerator.domain.datamodel.GeneratedCode;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Value;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.BackEndRuleTypeDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.BusinessRuleDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.FrontEndRuleTypeDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.LanguageDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.OperatorDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.ValueTypeDAO;
import com.r00lerz.ruleDef.RuleDefException;

public class JUnitTests {

	private BusinessRule br;
	private Application application;
	private List<String> rhsValues;
	private String appPartRuleName;
	private String description;
	private String lhsValue;
	private String operator;
	private String frontEndRuleType;
	private String generatedCode;
	
	private SessionFactory sf;
	
	@Before
	public void setup()  {
		sf = HibernateUtil.configureSessionFactory(); 
		sf.getCurrentSession().beginTransaction();  
		
		application = new Application();
	}
	
	// GENERATE BUSINESS RULE	
	@Test  
	public void generateValidBetweenRule() throws RuleDefException {
		appPartRuleName = "BRG_CSA";
		description = "USER.AGE must be between 1 and 2";
		lhsValue = "USER.AGE";
		operator = "must be between";
		rhsValues = Arrays.asList("1","2");
		frontEndRuleType = "attribute range rule";
		generatedCode = "GENERATEDCODEHERE";
		BusinessRule br = new BusinessRule(appPartRuleName, description, lhsValue,operator, rhsValues, frontEndRuleType, generatedCode);
	} 
	@Test (expected = RuleDefException.class)  
	public void generateInvalidBetweenRule() throws RuleDefException {
		appPartRuleName = "BRG_CSA";
		description = "USER.AGE must be between 1 and 2";
		lhsValue = "USER.AGE";
		operator = "must be between";
		rhsValues = Arrays.asList("1","2","3");
		frontEndRuleType = "attribute range rule";
		generatedCode = "GENERATEDCODEHERE";
		BusinessRule br = new BusinessRule(appPartRuleName, description, lhsValue,operator, rhsValues, frontEndRuleType, generatedCode);
	} 
	@Test  
	public void generateValidCompareRule() throws RuleDefException {
		appPartRuleName = "BRG_CSA";
		description = "USER.AGE must be bigger than 1";
		lhsValue = "USER.AGE";
		operator = "bigger than";
		rhsValues = Arrays.asList("1");
		frontEndRuleType = "attribute range rule";
		generatedCode = "GENERATEDCODEHERE";
		BusinessRule br = new BusinessRule(appPartRuleName, description, lhsValue,operator, rhsValues, frontEndRuleType, generatedCode);
	} 
	
	
	@Test (expected = RuleDefException.class)
	public void generateInvalidRuleNoValues() throws RuleDefException {
		appPartRuleName = "BRG_CSA";
		description = "USER.AGE must be bigger than 1";
		lhsValue = "USER.AGE";
		operator = "bigger than";
		rhsValues = Arrays.asList("");
		frontEndRuleType = "attribute range rule";
		generatedCode = "GENERATEDCODEHERE";
		BusinessRule br = new BusinessRule(appPartRuleName, description, lhsValue,operator, rhsValues, frontEndRuleType, generatedCode);
	}
	
	@Test (expected = RuleDefException.class)
	public void generateInvalidRuleMoreThanOneSeperator() throws RuleDefException {
		appPartRuleName = "BRG_CSA";
		description = "USER.AGE must be bigger than 1";
		lhsValue = "USER..AGE";
		operator = "bigger than";
		rhsValues = Arrays.asList("");
		frontEndRuleType = "attribute range rule";
		generatedCode = "GENERATEDCODEHERE";
		BusinessRule br = new BusinessRule(appPartRuleName, description, lhsValue,operator, rhsValues, frontEndRuleType, generatedCode);
	}
		
	// GENERATE RULENAME	
	@Test
	public void generateValidRuleName() throws RuleDefException{
		br.generateName("TestName");
	}
	
	// DAO classes
	@Test
	public void backEndRuleRetrieveTypeByName(){
		// compare rule, list rule, regex rule
		BackEndRuleTypeDAO bERuleTypeDao = new BackEndRuleTypeDAO();
		bERuleTypeDao.retrieveTypeByName("compare rule");
	}
	
	@Test
	public void backEndRuleRetrieveTypeByNameCaps(){
		// compare rule, list rule, regex rule
		BackEndRuleTypeDAO backEndRuleTypeDao = new BackEndRuleTypeDAO();
		backEndRuleTypeDao.retrieveTypeByName("COMPARE RULE");
	}
	
	@Test
	public void backEndRuleRetrieveTypeByNameNoExist(){
		// compare rule, list rule, regex rule
		BackEndRuleTypeDAO backEndRuleTypeDao = new BackEndRuleTypeDAO();
		backEndRuleTypeDao.retrieveTypeByName("yolo rule");
	}
	// ------------------- //
	@Test
	public void businessRuleRetrieveById(){
		BusinessRuleDAO businessRuleDao = new BusinessRuleDAO();
		businessRuleDao.retrieveById(1);
	}
	
	@Test
	public void businessRuleRetrieveByIdAlphaNumeric(){
		
	}
	// ------------------- //
	
	@Test
	public void businessRuleRetrieveRulesForActivation(){
		BusinessRuleDAO businessRuleDao = new BusinessRuleDAO();
		businessRuleDao.retrieveRulesForActivation("BRG_USER");
	}
	
	@Test
	public void businessRuleRetrieveRulesForActivationWhitespace(){
		BusinessRuleDAO businessRuleDao = new BusinessRuleDAO();
		businessRuleDao.retrieveRulesForActivation("BRG USER");
	}
	
	@Test
	public void businessRuleRetrieveRulesForActivationNonExist(){
		BusinessRuleDAO businessRuleDao = new BusinessRuleDAO();
		businessRuleDao.retrieveRulesForActivation("BRG USERS");
	}
	// ------------------- //
	
	@Test
	public void frontEndRuleTypeRetrieveTypeByName(){
		FrontEndRuleTypeDAO frontEndRuleTypeDao = new FrontEndRuleTypeDAO();
		frontEndRuleTypeDao.retrieveTypeByName("attribute range rule");	
	}
	
	@Test
	public void frontEndRuleTypeRetrieveTypeByNameCaps(){
		FrontEndRuleTypeDAO frontEndRuleTypeDao = new FrontEndRuleTypeDAO();
		frontEndRuleTypeDao.retrieveTypeByName("ATTRIBUTE RANGE RULE");
	}
	
	@Test
	public void frontEndRuleTypeRetrieveTypeByNameNoExist(){
		FrontEndRuleTypeDAO frontEndRuleTypeDao = new FrontEndRuleTypeDAO();
		frontEndRuleTypeDao.retrieveTypeByName("attribute range other compare tuple rule");
	}
	// ------------------- //
	
	@Test
	public void languageRetrieveLanguageByName(){
		LanguageDAO languageDao = new LanguageDAO();
		languageDao.retrieveLanguageByName("PL/SQL");
	}
	
	@Test
	public void languageRetrieveLanguageByNameCaps(){
		LanguageDAO languageDao = new LanguageDAO();
		languageDao.retrieveLanguageByName("pl/sql");
	}
	
	@Test
	public void languageRetrieveLanguageByNameNoExist(){
		LanguageDAO languageDao = new LanguageDAO();
		languageDao.retrieveLanguageByName("MYSQL");
		assertNull("Language object does not exist.", languageDao);
	}
	// ------------------- //
	
	@Test
	public void operatorRetrieveOperatorByName(){
		OperatorDAO operatorDao = new OperatorDAO();
		operatorDao.retrieveOperatorByName("must be equal to");
	}
	
	@Test
	public void operatorRetrieveOperatorByNameCaps(){
		OperatorDAO operatorDao = new OperatorDAO();
		operatorDao.retrieveOperatorByName("MUST BE EQUAL TO");
	}
	
	@Test
	public void operatorRetrieveOperatorByNameNoExist(){
		OperatorDAO operatorDao = new OperatorDAO();
		operatorDao.retrieveOperatorByName("EQUALS");
	}
	// ------------------- //
	
	@Test
	public void valueTypeRetrieveTypeByName(){
		ValueTypeDAO valueTypeDao = new ValueTypeDAO();
		valueTypeDao.retrieveTypeByName("static value");
	}
	
	@Test
	public void valueTypeRetrieveTypeByNameCaps(){
		ValueTypeDAO valueTypeDao = new ValueTypeDAO();
		valueTypeDao.retrieveTypeByName("STATIC VALUE");
	}
	
	@Test
	public void valueTypeRetrieveTypeByNameNoExist(){
		ValueTypeDAO valueTypeDao = new ValueTypeDAO();
		valueTypeDao.retrieveTypeByName("FLOATING VALUE");
	}
	
	@After
	public void destroy(){
		sf.getCurrentSession().close();
	}
}
