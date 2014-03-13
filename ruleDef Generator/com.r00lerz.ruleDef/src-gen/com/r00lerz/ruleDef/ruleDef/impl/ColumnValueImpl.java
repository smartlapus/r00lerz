/**
 */
package com.r00lerz.ruleDef.ruleDef.impl;

import com.r00lerz.ruleDef.ruleDef.ColumnName;
import com.r00lerz.ruleDef.ruleDef.ColumnValue;
import com.r00lerz.ruleDef.ruleDef.RuleDefPackage;
import com.r00lerz.ruleDef.ruleDef.TableName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.impl.ColumnValueImpl#getTablename <em>Tablename</em>}</li>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.impl.ColumnValueImpl#getColumname <em>Columname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnValueImpl extends ValueImpl implements ColumnValue
{
  /**
   * The cached value of the '{@link #getTablename() <em>Tablename</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTablename()
   * @generated
   * @ordered
   */
  protected TableName tablename;

  /**
   * The cached value of the '{@link #getColumname() <em>Columname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumname()
   * @generated
   * @ordered
   */
  protected ColumnName columname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColumnValueImpl()
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
    return RuleDefPackage.Literals.COLUMN_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableName getTablename()
  {
    return tablename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTablename(TableName newTablename, NotificationChain msgs)
  {
    TableName oldTablename = tablename;
    tablename = newTablename;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleDefPackage.COLUMN_VALUE__TABLENAME, oldTablename, newTablename);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTablename(TableName newTablename)
  {
    if (newTablename != tablename)
    {
      NotificationChain msgs = null;
      if (tablename != null)
        msgs = ((InternalEObject)tablename).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleDefPackage.COLUMN_VALUE__TABLENAME, null, msgs);
      if (newTablename != null)
        msgs = ((InternalEObject)newTablename).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleDefPackage.COLUMN_VALUE__TABLENAME, null, msgs);
      msgs = basicSetTablename(newTablename, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDefPackage.COLUMN_VALUE__TABLENAME, newTablename, newTablename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnName getColumname()
  {
    return columname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumname(ColumnName newColumname, NotificationChain msgs)
  {
    ColumnName oldColumname = columname;
    columname = newColumname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuleDefPackage.COLUMN_VALUE__COLUMNAME, oldColumname, newColumname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumname(ColumnName newColumname)
  {
    if (newColumname != columname)
    {
      NotificationChain msgs = null;
      if (columname != null)
        msgs = ((InternalEObject)columname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuleDefPackage.COLUMN_VALUE__COLUMNAME, null, msgs);
      if (newColumname != null)
        msgs = ((InternalEObject)newColumname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuleDefPackage.COLUMN_VALUE__COLUMNAME, null, msgs);
      msgs = basicSetColumname(newColumname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuleDefPackage.COLUMN_VALUE__COLUMNAME, newColumname, newColumname));
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
      case RuleDefPackage.COLUMN_VALUE__TABLENAME:
        return basicSetTablename(null, msgs);
      case RuleDefPackage.COLUMN_VALUE__COLUMNAME:
        return basicSetColumname(null, msgs);
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
      case RuleDefPackage.COLUMN_VALUE__TABLENAME:
        return getTablename();
      case RuleDefPackage.COLUMN_VALUE__COLUMNAME:
        return getColumname();
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
      case RuleDefPackage.COLUMN_VALUE__TABLENAME:
        setTablename((TableName)newValue);
        return;
      case RuleDefPackage.COLUMN_VALUE__COLUMNAME:
        setColumname((ColumnName)newValue);
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
      case RuleDefPackage.COLUMN_VALUE__TABLENAME:
        setTablename((TableName)null);
        return;
      case RuleDefPackage.COLUMN_VALUE__COLUMNAME:
        setColumname((ColumnName)null);
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
      case RuleDefPackage.COLUMN_VALUE__TABLENAME:
        return tablename != null;
      case RuleDefPackage.COLUMN_VALUE__COLUMNAME:
        return columname != null;
    }
    return super.eIsSet(featureID);
  }

} //ColumnValueImpl
