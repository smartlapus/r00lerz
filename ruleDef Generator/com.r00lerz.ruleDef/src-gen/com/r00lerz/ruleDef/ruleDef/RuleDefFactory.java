/**
 */
package com.r00lerz.ruleDef.ruleDef;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage
 * @generated
 */
public interface RuleDefFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RuleDefFactory eINSTANCE = com.r00lerz.ruleDef.ruleDef.impl.RuleDefFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Business Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Business Rule</em>'.
   * @generated
   */
  BusinessRule createBusinessRule();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Column Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Value</em>'.
   * @generated
   */
  ColumnValue createColumnValue();

  /**
   * Returns a new object of class '<em>Column Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Name</em>'.
   * @generated
   */
  ColumnName createColumnName();

  /**
   * Returns a new object of class '<em>Table Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Name</em>'.
   * @generated
   */
  TableName createTableName();

  /**
   * Returns a new object of class '<em>Static Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Value</em>'.
   * @generated
   */
  StaticValue createStaticValue();

  /**
   * Returns a new object of class '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operator</em>'.
   * @generated
   */
  Operator createOperator();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RuleDefPackage getRuleDefPackage();

} //RuleDefFactory
