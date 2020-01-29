/**
 */
package fr.unice.polytech.dsl.arduinoml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Element Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.MultipleElementCondition#getConditions <em>Conditions</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.MultipleElementCondition#getOperators <em>Operators</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getMultipleElementCondition()
 * @model
 * @generated
 */
public interface MultipleElementCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.arduinoml.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getMultipleElementCondition_Conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Operators</b></em>' attribute list.
	 * The list contents are of type {@link fr.unice.polytech.dsl.arduinoml.OPERATOR}.
	 * The literals are from the enumeration {@link fr.unice.polytech.dsl.arduinoml.OPERATOR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' attribute list.
	 * @see fr.unice.polytech.dsl.arduinoml.OPERATOR
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getMultipleElementCondition_Operators()
	 * @model
	 * @generated
	 */
	EList<OPERATOR> getOperators();

} // MultipleElementCondition
