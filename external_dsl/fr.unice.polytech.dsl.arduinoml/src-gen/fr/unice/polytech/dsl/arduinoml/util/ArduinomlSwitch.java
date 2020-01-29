/**
 */
package fr.unice.polytech.dsl.arduinoml.util;

import fr.unice.polytech.dsl.arduinoml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage
 * @generated
 */
public class ArduinomlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinomlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinomlSwitch() {
		if (modelPackage == null) {
			modelPackage = ArduinomlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ArduinomlPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.APP: {
			App app = (App) theEObject;
			T result = caseApp(app);
			if (result == null)
				result = caseNamedElement(app);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.STATE: {
			State state = (State) theEObject;
			T result = caseState(state);
			if (result == null)
				result = caseNamedElement(state);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.BRICK: {
			Brick brick = (Brick) theEObject;
			T result = caseBrick(brick);
			if (result == null)
				result = caseNamedElement(brick);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseBrick(sensor);
			if (result == null)
				result = caseNamedElement(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.ACTUATOR: {
			Actuator actuator = (Actuator) theEObject;
			T result = caseActuator(actuator);
			if (result == null)
				result = caseBrick(actuator);
			if (result == null)
				result = caseNamedElement(actuator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.SINGLE_ELEMENT_CONDITION: {
			SingleElementCondition singleElementCondition = (SingleElementCondition) theEObject;
			T result = caseSingleElementCondition(singleElementCondition);
			if (result == null)
				result = caseCondition(singleElementCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION: {
			MultipleElementCondition multipleElementCondition = (MultipleElementCondition) theEObject;
			T result = caseMultipleElementCondition(multipleElementCondition);
			if (result == null)
				result = caseCondition(multipleElementCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.VALUE_ELEMENT_CONDITION: {
			ValueElementCondition valueElementCondition = (ValueElementCondition) theEObject;
			T result = caseValueElementCondition(valueElementCondition);
			if (result == null)
				result = caseCondition(valueElementCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.BINARY_SENSOR: {
			BinarySensor binarySensor = (BinarySensor) theEObject;
			T result = caseBinarySensor(binarySensor);
			if (result == null)
				result = caseSensor(binarySensor);
			if (result == null)
				result = caseBrick(binarySensor);
			if (result == null)
				result = caseNamedElement(binarySensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinomlPackage.ANALOG_SENSOR: {
			AnalogSensor analogSensor = (AnalogSensor) theEObject;
			T result = caseAnalogSensor(analogSensor);
			if (result == null)
				result = caseSensor(analogSensor);
			if (result == null)
				result = caseBrick(analogSensor);
			if (result == null)
				result = caseNamedElement(analogSensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApp(App object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrick(Brick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Element Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Element Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleElementCondition(SingleElementCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Element Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Element Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleElementCondition(MultipleElementCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Element Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Element Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueElementCondition(ValueElementCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinarySensor(BinarySensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogSensor(AnalogSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArduinomlSwitch
