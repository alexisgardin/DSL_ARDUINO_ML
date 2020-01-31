/**
 */
package fr.unice.polytech.dsl.arduinoml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.AnalogAction#getActionValue <em>Action Value</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getAnalogAction()
 * @model
 * @generated
 */
public interface AnalogAction extends Action {
	/**
	 * Returns the value of the '<em><b>Action Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Value</em>' attribute.
	 * @see #setActionValue(int)
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getAnalogAction_ActionValue()
	 * @model
	 * @generated
	 */
	int getActionValue();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.AnalogAction#getActionValue <em>Action Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Value</em>' attribute.
	 * @see #getActionValue()
	 * @generated
	 */
	void setActionValue(int value);

} // AnalogAction
