/**
 */
package fr.unice.polytech.dsl.arduinoml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Element Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.ValueElementCondition#getValue <em>Value</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.ValueElementCondition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.ValueElementCondition#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getValueElementCondition()
 * @model
 * @generated
 */
public interface ValueElementCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getValueElementCondition_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.ValueElementCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(AnalogSensor)
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getValueElementCondition_Sensor()
	 * @model required="true"
	 * @generated
	 */
	AnalogSensor getSensor();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.ValueElementCondition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(AnalogSensor value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.polytech.dsl.arduinoml.COMPARATOR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see fr.unice.polytech.dsl.arduinoml.COMPARATOR
	 * @see #setComparator(COMPARATOR)
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#getValueElementCondition_Comparator()
	 * @model
	 * @generated
	 */
	COMPARATOR getComparator();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.dsl.arduinoml.ValueElementCondition#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see fr.unice.polytech.dsl.arduinoml.COMPARATOR
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(COMPARATOR value);

} // ValueElementCondition
