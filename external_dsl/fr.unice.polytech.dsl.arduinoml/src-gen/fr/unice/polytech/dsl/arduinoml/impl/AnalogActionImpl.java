/**
 */
package fr.unice.polytech.dsl.arduinoml.impl;

import fr.unice.polytech.dsl.arduinoml.AnalogAction;
import fr.unice.polytech.dsl.arduinoml.ArduinomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.impl.AnalogActionImpl#getActionValue <em>Action Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogActionImpl extends ActionImpl implements AnalogAction {
	/**
	 * The default value of the '{@link #getActionValue() <em>Action Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionValue()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTION_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActionValue() <em>Action Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionValue()
	 * @generated
	 * @ordered
	 */
	protected int actionValue = ACTION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinomlPackage.Literals.ANALOG_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActionValue() {
		return actionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionValue(int newActionValue) {
		int oldActionValue = actionValue;
		actionValue = newActionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.ANALOG_ACTION__ACTION_VALUE,
					oldActionValue, actionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinomlPackage.ANALOG_ACTION__ACTION_VALUE:
			return getActionValue();
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
		case ArduinomlPackage.ANALOG_ACTION__ACTION_VALUE:
			setActionValue((Integer) newValue);
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
		case ArduinomlPackage.ANALOG_ACTION__ACTION_VALUE:
			setActionValue(ACTION_VALUE_EDEFAULT);
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
		case ArduinomlPackage.ANALOG_ACTION__ACTION_VALUE:
			return actionValue != ACTION_VALUE_EDEFAULT;
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
		result.append(" (actionValue: ");
		result.append(actionValue);
		result.append(')');
		return result.toString();
	}

} //AnalogActionImpl
