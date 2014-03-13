/**
 */
package com.r00lerz.ruleDef.ruleDef.util;

import com.r00lerz.ruleDef.ruleDef.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage
 * @generated
 */
public class RuleDefAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RuleDefPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleDefAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RuleDefPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleDefSwitch<Adapter> modelSwitch =
    new RuleDefSwitch<Adapter>()
    {
      @Override
      public Adapter caseBusinessRule(BusinessRule object)
      {
        return createBusinessRuleAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseColumnValue(ColumnValue object)
      {
        return createColumnValueAdapter();
      }
      @Override
      public Adapter caseColumnName(ColumnName object)
      {
        return createColumnNameAdapter();
      }
      @Override
      public Adapter caseTableName(TableName object)
      {
        return createTableNameAdapter();
      }
      @Override
      public Adapter caseStaticValue(StaticValue object)
      {
        return createStaticValueAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.r00lerz.ruleDef.ruleDef.BusinessRule <em>Business Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.r00lerz.ruleDef.ruleDef.BusinessRule
   * @generated
   */
  public Adapter createBusinessRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.r00lerz.ruleDef.ruleDef.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.r00lerz.ruleDef.ruleDef.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.r00lerz.ruleDef.ruleDef.ColumnValue <em>Column Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.r00lerz.ruleDef.ruleDef.ColumnValue
   * @generated
   */
  public Adapter createColumnValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.r00lerz.ruleDef.ruleDef.ColumnName <em>Column Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.r00lerz.ruleDef.ruleDef.ColumnName
   * @generated
   */
  public Adapter createColumnNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.r00lerz.ruleDef.ruleDef.TableName <em>Table Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.r00lerz.ruleDef.ruleDef.TableName
   * @generated
   */
  public Adapter createTableNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.r00lerz.ruleDef.ruleDef.StaticValue <em>Static Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.r00lerz.ruleDef.ruleDef.StaticValue
   * @generated
   */
  public Adapter createStaticValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.r00lerz.ruleDef.ruleDef.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.r00lerz.ruleDef.ruleDef.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RuleDefAdapterFactory
