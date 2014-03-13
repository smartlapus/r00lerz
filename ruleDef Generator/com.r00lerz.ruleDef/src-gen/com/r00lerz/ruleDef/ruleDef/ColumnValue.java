/**
 */
package com.r00lerz.ruleDef.ruleDef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.ColumnValue#getTablename <em>Tablename</em>}</li>
 *   <li>{@link com.r00lerz.ruleDef.ruleDef.ColumnValue#getColumname <em>Columname</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getColumnValue()
 * @model
 * @generated
 */
public interface ColumnValue extends Value
{
  /**
   * Returns the value of the '<em><b>Tablename</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tablename</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tablename</em>' containment reference.
   * @see #setTablename(TableName)
   * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getColumnValue_Tablename()
   * @model containment="true"
   * @generated
   */
  TableName getTablename();

  /**
   * Sets the value of the '{@link com.r00lerz.ruleDef.ruleDef.ColumnValue#getTablename <em>Tablename</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tablename</em>' containment reference.
   * @see #getTablename()
   * @generated
   */
  void setTablename(TableName value);

  /**
   * Returns the value of the '<em><b>Columname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columname</em>' containment reference.
   * @see #setColumname(ColumnName)
   * @see com.r00lerz.ruleDef.ruleDef.RuleDefPackage#getColumnValue_Columname()
   * @model containment="true"
   * @generated
   */
  ColumnName getColumname();

  /**
   * Sets the value of the '{@link com.r00lerz.ruleDef.ruleDef.ColumnValue#getColumname <em>Columname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columname</em>' containment reference.
   * @see #getColumname()
   * @generated
   */
  void setColumname(ColumnName value);

} // ColumnValue
