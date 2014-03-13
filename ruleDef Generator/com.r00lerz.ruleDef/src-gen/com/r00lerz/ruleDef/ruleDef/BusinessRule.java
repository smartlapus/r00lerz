/**
 */
package com.r00lerz.ruleDef.ruleDef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.BusinessRule#getColumnvalue <em>Columnvalue</em>}</li>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.BusinessRule#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.BusinessRule#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getBusinessRule()
 * @model
 * @generated
 */
public interface BusinessRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Columnvalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columnvalue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columnvalue</em>' containment reference.
   * @see #setColumnvalue(ColumnValue)
   * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getBusinessRule_Columnvalue()
   * @model containment="true"
   * @generated
   */
  ColumnValue getColumnvalue();

  /**
   * Sets the value of the '{@link com.r00lerz.ruleDef.ruleDef.BusinessRule#getColumnvalue <em>Columnvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columnvalue</em>' containment reference.
   * @see #getColumnvalue()
   * @generated
   */
  void setColumnvalue(ColumnValue value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(Operator)
   * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getBusinessRule_Operator()
   * @model containment="true"
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link com.r00lerz.ruleDef.ruleDef.BusinessRule#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getBusinessRule_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link com.r00lerz.ruleDef.ruleDef.BusinessRule#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // BusinessRule
