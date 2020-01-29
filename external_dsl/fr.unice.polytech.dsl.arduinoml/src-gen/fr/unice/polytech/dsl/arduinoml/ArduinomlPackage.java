/**
 */
package fr.unice.polytech.dsl.arduinoml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.dsl.arduinoml.ArduinomlFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinomlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduinoml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.unice.polytech.dsl/arduinoml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduinoml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinomlPackage eINSTANCE = fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.NamedElementImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.AppImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getApp()
	 * @generated
	 */
	int APP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__STATES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bricks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__BRICKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__INITIAL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.StateImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.BrickImpl <em>Brick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.BrickImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getBrick()
	 * @generated
	 */
	int BRICK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__PIN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ActionImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTUATOR = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.TransitionImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.SensorImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = BRICK__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PIN = BRICK__PIN;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = BRICK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = BRICK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ActuatorImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = BRICK__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PIN = BRICK__PIN;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = BRICK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = BRICK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ConditionImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 8;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.SingleElementConditionImpl <em>Single Element Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.SingleElementConditionImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getSingleElementCondition()
	 * @generated
	 */
	int SINGLE_ELEMENT_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_CONDITION__SENSOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Element Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Single Element Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELEMENT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.impl.MultipleElementConditionImpl <em>Multiple Element Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.impl.MultipleElementConditionImpl
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getMultipleElementCondition()
	 * @generated
	 */
	int MULTIPLE_ELEMENT_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ELEMENT_CONDITION__CONDITIONS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operators</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ELEMENT_CONDITION__OPERATORS = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiple Element Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ELEMENT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiple Element Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ELEMENT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.SIGNAL <em>SIGNAL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.SIGNAL
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getSIGNAL()
	 * @generated
	 */
	int SIGNAL = 11;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.dsl.arduinoml.OPERATOR <em>OPERATOR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.dsl.arduinoml.OPERATOR
	 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getOPERATOR()
	 * @generated
	 */
	int OPERATOR = 12;

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.arduinoml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.arduinoml.App#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.App#getStates()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_States();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.arduinoml.App#getBricks <em>Bricks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bricks</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.App#getBricks()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Bricks();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.dsl.arduinoml.App#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.App#getInitial()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Initial();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.arduinoml.State#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.State#getActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.dsl.arduinoml.State#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.State#getTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transition();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Brick
	 * @generated
	 */
	EClass getBrick();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.arduinoml.Brick#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Brick#getPin()
	 * @see #getBrick()
	 * @generated
	 */
	EAttribute getBrick_Pin();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.arduinoml.Action#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Action#getValue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Value();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.dsl.arduinoml.Action#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Action#getActuator()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actuator();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.dsl.arduinoml.Transition#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Transition#getNext()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Next();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.dsl.arduinoml.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Condition();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.SingleElementCondition <em>Single Element Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Element Condition</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.SingleElementCondition
	 * @generated
	 */
	EClass getSingleElementCondition();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.dsl.arduinoml.SingleElementCondition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.SingleElementCondition#getSensor()
	 * @see #getSingleElementCondition()
	 * @generated
	 */
	EReference getSingleElementCondition_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.dsl.arduinoml.SingleElementCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.SingleElementCondition#getValue()
	 * @see #getSingleElementCondition()
	 * @generated
	 */
	EAttribute getSingleElementCondition_Value();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.dsl.arduinoml.MultipleElementCondition <em>Multiple Element Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Element Condition</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.MultipleElementCondition
	 * @generated
	 */
	EClass getMultipleElementCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.dsl.arduinoml.MultipleElementCondition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.MultipleElementCondition#getConditions()
	 * @see #getMultipleElementCondition()
	 * @generated
	 */
	EReference getMultipleElementCondition_Conditions();

	/**
	 * Returns the meta object for the attribute list '{@link fr.unice.polytech.dsl.arduinoml.MultipleElementCondition#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operators</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.MultipleElementCondition#getOperators()
	 * @see #getMultipleElementCondition()
	 * @generated
	 */
	EAttribute getMultipleElementCondition_Operators();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.dsl.arduinoml.SIGNAL <em>SIGNAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SIGNAL</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.SIGNAL
	 * @generated
	 */
	EEnum getSIGNAL();

	/**
	 * Returns the meta object for enum '{@link fr.unice.polytech.dsl.arduinoml.OPERATOR <em>OPERATOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OPERATOR</em>'.
	 * @see fr.unice.polytech.dsl.arduinoml.OPERATOR
	 * @generated
	 */
	EEnum getOPERATOR();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinomlFactory getArduinomlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.NamedElementImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.AppImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__STATES = eINSTANCE.getApp_States();

		/**
		 * The meta object literal for the '<em><b>Bricks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__BRICKS = eINSTANCE.getApp_Bricks();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__INITIAL = eINSTANCE.getApp_Initial();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.StateImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION = eINSTANCE.getState_Transition();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.BrickImpl <em>Brick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.BrickImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getBrick()
		 * @generated
		 */
		EClass BRICK = eINSTANCE.getBrick();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK__PIN = eINSTANCE.getBrick_Pin();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ActionImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALUE = eINSTANCE.getAction_Value();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTUATOR = eINSTANCE.getAction_Actuator();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.TransitionImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__NEXT = eINSTANCE.getTransition_Next();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.SensorImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ActuatorImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ConditionImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.SingleElementConditionImpl <em>Single Element Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.SingleElementConditionImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getSingleElementCondition()
		 * @generated
		 */
		EClass SINGLE_ELEMENT_CONDITION = eINSTANCE.getSingleElementCondition();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ELEMENT_CONDITION__SENSOR = eINSTANCE.getSingleElementCondition_Sensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_ELEMENT_CONDITION__VALUE = eINSTANCE.getSingleElementCondition_Value();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.impl.MultipleElementConditionImpl <em>Multiple Element Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.impl.MultipleElementConditionImpl
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getMultipleElementCondition()
		 * @generated
		 */
		EClass MULTIPLE_ELEMENT_CONDITION = eINSTANCE.getMultipleElementCondition();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_ELEMENT_CONDITION__CONDITIONS = eINSTANCE.getMultipleElementCondition_Conditions();

		/**
		 * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_ELEMENT_CONDITION__OPERATORS = eINSTANCE.getMultipleElementCondition_Operators();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.SIGNAL <em>SIGNAL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.SIGNAL
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getSIGNAL()
		 * @generated
		 */
		EEnum SIGNAL = eINSTANCE.getSIGNAL();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.dsl.arduinoml.OPERATOR <em>OPERATOR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.dsl.arduinoml.OPERATOR
		 * @see fr.unice.polytech.dsl.arduinoml.impl.ArduinomlPackageImpl#getOPERATOR()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOPERATOR();

	}

} //ArduinomlPackage
