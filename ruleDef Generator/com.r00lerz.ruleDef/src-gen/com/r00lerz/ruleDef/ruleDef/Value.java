/**
 */
package com.r00lerz.ruleDef.ruleDef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.Value#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(StaticValue)
   * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getValue_Value()
   * @model containment="true"
   * @generated
   */
  StaticValue getValue();

  /**
   * Sets the value of the '{@link com.r00lerz.ruleDef.ruleDef.Value#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(StaticValue value);

} // Value
