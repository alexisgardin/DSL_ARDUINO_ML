/**
 */
package fr.unice.polytech.dsl.arduinoml.impl;

import fr.unice.polytech.dsl.arduinoml.Action;
import fr.unice.polytech.dsl.arduinoml.Actuator;
import fr.unice.polytech.dsl.arduinoml.AnalogSensor;
import fr.unice.polytech.dsl.arduinoml.App;
import fr.unice.polytech.dsl.arduinoml.ArduinomlFactory;
import fr.unice.polytech.dsl.arduinoml.ArduinomlPackage;
import fr.unice.polytech.dsl.arduinoml.BinarySensor;
import fr.unice.polytech.dsl.arduinoml.Brick;
import fr.unice.polytech.dsl.arduinoml.Condition;
import fr.unice.polytech.dsl.arduinoml.MultipleElementCondition;
import fr.unice.polytech.dsl.arduinoml.NamedElement;
import fr.unice.polytech.dsl.arduinoml.Sensor;
import fr.unice.polytech.dsl.arduinoml.SingleElementCondition;
import fr.unice.polytech.dsl.arduinoml.State;
import fr.unice.polytech.dsl.arduinoml.Transition;

import fr.unice.polytech.dsl.arduinoml.ValueElementCondition;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinomlPackageImpl extends EPackageImpl implements ArduinomlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brickEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleElementConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleElementConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueElementConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binarySensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinomlPackageImpl() {
		super(eNS_URI, ArduinomlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArduinomlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinomlPackage init() {
		if (isInited)
			return (ArduinomlPackage) EPackage.Registry.INSTANCE.getEPackage(ArduinomlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArduinomlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArduinomlPackageImpl theArduinomlPackage = registeredArduinomlPackage instanceof ArduinomlPackageImpl
				? (ArduinomlPackageImpl) registeredArduinomlPackage
				: new ArduinomlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theArduinomlPackage.createPackageContents();

		// Initialize created meta-data
		theArduinomlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinomlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinomlPackage.eNS_URI, theArduinomlPackage);
		return theArduinomlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp() {
		return appEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_States() {
		return (EReference) appEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Bricks() {
		return (EReference) appEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Initial() {
		return (EReference) appEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Actions() {
		return (EReference) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transition() {
		return (EReference) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrick() {
		return brickEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrick_Pin() {
		return (EAttribute) brickEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Value() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Actuator() {
		return (EReference) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Next() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Condition() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleElementCondition() {
		return singleElementConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleElementCondition_Sensor() {
		return (EReference) singleElementConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleElementCondition_Value() {
		return (EAttribute) singleElementConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleElementCondition() {
		return multipleElementConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleElementCondition_Conditions() {
		return (EReference) multipleElementConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleElementCondition_Operators() {
		return (EAttribute) multipleElementConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueElementCondition() {
		return valueElementConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueElementCondition_Value() {
		return (EAttribute) valueElementConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueElementCondition_Sensor() {
		return (EReference) valueElementConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinarySensor() {
		return binarySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogSensor() {
		return analogSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSIGNAL() {
		return signalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOPERATOR() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinomlFactory getArduinomlFactory() {
		return (ArduinomlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		appEClass = createEClass(APP);
		createEReference(appEClass, APP__STATES);
		createEReference(appEClass, APP__BRICKS);
		createEReference(appEClass, APP__INITIAL);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ACTIONS);
		createEReference(stateEClass, STATE__TRANSITION);

		brickEClass = createEClass(BRICK);
		createEAttribute(brickEClass, BRICK__PIN);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__VALUE);
		createEReference(actionEClass, ACTION__ACTUATOR);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__NEXT);
		createEReference(transitionEClass, TRANSITION__CONDITION);

		sensorEClass = createEClass(SENSOR);

		actuatorEClass = createEClass(ACTUATOR);

		conditionEClass = createEClass(CONDITION);

		singleElementConditionEClass = createEClass(SINGLE_ELEMENT_CONDITION);
		createEReference(singleElementConditionEClass, SINGLE_ELEMENT_CONDITION__SENSOR);
		createEAttribute(singleElementConditionEClass, SINGLE_ELEMENT_CONDITION__VALUE);

		multipleElementConditionEClass = createEClass(MULTIPLE_ELEMENT_CONDITION);
		createEReference(multipleElementConditionEClass, MULTIPLE_ELEMENT_CONDITION__CONDITIONS);
		createEAttribute(multipleElementConditionEClass, MULTIPLE_ELEMENT_CONDITION__OPERATORS);

		valueElementConditionEClass = createEClass(VALUE_ELEMENT_CONDITION);
		createEAttribute(valueElementConditionEClass, VALUE_ELEMENT_CONDITION__VALUE);
		createEReference(valueElementConditionEClass, VALUE_ELEMENT_CONDITION__SENSOR);

		binarySensorEClass = createEClass(BINARY_SENSOR);

		analogSensorEClass = createEClass(ANALOG_SENSOR);

		// Create enums
		signalEEnum = createEEnum(SIGNAL);
		operatorEEnum = createEEnum(OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		appEClass.getESuperTypes().add(this.getNamedElement());
		stateEClass.getESuperTypes().add(this.getNamedElement());
		brickEClass.getESuperTypes().add(this.getNamedElement());
		sensorEClass.getESuperTypes().add(this.getBrick());
		actuatorEClass.getESuperTypes().add(this.getBrick());
		singleElementConditionEClass.getESuperTypes().add(this.getCondition());
		multipleElementConditionEClass.getESuperTypes().add(this.getCondition());
		valueElementConditionEClass.getESuperTypes().add(this.getCondition());
		binarySensorEClass.getESuperTypes().add(this.getSensor());
		analogSensorEClass.getESuperTypes().add(this.getSensor());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appEClass, App.class, "App", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApp_States(), this.getState(), null, "states", null, 1, -1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApp_Bricks(), this.getBrick(), null, "bricks", null, 1, -1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApp_Initial(), this.getState(), null, "initial", null, 1, 1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Actions(), this.getAction(), null, "actions", null, 1, -1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getState_Transition(), this.getTransition(), null, "transition", null, 1, 1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brickEClass, Brick.class, "Brick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBrick_Pin(), ecorePackage.getEInt(), "pin", null, 0, 1, Brick.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Value(), this.getSIGNAL(), "value", null, 0, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Actuator(), this.getActuator(), null, "actuator", null, 1, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Next(), this.getState(), null, "next", null, 1, 1, Transition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTransition_Condition(), this.getMultipleElementCondition(), null, "condition", null, 1, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleElementConditionEClass, SingleElementCondition.class, "SingleElementCondition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleElementCondition_Sensor(), this.getBinarySensor(), null, "sensor", null, 1, 1,
				SingleElementCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleElementCondition_Value(), this.getSIGNAL(), "value", null, 0, 1,
				SingleElementCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleElementConditionEClass, MultipleElementCondition.class, "MultipleElementCondition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleElementCondition_Conditions(), this.getCondition(), null, "conditions", null, 1, -1,
				MultipleElementCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleElementCondition_Operators(), this.getOPERATOR(), "operators", null, 0, -1,
				MultipleElementCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueElementConditionEClass, ValueElementCondition.class, "ValueElementCondition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueElementCondition_Value(), ecorePackage.getEFloat(), "value", null, 0, 1,
				ValueElementCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueElementCondition_Sensor(), this.getAnalogSensor(), null, "sensor", null, 1, 1,
				ValueElementCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binarySensorEClass, BinarySensor.class, "BinarySensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(analogSensorEClass, AnalogSensor.class, "AnalogSensor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(signalEEnum, fr.unice.polytech.dsl.arduinoml.SIGNAL.class, "SIGNAL");
		addEEnumLiteral(signalEEnum, fr.unice.polytech.dsl.arduinoml.SIGNAL.HIGH);
		addEEnumLiteral(signalEEnum, fr.unice.polytech.dsl.arduinoml.SIGNAL.LOW);

		initEEnum(operatorEEnum, fr.unice.polytech.dsl.arduinoml.OPERATOR.class, "OPERATOR");
		addEEnumLiteral(operatorEEnum, fr.unice.polytech.dsl.arduinoml.OPERATOR.AND);
		addEEnumLiteral(operatorEEnum, fr.unice.polytech.dsl.arduinoml.OPERATOR.OR);

		// Create resource
		createResource(eNS_URI);
	}

} //ArduinomlPackageImpl
