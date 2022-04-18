/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl2.trustworthy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl2.trustworthy.Sensor;
import org.xtext.example.mydsl2.trustworthy.TrustworthyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.trustworthy.impl.SensorImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.xtext.example.mydsl2.trustworthy.impl.SensorImpl#getPreset <em>Preset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends MinimalEObjectImpl.Container implements Sensor
{
  /**
   * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected static final int AMOUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected int amount = AMOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getPreset() <em>Preset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreset()
   * @generated
   * @ordered
   */
  protected static final String PRESET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreset() <em>Preset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreset()
   * @generated
   * @ordered
   */
  protected String preset = PRESET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SensorImpl()
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
    return TrustworthyPackage.Literals.SENSOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getAmount()
  {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAmount(int newAmount)
  {
    int oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrustworthyPackage.SENSOR__AMOUNT, oldAmount, amount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPreset()
  {
    return preset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPreset(String newPreset)
  {
    String oldPreset = preset;
    preset = newPreset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrustworthyPackage.SENSOR__PRESET, oldPreset, preset));
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
      case TrustworthyPackage.SENSOR__AMOUNT:
        return getAmount();
      case TrustworthyPackage.SENSOR__PRESET:
        return getPreset();
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
      case TrustworthyPackage.SENSOR__AMOUNT:
        setAmount((Integer)newValue);
        return;
      case TrustworthyPackage.SENSOR__PRESET:
        setPreset((String)newValue);
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
      case TrustworthyPackage.SENSOR__AMOUNT:
        setAmount(AMOUNT_EDEFAULT);
        return;
      case TrustworthyPackage.SENSOR__PRESET:
        setPreset(PRESET_EDEFAULT);
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
      case TrustworthyPackage.SENSOR__AMOUNT:
        return amount != AMOUNT_EDEFAULT;
      case TrustworthyPackage.SENSOR__PRESET:
        return PRESET_EDEFAULT == null ? preset != null : !PRESET_EDEFAULT.equals(preset);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (amount: ");
    result.append(amount);
    result.append(", preset: ");
    result.append(preset);
    result.append(')');
    return result.toString();
  }

} //SensorImpl
