/**
 */
package fr.unice.polytech.dsl.arduinoml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.App#getStates <em>States</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.App#getBricks <em>Bricks</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.App#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getApp()
 * @model
 * @generated
 */
public interface App extends NamedElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.arduinoml.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getApp_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Bricks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.arduinoml.Brick}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bricks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bricks</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getApp_Bricks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Brick> getBricks();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(State)
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getApp_Initial()
	 * @model required="true"
	 * @generated
	 */
	State getInitial();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.App#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(State value);

} // App
