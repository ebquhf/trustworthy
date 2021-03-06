/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl2.trustworthy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.trustworthy.Sensor#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.trustworthy.Sensor#getPreset <em>Preset</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl2.trustworthy.TrustworthyPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject
{
  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(int)
   * @see org.xtext.example.mydsl2.trustworthy.TrustworthyPackage#getSensor_Amount()
   * @model
   * @generated
   */
  int getAmount();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.trustworthy.Sensor#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(int value);

  /**
   * Returns the value of the '<em><b>Preset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preset</em>' attribute.
   * @see #setPreset(String)
   * @see org.xtext.example.mydsl2.trustworthy.TrustworthyPackage#getSensor_Preset()
   * @model
   * @generated
   */
  String getPreset();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl2.trustworthy.Sensor#getPreset <em>Preset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preset</em>' attribute.
   * @see #getPreset()
   * @generated
   */
  void setPreset(String value);

} // Sensor
