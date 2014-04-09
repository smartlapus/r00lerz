package com.r00lerz.businessRuleGenerator.testing;

import java.util.Arrays;
import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.*;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.*;
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
	
	@BeforeClass 
	public static void setup()  {
		SessionFactory sf = HibernateUtil.configureSessionFactory(); 
		sf.getCurrentSession().beginTransaction();  
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
		BusinessRule br = new BusinessRule(appPartRuleName, description, lhsValue, operator, rhsValues, frontEndRuleType, generatedCode);
	} 
	@Test  
	public void generateValidCompareRule() throws RuleDefException {
		appPartRuleName = "BRG_CSA";
		description = "USER.AGE must be bigger than 1";
		lhsValue = "USER.AGE";
		operator = "must be bigger than";
		rhsValues = Arrays.asList("1");
		frontEndRuleType = "attribute range rule";
		generatedCode = "GENERATEDCODEHERE";
		BusinessRule br = new BusinessRule(appPartRuleName, description, lhsValue,operator, rhsValues, frontEndRuleType, generatedCode);
	} 
	
	
	@Test (expected = IndexOutOfBoundsException.class)
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
	
	@Test (expected = IndexOutOfBoundsException.class)
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
		br = new BusinessRule();
		br.setEntity("PERSON");
		
		Value lhsValue = new Value("person.age");
		ValueType valueType = new ValueType();
		valueType.setName("static");
		
		FrontEndRuleType frontEndRuleType = new FrontEndRuleType();
		frontEndRuleType.setName("attribute compare rule");
		
		br.setLhsValue(lhsValue);
		br.setFrontEndRuleType(frontEndRuleType);
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
	
	@Test (expected = IndexOutOfBoundsException.class)
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
	
	@Test (expected = IndexOutOfBoundsException.class)
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
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void languageRetrieveLanguageByNameNoExist(){
		LanguageDAO languageDao = new LanguageDAO();
		languageDao.retrieveLanguageByName("MYSQL");
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
	
	@Test (expected = IndexOutOfBoundsException.class)
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
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void valueTypeRetrieveTypeByNameNoExist(){
		ValueTypeDAO valueTypeDao = new ValueTypeDAO();
		valueTypeDao.retrieveTypeByName("FLOATING VALUE");
	}
}
