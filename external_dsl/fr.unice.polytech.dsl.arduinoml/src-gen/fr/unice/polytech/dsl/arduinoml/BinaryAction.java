/**
 */
package fr.unice.polytech.dsl.arduinoml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.BinaryAction#getActionValue <em>Action Value</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getBinaryAction()
 * @model
 * @generated
 */
public interface BinaryAction extends Action {
	/**
	 * Returns the value of the '<em><b>Action Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.dsl.arduinoml.SIGNAL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Value</em>' attribute.
	 * @see fr.unice.polytech.dsl.arduinoml.SIGNAL
	 * @see #setActionValue(SIGNAL)
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getBinaryAction_ActionValue()
	 * @model
	 * @generated
	 */
	SIGNAL getActionValue();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.BinaryAction#getActionValue <em>Action Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Value</em>' attribute.
	 * @see fr.unice.polytech.dsl.arduinoml.SIGNAL
	 * @see #getActionValue()
	 * @generated
	 */
	void setActionValue(SIGNAL value);

} // BinaryAction
