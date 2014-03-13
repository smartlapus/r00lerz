/**
 */
package com.r00lerz.ruleDef.ruleDef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.StaticValue#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getStaticValue()
 * @model
 * @generated
 */
public interface StaticValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(int)
   * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getStaticValue_Name()
   * @model
   * @generated
   */
  int getName();

  /**
   * Sets the value of the '{@link com.r00lerz.ruleDef.ruleDef.StaticValue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(int value);

} // StaticValue
