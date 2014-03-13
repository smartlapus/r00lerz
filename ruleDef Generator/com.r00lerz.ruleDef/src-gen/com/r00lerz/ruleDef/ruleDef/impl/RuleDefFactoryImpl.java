/**
 */
package com.r00lerz.ruleDef.ruleDef.impl;

import com.r00lerz.ruleDef.ruleDef.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleDefFactoryImpl extends EFactoryImpl implements RuleDefFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RuleDefFactory init()
  {
    try
    {
      RuleDefFactory theRuleDefFactory = (RuleDefFactory)EPackage.Registry.INSTANCE.getEFactory(RuleDefPackage.eNS_URI);
      if (theRuleDefFactory != null)
      {
        return theRuleDefFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RuleDefFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleDefFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RuleDefPackage.BUSINESS_RULE: return createBusinessRule();
      case RuleDefPackage.VALUE: return createValue();
      case RuleDefPackage.COLUMN_VALUE: return createColumnValue();
      case RuleDefPackage.COLUMN_NAME: return createColumnName();
      case RuleDefPackage.TABLE_NAME: return createTableName();
      case RuleDefPackage.STATIC_VALUE: return createStaticValue();
      case RuleDefPackage.OPERATOR: return createOperator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessRule createBusinessRule()
  {
    BusinessRuleImpl businessRule = new BusinessRuleImpl();
    return businessRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnValue createColumnValue()
  {
    ColumnValueImpl columnValue = new ColumnValueImpl();
    return columnValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnName createColumnName()
  {
    ColumnNameImpl columnName = new ColumnNameImpl();
    return columnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableName createTableName()
  {
    TableNameImpl tableName = new TableNameImpl();
    return tableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticValue createStaticValue()
  {
    StaticValueImpl staticValue = new StaticValueImpl();
    return staticValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleDefPackage getRuleDefPackage()
  {
    return (RuleDefPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RuleDefPackage getPackage()
  {
    return RuleDefPackage.eINSTANCE;
  }

} //RuleDefFactoryImpl
