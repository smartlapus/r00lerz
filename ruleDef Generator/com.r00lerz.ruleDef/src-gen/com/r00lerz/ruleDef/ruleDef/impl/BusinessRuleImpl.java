/**
 */
package com.r00lerz.ruleDef.ruleDef.impl;

import com.r00lerz.ruleDef.ruleDef.BusinessRule;
import com.r00lerz.ruleDef.ruleDef.ColumnValue;
import com.r00lerz.ruleDef.ruleDef.Operator;
import com.r00lerz.ruleDef.ruleDef.RuleDefPackage;
import com.r00lerz.ruleDef.ruleDef.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.impl.BusinessRuleImpl#getColumnvalue <em>Columnvalue</em>}</li>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.impl.BusinessRuleImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.impl.BusinessRuleImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessRuleImpl extends MinimalEObjectImpl.Container implements BusinessRule
{
  /**
   * The cached value of the '{@link #getColumnvalue() <em>Columnvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnvalue()
   * @generated
   * @ordered
   */
  protected ColumnValue columnvalue;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected Operator operator;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessRuleImpl()
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
    return RuleDefPackage.Literals.BUSINESS_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnValue getColumnvalue()
  {
    return columnvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumnvalue(ColumnValue newColumnvalue, NotificationChain msgs)
  {
    ColumnValue oldColumnvalue = columnvalue;
    columnvalue = newColumnvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleDefPackage.BUSINESS_RULE__COLUMNVALUE, oldColumnvalue, newColumnvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnvalue(ColumnValue newColumnvalue)
  {
    if (newColumnvalue != columnvalue)
    {
      NotificationChain msgs = null;
      if (columnvalue != null)
        msgs = ((InternalEObject)columnvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleDefPackage.BUSINESS_RULE__COLUMNVALUE, null, msgs);
      if (newColumnvalue != null)
        msgs = ((InternalEObject)newColumnvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleDefPackage.BUSINESS_RULE__COLUMNVALUE, null, msgs);
      msgs = basicSetColumnvalue(newColumnvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDefPackage.BUSINESS_RULE__COLUMNVALUE, newColumnvalue, newColumnvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs)
  {
    Operator oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleDefPackage.BUSINESS_RULE__OPERATOR, oldOperator, newOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(Operator newOperator)
  {
    if (newOperator != operator)
    {
      NotificationChain msgs = null;
      if (operator != null)
        msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleDefPackage.BUSINESS_RULE__OPERATOR, null, msgs);
      if (newOperator != null)
        msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleDefPackage.BUSINESS_RULE__OPERATOR, null, msgs);
      msgs = basicSetOperator(newOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDefPackage.BUSINESS_RULE__OPERATOR, newOperator, newOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleDefPackage.BUSINESS_RULE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleDefPackage.BUSINESS_RULE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleDefPackage.BUSINESS_RULE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDefPackage.BUSINESS_RULE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RuleDefPackage.BUSINESS_RULE__COLUMNVALUE:
        return basicSetColumnvalue(null, msgs);
      case RuleDefPackage.BUSINESS_RULE__OPERATOR:
        return basicSetOperator(null, msgs);
      case RuleDefPackage.BUSINESS_RULE__VALUE:
        return basicSetValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RuleDefPackage.BUSINESS_RULE__COLUMNVALUE:
        return getColumnvalue();
      case RuleDefPackage.BUSINESS_RULE__OPERATOR:
        return getOperator();
      case RuleDefPackage.BUSINESS_RULE__VALUE:
        return getValue();
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
      case RuleDefPackage.BUSINESS_RULE__COLUMNVALUE:
        setColumnvalue((ColumnValue)newValue);
        return;
      case RuleDefPackage.BUSINESS_RULE__OPERATOR:
        setOperator((Operator)newValue);
        return;
      case RuleDefPackage.BUSINESS_RULE__VALUE:
        setValue((Value)newValue);
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
      case RuleDefPackage.BUSINESS_RULE__COLUMNVALUE:
        setColumnvalue((ColumnValue)null);
        return;
      case RuleDefPackage.BUSINESS_RULE__OPERATOR:
        setOperator((Operator)null);
        return;
      case RuleDefPackage.BUSINESS_RULE__VALUE:
        setValue((Value)null);
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
      case RuleDefPackage.BUSINESS_RULE__COLUMNVALUE:
        return columnvalue != null;
      case RuleDefPackage.BUSINESS_RULE__OPERATOR:
        return operator != null;
      case RuleDefPackage.BUSINESS_RULE__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //BusinessRuleImpl
