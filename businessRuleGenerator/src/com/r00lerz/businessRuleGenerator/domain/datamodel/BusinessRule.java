package com.r00lerz.businessRuleGenerator.domain.datamodel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;

import com.r00lerz.businessRuleGenerator.domain.HibernateUtil;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.BackEndRuleTypeDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.BusinessRuleDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.FrontEndRuleTypeDAO;
import com.r00lerz.businessRuleGenerator.domain.datamodel.Dao.OperatorDAO;
import com.r00lerz.ruleDef.RuleDefException;

public class BusinessRule {

	private int id;
	private String name;
	private String description;
	private BusinessRule condition;

	private Value lhsValue;
	private Operator operator;
	private Set<Value> rhsValues;

	private BackEndRuleType backEndRuleType;
	private FrontEndRuleType frontEndRuleType;
	private Set<GeneratedCode> generatedCode;

	private int status; // Determines whether the business rule is active.
							// Default is [0]: Disabled, [1]: Enabled.
	private String entity = ""; // Stores what entity the business rule applies
								// to.
	private int consecutiveNumber; // Follow-Up number, is determined by the
										// amount of business rules on a
										// specific entity.

	public BusinessRule() {
	}

	public BusinessRule(final String appPartRuleName, final String description,
			final String lhsValue, final String operator, final List<String> rhsValues,
			final String frontEndRuleType, final String generatedCode)
			throws RuleDefException {
		System.out.println("\n\nBusinessRule::Constructing BusinessRule");

		this.description = description;
		this.lhsValue = new Value(lhsValue);
		this.operator = new OperatorDAO().retrieveOperatorByName(operator);
		this.rhsValues = new HashSet<Value>();
		for (final String valueString : rhsValues) {
			if (rhsValues.size() > 2) {
				throw new RuleDefException();

			} else {
				this.rhsValues.add(new Value(valueString));
			}
		}
		this.backEndRuleType = new BackEndRuleTypeDAO()
				.retrieveTypeByName("Compare Rule");
		this.frontEndRuleType = new FrontEndRuleTypeDAO()
				.retrieveTypeByName(frontEndRuleType);

		this.entity = lhsValue.split("\\.")[0];

		this.consecutiveNumber = (int) new BusinessRuleDAO()
				.retrieveConsecutiveNumber(this.entity);

		this.name = this.generateName(appPartRuleName);

		this.generatedCode = new HashSet<GeneratedCode>();
		this.generatedCode.add(new GeneratedCode(generatedCode));

	}

	public String generateName(final String appPartRuleName) {
		final String entityAbr = lhsValue.abbreviateEntityName();
		final String ruleTypeAbr = frontEndRuleType.getAbbreviation();

		return appPartRuleName + "_" + entityAbr + "_" + "TRG" + "_"
				+ ruleTypeAbr + "_" + this.consecutiveNumber;
	}

	@Override
	public String toString() {
		return "BusinessRule:\n" + "id= " + id + "\n" + "name= " + name + "\n"
				+ "description= "
				+ description
				+ "\n"
				// + "condition= " + condition + "\n"
				+ "lhsValue= " + lhsValue + "\n" + "operator= " + operator
				+ "\n" + "rhsValues= " + rhsValues + "\n" + "backEndRuleType= "
				+ backEndRuleType + "\n" + "frontEndRuleType= "
				+ frontEndRuleType + "\n" + "generatedCode= " + generatedCode;
	}

	public int getConsecutiveNumber() {
		return consecutiveNumber;
	}

	public void setConsecutiveNumber(final int consecutiveNumber) {
		this.consecutiveNumber = consecutiveNumber;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(final int status) {
		this.status = status;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(final String entity) {
		this.entity = entity;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public BusinessRule getCondition() {
		return condition;
	}

	public void setCondition(final BusinessRule condition) {
		this.condition = condition;
	}

	public Value getLhsValue() {
		return lhsValue;
	}

	public void setLhsValue(final Value lhsValue) {
		this.lhsValue = lhsValue;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(final Operator operator) {
		this.operator = operator;
	}

	public Set<Value> getRhsValues() {
		return rhsValues;
	}

	public void setRhsValues(final Set<Value> rhsValues) {
		this.rhsValues = rhsValues;
	}

	public BackEndRuleType getBackEndRuleType() {
		return backEndRuleType;
	}

	public void setBackEndRuleType(final BackEndRuleType backEndRuleType) {
		this.backEndRuleType = backEndRuleType;
	}

	public FrontEndRuleType getFrontEndRuleType() {
		return frontEndRuleType;
	}

	public void setFrontEndRuleType(final FrontEndRuleType frontEndRuleType) {
		this.frontEndRuleType = frontEndRuleType;
	}

	public Set<GeneratedCode> getGeneratedCode() {
		return generatedCode;
	}

	public void setGeneratedCode(final Set<GeneratedCode> generatedCode) {
		this.generatedCode = generatedCode;
	}
}
