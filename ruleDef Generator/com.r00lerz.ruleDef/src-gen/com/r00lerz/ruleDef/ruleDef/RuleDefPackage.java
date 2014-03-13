/**
 */
package com.r00lerz.ruleDef.ruleDef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.r00lerz.ruleDef.ruleDef.RuleDefFactory
 * @model kind="package"
 * @generated
 */
public interface RuleDefPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ruleDef";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.r00lerz.com/ruleDef/RuleDef";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ruleDef";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RuleDefPackage eINSTANCE = com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl.init();

  /**
   * The meta object id for the '{@link com.r00lerz.ruleDef.ruleDef.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.r00lerz.ruleDef.ruleDef.impl.BusinessRuleImpl
   * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getBusinessRule()
   * @generated
   */
  int BUSINESS_RULE = 0;

  /**
   * The feature id for the '<em><b>Columnvalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_RULE__COLUMNVALUE = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_RULE__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_RULE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Business Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.r00lerz.ruleDef.ruleDef.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.r00lerz.ruleDef.ruleDef.impl.ValueImpl
   * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getValue()
   * @generated
   */
  int VALUE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.r00lerz.ruleDef.ruleDef.impl.ColumnValueImpl <em>Column Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.r00lerz.ruleDef.ruleDef.impl.ColumnValueImpl
   * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getColumnValue()
   * @generated
   */
  int COLUMN_VALUE = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_VALUE__VALUE = VALUE__VALUE;

  /**
   * The feature id for the '<em><b>Tablename</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_VALUE__TABLENAME = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Columname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_VALUE__COLUMNAME = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Column Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.r00lerz.ruleDef.ruleDef.impl.ColumnNameImpl <em>Column Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.r00lerz.ruleDef.ruleDef.impl.ColumnNameImpl
   * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getColumnName()
   * @generated
   */
  int COLUMN_NAME = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Column Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.r00lerz.ruleDef.ruleDef.impl.TableNameImpl <em>Table Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.r00lerz.ruleDef.ruleDef.impl.TableNameImpl
   * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getTableName()
   * @generated
   */
  int TABLE_NAME = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Table Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.r00lerz.ruleDef.ruleDef.impl.StaticValueImpl <em>Static Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.r00lerz.ruleDef.ruleDef.impl.StaticValueImpl
   * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getStaticValue()
   * @generated
   */
  int STATIC_VALUE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Static Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.r00lerz.ruleDef.ruleDef.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.r00lerz.ruleDef.ruleDef.impl.OperatorImpl
   * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 6;

  /**
   * The feature id for the '<em><b>Operator Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__OPERATOR_NAME = 0;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.r00lerz.ruleDef.ruleDef.BusinessRule <em>Business Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Rule</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.BusinessRule
   * @generated
   */
  EClass getBusinessRule();

  /**
   * Returns the meta object for the containment reference '{@link com.r00lerz.ruleDef.ruleDef.BusinessRule#getColumnvalue <em>Columnvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Columnvalue</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.BusinessRule#getColumnvalue()
   * @see #getBusinessRule()
   * @generated
   */
  EReference getBusinessRule_Columnvalue();

  /**
   * Returns the meta object for the containment reference '{@link com.r00lerz.ruleDef.ruleDef.BusinessRule#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.BusinessRule#getOperator()
   * @see #getBusinessRule()
   * @generated
   */
  EReference getBusinessRule_Operator();

  /**
   * Returns the meta object for the containment reference '{@link com.r00lerz.ruleDef.ruleDef.BusinessRule#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.BusinessRule#getValue()
   * @see #getBusinessRule()
   * @generated
   */
  EReference getBusinessRule_Value();

  /**
   * Returns the meta object for class '{@link com.r00lerz.ruleDef.ruleDef.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the containment reference '{@link com.r00lerz.ruleDef.ruleDef.Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.Value#getValue()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Value();

  /**
   * Returns the meta object for class '{@link com.r00lerz.ruleDef.ruleDef.ColumnValue <em>Column Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Value</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.ColumnValue
   * @generated
   */
  EClass getColumnValue();

  /**
   * Returns the meta object for the containment reference '{@link com.r00lerz.ruleDef.ruleDef.ColumnValue#getTablename <em>Tablename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tablename</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.ColumnValue#getTablename()
   * @see #getColumnValue()
   * @generated
   */
  EReference getColumnValue_Tablename();

  /**
   * Returns the meta object for the containment reference '{@link com.r00lerz.ruleDef.ruleDef.ColumnValue#getColumname <em>Columname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Columname</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.ColumnValue#getColumname()
   * @see #getColumnValue()
   * @generated
   */
  EReference getColumnValue_Columname();

  /**
   * Returns the meta object for class '{@link com.r00lerz.ruleDef.ruleDef.ColumnName <em>Column Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Name</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.ColumnName
   * @generated
   */
  EClass getColumnName();

  /**
   * Returns the meta object for the attribute '{@link com.r00lerz.ruleDef.ruleDef.ColumnName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.ColumnName#getName()
   * @see #getColumnName()
   * @generated
   */
  EAttribute getColumnName_Name();

  /**
   * Returns the meta object for class '{@link com.r00lerz.ruleDef.ruleDef.TableName <em>Table Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Name</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.TableName
   * @generated
   */
  EClass getTableName();

  /**
   * Returns the meta object for the attribute '{@link com.r00lerz.ruleDef.ruleDef.TableName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.TableName#getName()
   * @see #getTableName()
   * @generated
   */
  EAttribute getTableName_Name();

  /**
   * Returns the meta object for class '{@link com.r00lerz.ruleDef.ruleDef.StaticValue <em>Static Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Value</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.StaticValue
   * @generated
   */
  EClass getStaticValue();

  /**
   * Returns the meta object for the attribute '{@link com.r00lerz.ruleDef.ruleDef.StaticValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.StaticValue#getName()
   * @see #getStaticValue()
   * @generated
   */
  EAttribute getStaticValue_Name();

  /**
   * Returns the meta object for class '{@link com.r00lerz.ruleDef.ruleDef.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link com.r00lerz.ruleDef.ruleDef.Operator#getOperatorName <em>Operator Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator Name</em>'.
   * @see com.r00lerz.ruleDef.ruleDef.Operator#getOperatorName()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_OperatorName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RuleDefFactory getRuleDefFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.r00lerz.ruleDef.ruleDef.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.r00lerz.ruleDef.ruleDef.impl.BusinessRuleImpl
     * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getBusinessRule()
     * @generated
     */
    EClass BUSINESS_RULE = eINSTANCE.getBusinessRule();

    /**
     * The meta object literal for the '<em><b>Columnvalue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_RULE__COLUMNVALUE = eINSTANCE.getBusinessRule_Columnvalue();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_RULE__OPERATOR = eINSTANCE.getBusinessRule_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_RULE__VALUE = eINSTANCE.getBusinessRule_Value();

    /**
     * The meta object literal for the '{@link com.r00lerz.ruleDef.ruleDef.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.r00lerz.ruleDef.ruleDef.impl.ValueImpl
     * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__VALUE = eINSTANCE.getValue_Value();

    /**
     * The meta object literal for the '{@link com.r00lerz.ruleDef.ruleDef.impl.ColumnValueImpl <em>Column Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.r00lerz.ruleDef.ruleDef.impl.ColumnValueImpl
     * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getColumnValue()
     * @generated
     */
    EClass COLUMN_VALUE = eINSTANCE.getColumnValue();

    /**
     * The meta object literal for the '<em><b>Tablename</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_VALUE__TABLENAME = eINSTANCE.getColumnValue_Tablename();

    /**
     * The meta object literal for the '<em><b>Columname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_VALUE__COLUMNAME = eINSTANCE.getColumnValue_Columname();

    /**
     * The meta object literal for the '{@link com.r00lerz.ruleDef.ruleDef.impl.ColumnNameImpl <em>Column Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.r00lerz.ruleDef.ruleDef.impl.ColumnNameImpl
     * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getColumnName()
     * @generated
     */
    EClass COLUMN_NAME = eINSTANCE.getColumnName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_NAME__NAME = eINSTANCE.getColumnName_Name();

    /**
     * The meta object literal for the '{@link com.r00lerz.ruleDef.ruleDef.impl.TableNameImpl <em>Table Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.r00lerz.ruleDef.ruleDef.impl.TableNameImpl
     * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getTableName()
     * @generated
     */
    EClass TABLE_NAME = eINSTANCE.getTableName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_NAME__NAME = eINSTANCE.getTableName_Name();

    /**
     * The meta object literal for the '{@link com.r00lerz.ruleDef.ruleDef.impl.StaticValueImpl <em>Static Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.r00lerz.ruleDef.ruleDef.impl.StaticValueImpl
     * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getStaticValue()
     * @generated
     */
    EClass STATIC_VALUE = eINSTANCE.getStaticValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_VALUE__NAME = eINSTANCE.getStaticValue_Name();

    /**
     * The meta object literal for the '{@link com.r00lerz.ruleDef.ruleDef.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.r00lerz.ruleDef.ruleDef.impl.OperatorImpl
     * @see com.r00lerz.ruleDef.ruleDef.impl.RuleDefPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '<em><b>Operator Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__OPERATOR_NAME = eINSTANCE.getOperator_OperatorName();

  }

} //RuleDefPackage
