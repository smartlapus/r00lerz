/**
 */
package com.r00lerz.ruleDef.ruleDef.impl;

import com.r00lerz.ruleDef.ruleDef.Operator;
import com.r00lerz.ruleDef.ruleDef.RuleDefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.impl.OperatorImpl#getOperatorName <em>Operator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorImpl extends MinimalEObjectImpl.Container implements Operator
{
  /**
   * The default value of the '{@link #getOperatorName() <em>Operator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperatorName()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperatorName() <em>Operator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperatorName()
   * @generated
   * @ordered
   */
  protected String operatorName = OPERATOR_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RuleDefPackage.Literals.OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperatorName()
  {
    return operatorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperatorName(String newOperatorName)
  {
    String oldOperatorName = operatorName;
    operatorName = newOperatorName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDefPackage.OPERATOR__OPERATOR_NAME, oldOperatorName, operatorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RuleDefPackage.OPERATOR__OPERATOR_NAME:
        return getOperatorName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RuleDefPackage.OPERATOR__OPERATOR_NAME:
        setOperatorName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RuleDefPackage.OPERATOR__OPERATOR_NAME:
        setOperatorName(OPERATOR_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RuleDefPackage.OPERATOR__OPERATOR_NAME:
        return OPERATOR_NAME_EDEFAULT == null ? operatorName != null : !OPERATOR_NAME_EDEFAULT.equals(operatorName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (OperatorName: ");
    result.append(operatorName);
    result.append(')');
    return result.toString();
  }

} //OperatorImpl
