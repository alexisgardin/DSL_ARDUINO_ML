/**
 */
package fr.unice.polytech.dsl.arduinoml.impl;

import fr.unice.polytech.dsl.arduinoml.ArduinomlPackage;
import fr.unice.polytech.dsl.arduinoml.BinarySensor;
import fr.unice.polytech.dsl.arduinoml.SIGNAL;
import fr.unice.polytech.dsl.arduinoml.SingleElementCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Element Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.impl.SingleElementConditionImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.impl.SingleElementConditionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleElementConditionImpl extends ConditionImpl implements SingleElementCondition {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected BinarySensor sensor;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final SIGNAL VALUE_EDEFAULT = SIGNAL.HIGH;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected SIGNAL value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleElementConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinomlPackage.Literals.SINGLE_ELEMENT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject) sensor;
			sensor = (BinarySensor) eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ArduinomlPackage.SINGLE_ELEMENT_CONDITION__SENSOR, oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(BinarySensor newSensor) {
		BinarySensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.SINGLE_ELEMENT_CONDITION__SENSOR,
					oldSensor, sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIGNAL getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(SIGNAL newValue) {
		SIGNAL oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.SINGLE_ELEMENT_CONDITION__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinomlPackage.SINGLE_ELEMENT_CONDITION__SENSOR:
			if (resolve)
				return getSensor();
			return basicGetSensor();
		case ArduinomlPackage.SINGLE_ELEMENT_CONDITION__VALUE:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArduinomlPackage.SINGLE_ELEMENT_CONDITION__SENSOR:
			setSensor((BinarySensor) newValue);
			return;
		case ArduinomlPackage.SINGLE_ELEMENT_CONDITION__VALUE:
			setValue((SIGNAL) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArduinomlPackage.SINGLE_ELEMENT_CONDITION__SENSOR:
			setSensor((BinarySensor) null);
			return;
		case ArduinomlPackage.SINGLE_ELEMENT_CONDITION__VALUE:
			setValue(VALUE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArduinomlPackage.SINGLE_ELEMENT_CONDITION__SENSOR:
			return sensor != null;
		case ArduinomlPackage.SINGLE_ELEMENT_CONDITION__VALUE:
			return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SingleElementConditionImpl
