/**
 */
package fr.unice.polytech.dsl.arduinoml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.SingleElementCondition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.SingleElementCondition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getSingleElementCondition()
 * @model
 * @generated
 */
public interface SingleElementCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(BinarySensor)
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getSingleElementCondition_Sensor()
	 * @model required="true"
	 * @generated
	 */
	BinarySensor getSensor();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.SingleElementCondition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(BinarySensor value);

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
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getSingleElementCondition_Value()
	 * @model
	 * @generated
	 */
	SIGNAL getValue();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.SingleElementCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fr.unice.polytech.dsl.arduinoml.SIGNAL
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SIGNAL value);

} // SingleElementCondition
