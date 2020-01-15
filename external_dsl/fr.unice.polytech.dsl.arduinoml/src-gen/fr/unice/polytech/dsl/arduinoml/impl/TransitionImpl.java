/**
 */
package fr.unice.polytech.dsl.arduinoml.impl;

import fr.unice.polytech.dsl.arduinoml.ArduinomlPackage;
import fr.unice.polytech.dsl.arduinoml.SIGNAL;
import fr.unice.polytech.dsl.arduinoml.Sensor;
import fr.unice.polytech.dsl.arduinoml.State;
import fr.unice.polytech.dsl.arduinoml.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.impl.TransitionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.impl.TransitionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.impl.TransitionImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected State next;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinomlPackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.TRANSITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject) next;
			next = (State) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinomlPackage.TRANSITION__NEXT,
							oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(State newNext) {
		State oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.TRANSITION__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject) sensor;
			sensor = (Sensor) eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinomlPackage.TRANSITION__SENSOR,
							oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(Sensor newSensor) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.TRANSITION__SENSOR, oldSensor,
					sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinomlPackage.TRANSITION__VALUE:
			return getValue();
		case ArduinomlPackage.TRANSITION__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case ArduinomlPackage.TRANSITION__SENSOR:
			if (resolve)
				return getSensor();
			return basicGetSensor();
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
		case ArduinomlPackage.TRANSITION__VALUE:
			setValue((SIGNAL) newValue);
			return;
		case ArduinomlPackage.TRANSITION__NEXT:
			setNext((State) newValue);
			return;
		case ArduinomlPackage.TRANSITION__SENSOR:
			setSensor((Sensor) newValue);
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
		case ArduinomlPackage.TRANSITION__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ArduinomlPackage.TRANSITION__NEXT:
			setNext((State) null);
			return;
		case ArduinomlPackage.TRANSITION__SENSOR:
			setSensor((Sensor) null);
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
		case ArduinomlPackage.TRANSITION__VALUE:
			return value != VALUE_EDEFAULT;
		case ArduinomlPackage.TRANSITION__NEXT:
			return next != null;
		case ArduinomlPackage.TRANSITION__SENSOR:
			return sensor != null;
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

} //TransitionImpl
