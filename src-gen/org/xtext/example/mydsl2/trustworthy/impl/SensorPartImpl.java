/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl2.trustworthy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl2.trustworthy.Sensor;
import org.xtext.example.mydsl2.trustworthy.SensorPart;
import org.xtext.example.mydsl2.trustworthy.TrustworthyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.trustworthy.impl.SensorPartImpl#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorPartImpl extends RoomImpl implements SensorPart
{
  /**
   * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensors()
   * @generated
   * @ordered
   */
  protected EList<Sensor> sensors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SensorPartImpl()
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
    return TrustworthyPackage.Literals.SENSOR_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Sensor> getSensors()
  {
    if (sensors == null)
    {
      sensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, TrustworthyPackage.SENSOR_PART__SENSORS);
    }
    return sensors;
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
      case TrustworthyPackage.SENSOR_PART__SENSORS:
        return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
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
      case TrustworthyPackage.SENSOR_PART__SENSORS:
        return getSensors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TrustworthyPackage.SENSOR_PART__SENSORS:
        getSensors().clear();
        getSensors().addAll((Collection<? extends Sensor>)newValue);
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
      case TrustworthyPackage.SENSOR_PART__SENSORS:
        getSensors().clear();
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
      case TrustworthyPackage.SENSOR_PART__SENSORS:
        return sensors != null && !sensors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SensorPartImpl
