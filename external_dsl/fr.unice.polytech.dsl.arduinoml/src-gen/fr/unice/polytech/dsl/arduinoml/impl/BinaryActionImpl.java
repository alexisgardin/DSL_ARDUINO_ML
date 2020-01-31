/**
 */
package fr.unice.polytech.dsl.arduinoml.impl;

import fr.unice.polytech.dsl.arduinoml.ArduinomlPackage;
import fr.unice.polytech.dsl.arduinoml.BinaryAction;
import fr.unice.polytech.dsl.arduinoml.SIGNAL;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.impl.BinaryActionImpl#getActionValue <em>Action Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryActionImpl extends ActionImpl implements BinaryAction {
	/**
	 * The default value of the '{@link #getActionValue() <em>Action Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionValue()
	 * @generated
	 * @ordered
	 */
	protected static final SIGNAL ACTION_VALUE_EDEFAULT = SIGNAL.HIGH;

	/**
	 * The cached value of the '{@link #getActionValue() <em>Action Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionValue()
	 * @generated
	 * @ordered
	 */
	protected SIGNAL actionValue = ACTION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinomlPackage.Literals.BINARY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIGNAL getActionValue() {
		return actionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionValue(SIGNAL newActionValue) {
		SIGNAL oldActionValue = actionValue;
		actionValue = newActionValue == null ? ACTION_VALUE_EDEFAULT : newActionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinomlPackage.BINARY_ACTION__ACTION_VALUE,
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
		case ArduinomlPackage.BINARY_ACTION__ACTION_VALUE:
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
		case ArduinomlPackage.BINARY_ACTION__ACTION_VALUE:
			setActionValue((SIGNAL) newValue);
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
		case ArduinomlPackage.BINARY_ACTION__ACTION_VALUE:
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
		case ArduinomlPackage.BINARY_ACTION__ACTION_VALUE:
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

} //BinaryActionImpl
