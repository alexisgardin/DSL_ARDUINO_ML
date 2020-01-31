/**
 */
package fr.unice.polytech.dsl.arduinoml.impl;

import fr.unice.polytech.dsl.arduinoml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinomlFactoryImpl extends EFactoryImpl implements ArduinomlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArduinomlFactory init() {
		try {
			ArduinomlFactory theArduinomlFactory = (ArduinomlFactory) EPackage.Registry.INSTANCE
					.getEFactory(ArduinomlPackage.eNS_URI);
			if (theArduinomlFactory != null) {
				return theArduinomlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArduinomlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinomlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ArduinomlPackage.APP:
			return createApp();
		case ArduinomlPackage.STATE:
			return createState();
		case ArduinomlPackage.BRICK:
			return createBrick();
		case ArduinomlPackage.TRANSITION:
			return createTransition();
		case ArduinomlPackage.SINGLE_ELEMENT_CONDITION:
			return createSingleElementCondition();
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION:
			return createMultipleElementCondition();
		case ArduinomlPackage.VALUE_ELEMENT_CONDITION:
			return createValueElementCondition();
		case ArduinomlPackage.BINARY_SENSOR:
			return createBinarySensor();
		case ArduinomlPackage.ANALOG_SENSOR:
			return createAnalogSensor();
		case ArduinomlPackage.ANALOG_ACTUATOR:
			return createAnalogActuator();
		case ArduinomlPackage.BINARY_ACTUATOR:
			return createBinaryActuator();
		case ArduinomlPackage.ANALOG_ACTION:
			return createAnalogAction();
		case ArduinomlPackage.BINARY_ACTION:
			return createBinaryAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ArduinomlPackage.SIGNAL:
			return createSIGNALFromString(eDataType, initialValue);
		case ArduinomlPackage.OPERATOR:
			return createOPERATORFromString(eDataType, initialValue);
		case ArduinomlPackage.COMPARATOR:
			return createCOMPARATORFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ArduinomlPackage.SIGNAL:
			return convertSIGNALToString(eDataType, instanceValue);
		case ArduinomlPackage.OPERATOR:
			return convertOPERATORToString(eDataType, instanceValue);
		case ArduinomlPackage.COMPARATOR:
			return convertCOMPARATORToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public App createApp() {
		AppImpl app = new AppImpl();
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brick createBrick() {
		BrickImpl brick = new BrickImpl();
		return brick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElementCondition createSingleElementCondition() {
		SingleElementConditionImpl singleElementCondition = new SingleElementConditionImpl();
		return singleElementCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleElementCondition createMultipleElementCondition() {
		MultipleElementConditionImpl multipleElementCondition = new MultipleElementConditionImpl();
		return multipleElementCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueElementCondition createValueElementCondition() {
		ValueElementConditionImpl valueElementCondition = new ValueElementConditionImpl();
		return valueElementCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySensor createBinarySensor() {
		BinarySensorImpl binarySensor = new BinarySensorImpl();
		return binarySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogSensor createAnalogSensor() {
		AnalogSensorImpl analogSensor = new AnalogSensorImpl();
		return analogSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogActuator createAnalogActuator() {
		AnalogActuatorImpl analogActuator = new AnalogActuatorImpl();
		return analogActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryActuator createBinaryActuator() {
		BinaryActuatorImpl binaryActuator = new BinaryActuatorImpl();
		return binaryActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogAction createAnalogAction() {
		AnalogActionImpl analogAction = new AnalogActionImpl();
		return analogAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryAction createBinaryAction() {
		BinaryActionImpl binaryAction = new BinaryActionImpl();
		return binaryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIGNAL createSIGNALFromString(EDataType eDataType, String initialValue) {
		SIGNAL result = SIGNAL.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIGNALToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPERATOR createOPERATORFromString(EDataType eDataType, String initialValue) {
		OPERATOR result = OPERATOR.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOPERATORToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COMPARATOR createCOMPARATORFromString(EDataType eDataType, String initialValue) {
		COMPARATOR result = COMPARATOR.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOMPARATORToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinomlPackage getArduinomlPackage() {
		return (ArduinomlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArduinomlPackage getPackage() {
		return ArduinomlPackage.eINSTANCE;
	}

} //ArduinomlFactoryImpl
