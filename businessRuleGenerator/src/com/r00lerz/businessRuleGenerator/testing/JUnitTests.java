package com.r00lerz.businessRuleGenerator.testing;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

import com.r00lerz.businessRuleGenerator.domain.datamodel.Application;
import com.r00lerz.ruleDef.RuleDefException;

public class JUnitTests {

	@Before
	public void setup()  {
		
		
	}
	
	@Test 
	public void generateValidRule() throws RuleDefException {
		Application application = new Application();
		//Arguments :: (final String lhsValue, final String operator, final List<String> rhsValues, final String realPath)
		List<String> rhsValues = Arrays.asList("1","2","3");
		application.generateRule("lhsValue", "operator", rhsValues, "realPath");
	}
}
