package com.r00lerz.businessRuleGenerator.testing;

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
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.OperatorDAO;
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
	
	@Test  
	public void generateValidCompareRule() throws RuleDefException {
		rhsValues = Arrays.asList("1");
		//Arguments :: (final String lhsValue, final String operator, final List<String> rhsValues, final String realPath)
		application.generateRule("lhsValue", "operator", rhsValues, "realPath");
	} 
	
	
	@Test (expected = RuleDefException.class)
	public void generateInvalidRuleNoValues() throws RuleDefException {
		rhsValues = Arrays.asList("");
	}
	
	@Test (expected = RuleDefException.class)
	public void generateInvalidRuleMoreThanOneSeperator() throws RuleDefException {
		rhsValues = Arrays.asList("1");
	}
		
	// GENERATE RULENAME	
	@Test
	public void generateValidRuleName() throws RuleDefException{
		br.generateName("string");
	}
	
	@Test (expected = RuleDefException.class)
	public void generateInvalidRuleName() throws RuleDefException{
		br.generateName("string"); // application without id 1
	
	}
	
	
	// DAO classes
	@Test
	public void backEndRuleRetrieveTypeByName(){
		// compare rule, list rule, regex rule
	}
	
	@Test
	public void backEndRuleRetrieveTypeByNameCaps(){
		// compare rule, list rule, regex rule
	}
	
	@Test
	public void backEndRuleRetrieveTypeByNameNoExist(){
		// compare rule, list rule, regex rule
	}
	// ------------------- //
	@Test
	public void businessRuleRetrieveById(){
		
	}
	
	@Test
	public void businessRuleRetrieveByIdAlphaNumeric(){
		
	}
	// ------------------- //
	
	@Test
	public void businessRuleRetrieveRulesForActivation(){
		
	}
	
	@Test
	public void businessRuleRetrieveRulesForActivationWhitespace(){
		
	}
	
	@Test
	public void businessRuleRetrieveRulesForActivationNonExist(){
		
	}
	// ------------------- //
	
	@Test
	public void frontEndRuleTypeRetrieveTypeByName(){
		
	}
	
	@Test
	public void frontEndRuleTypeRetrieveTypeByNameCaps(){
		
	}
	
	@Test
	public void frontEndRuleTypeRetrieveTypeByNameNoExist(){
		
	}
	// ------------------- //
	
	@Test
	public void languageRetrieveLanguageByName(){
		
	}
	
	@Test
	public void languageRetrieveLanguageByNameCaps(){
		
	}
	
	@Test
	public void languageRetrieveLanguageByNameNoExist(){
		
	}
	// ------------------- //
	
	@Test
	public void operatorRetrieveOperatorByName(){
		
	}
	
	@Test
	public void operatorRetrieveOperatorByNameCaps(){
		
	}
	
	@Test
	public void operatorRetrieveOperatorByNameNoExist(){
		
	}
	// ------------------- //
	
	@Test
	public void valueTypeRetrieveTypeByName(){
		
	}
	
	@Test
	public void valueTypeRetrieveTypeByNameCaps(){
		
	}
	
	@Test
	public void valueTypeRetrieveTypeByNameNoExist(){
		
	}
	
	@After
	public void destroy(){
		sf.getCurrentSession().close();
	}
}
