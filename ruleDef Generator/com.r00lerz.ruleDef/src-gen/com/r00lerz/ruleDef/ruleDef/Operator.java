/**
 */
package com.r00lerz.ruleDef.ruleDef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.Operator#getOperatorName <em>Operator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator Name</em>' attribute.
   * @see #setOperatorName(String)
   * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getOperator_OperatorName()
   * @model
   * @generated
   */
  String getOperatorName();

  /**
   * Sets the value of the '{@link com.r00lerz.ruleDef.ruleDef.Operator#getOperatorName <em>Operator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator Name</em>' attribute.
   * @see #getOperatorName()
   * @generated
   */
  void setOperatorName(String value);

} // Operator
