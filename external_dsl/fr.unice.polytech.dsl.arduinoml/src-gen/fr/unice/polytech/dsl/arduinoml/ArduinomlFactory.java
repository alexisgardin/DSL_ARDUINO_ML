/**
 */
package fr.unice.polytech.dsl.arduinoml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage
 * @generated
 */
public interface ArduinomlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinomlFactory eINSTANCE = fr.unice.polytech.dsl.arduinoml.impl.ArduinomlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App</em>'.
	 * @generated
	 */
	App createApp();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Brick</em>'.
	 * @generated
	 */
	Brick createBrick();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Single Element Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Element Condition</em>'.
	 * @generated
	 */
	SingleElementCondition createSingleElementCondition();

	/**
	 * Returns a new object of class '<em>Multiple Element Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Element Condition</em>'.
	 * @generated
	 */
	MultipleElementCondition createMultipleElementCondition();

	/**
	 * Returns a new object of class '<em>Value Element Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Element Condition</em>'.
	 * @generated
	 */
	ValueElementCondition createValueElementCondition();

	/**
	 * Returns a new object of class '<em>Binary Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Sensor</em>'.
	 * @generated
	 */
	BinarySensor createBinarySensor();

	/**
	 * Returns a new object of class '<em>Analog Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Sensor</em>'.
	 * @generated
	 */
	AnalogSensor createAnalogSensor();

	/**
	 * Returns a new object of class '<em>Analog Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Actuator</em>'.
	 * @generated
	 */
	AnalogActuator createAnalogActuator();

	/**
	 * Returns a new object of class '<em>Binary Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Actuator</em>'.
	 * @generated
	 */
	BinaryActuator createBinaryActuator();

	/**
	 * Returns a new object of class '<em>Analog Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Action</em>'.
	 * @generated
	 */
	AnalogAction createAnalogAction();

	/**
	 * Returns a new object of class '<em>Binary Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Action</em>'.
	 * @generated
	 */
	BinaryAction createBinaryAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArduinomlPackage getArduinomlPackage();

} //ArduinomlFactory
