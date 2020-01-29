/**
 */
package fr.unice.polytech.dsl.arduinoml.impl;

import fr.unice.polytech.dsl.arduinoml.ArduinomlPackage;
import fr.unice.polytech.dsl.arduinoml.Condition;
import fr.unice.polytech.dsl.arduinoml.MultipleElementCondition;
import fr.unice.polytech.dsl.arduinoml.OPERATOR;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Element Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.impl.MultipleElementConditionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link fr.unice.polytech.dsl.arduinoml.impl.MultipleElementConditionImpl#getOperators <em>Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleElementConditionImpl extends ConditionImpl implements MultipleElementCondition {
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getOperators() <em>Operators</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<OPERATOR> operators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleElementConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinomlPackage.Literals.MULTIPLE_ELEMENT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this,
					ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPERATOR> getOperators() {
		if (operators == null) {
			operators = new EDataTypeUniqueEList<OPERATOR>(OPERATOR.class, this,
					ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__OPERATORS);
		}
		return operators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__CONDITIONS:
			return getConditions();
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__OPERATORS:
			return getOperators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends Condition>) newValue);
			return;
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__OPERATORS:
			getOperators().clear();
			getOperators().addAll((Collection<? extends OPERATOR>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__CONDITIONS:
			getConditions().clear();
			return;
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__OPERATORS:
			getOperators().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		case ArduinomlPackage.MULTIPLE_ELEMENT_CONDITION__OPERATORS:
			return operators != null && !operators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operators: ");
		result.append(operators);
		result.append(')');
		return result.toString();
	}

} //MultipleElementConditionImpl
