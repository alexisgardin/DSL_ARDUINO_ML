/**
 */
package fr.unice.polytech.dsl.arduinoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.Transition#getValue <em>Value</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.Transition#getNext <em>Next</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.Transition#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.dsl.arduinoml.SIGNAL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fr.unice.polytech.dsl.arduinoml.SIGNAL
	 * @see #setValue(SIGNAL)
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getTransition_Value()
	 * @model
	 * @generated
	 */
	SIGNAL getValue();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.Transition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fr.unice.polytech.dsl.arduinoml.SIGNAL
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SIGNAL value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(State)
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getTransition_Next()
	 * @model required="true"
	 * @generated
	 */
	State getNext();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.Transition#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(State value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getTransition_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.Transition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // Transition
