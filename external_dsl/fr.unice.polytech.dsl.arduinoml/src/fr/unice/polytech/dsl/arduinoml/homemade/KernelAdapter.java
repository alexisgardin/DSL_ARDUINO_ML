package fr.unice.polytech.dsl.arduinoml.homemade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import fr.unice.polytech.dsl.arduinoml.Action;
import fr.unice.polytech.dsl.arduinoml.Actuator;
import fr.unice.polytech.dsl.arduinoml.AnalogSensor;
import fr.unice.polytech.dsl.arduinoml.Brick;
import fr.unice.polytech.dsl.arduinoml.Condition;
import fr.unice.polytech.dsl.arduinoml.MultipleElementCondition;
import fr.unice.polytech.dsl.arduinoml.OPERATOR;
import fr.unice.polytech.dsl.arduinoml.Sensor;
import fr.unice.polytech.dsl.arduinoml.State;
import fr.unice.polytech.dsl.arduinoml.Transition;
import fr.unice.polytech.dsl.arduinoml.ValueElementCondition;
import fr.unice.polytech.dsl.arduinoml.impl.MultipleElementConditionImpl;
import fr.unice.polytech.dsl.arduinoml.impl.SingleElementConditionImpl;
import fr.unice.polytech.dsl.arduinoml.impl.ValueElementConditionImpl;
import fr.unice.polytech.dsl.kernel.behavioral.Operator;
import fr.unice.polytech.dsl.kernel.behavioral.condition.Comparator;
import fr.unice.polytech.dsl.kernel.behavioral.condition.SingleElementCondition;
import fr.unice.polytech.dsl.kernel.structural.DigitalSensor;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;

public class KernelAdapter {

	private List<fr.unice.polytech.dsl.kernel.behavioral.State> states = new ArrayList();
	private List<fr.unice.polytech.dsl.kernel.structural.Sensor> sensors = new ArrayList();
	private List<fr.unice.polytech.dsl.kernel.structural.Actuator> actuators = new ArrayList();

	public fr.unice.polytech.dsl.kernel.structural.Brick mapBrick(Brick brickToConvert) {
		if (brickToConvert instanceof Sensor) {
			return mapSensor((Sensor) brickToConvert);
		}

		if (brickToConvert instanceof Actuator) {
			return mapActuator((Actuator) brickToConvert);
		}

		return null;
	}

	public fr.unice.polytech.dsl.kernel.structural.Sensor mapSensor(Sensor sensorToConvert) {
		fr.unice.polytech.dsl.kernel.structural.Sensor sensor;
		if (sensorToConvert instanceof AnalogSensor) {
			sensor = new fr.unice.polytech.dsl.kernel.structural.AnalogSensor();
		} else {
			sensor = new fr.unice.polytech.dsl.kernel.structural.DigitalSensor();
		}

		sensor.setName(sensorToConvert.getName());
		sensor.setPin(sensorToConvert.getPin());
		sensors.add(sensor);
		return sensor;
	}

	public fr.unice.polytech.dsl.kernel.structural.Actuator mapActuator(Actuator actuatorToConvert) {
		fr.unice.polytech.dsl.kernel.structural.Actuator actuator = new fr.unice.polytech.dsl.kernel.structural.Actuator();
		actuator.setName(actuatorToConvert.getName());
		actuator.setPin(actuatorToConvert.getPin());
		actuators.add(actuator);
		return actuator;
	}

	public fr.unice.polytech.dsl.kernel.behavioral.State mapState(State stateToConvert) {
		fr.unice.polytech.dsl.kernel.behavioral.State state = new fr.unice.polytech.dsl.kernel.behavioral.State();
		state.setName(stateToConvert.getName());
		// state.setTransition(mapTransition(stateToConvert.getTransition()));
		state.setActions(
				stateToConvert.getActions().stream().map(action -> mapAction(action)).collect(Collectors.toList()));
		states.add(state);
		return state;
	}

	public fr.unice.polytech.dsl.kernel.behavioral.Action mapAction(Action actionToConvert) {
		fr.unice.polytech.dsl.kernel.behavioral.Action action = new fr.unice.polytech.dsl.kernel.behavioral.Action();
		action.setValue(SIGNAL.valueOf(actionToConvert.getValue().toString()));
		action.setActuator(mapActuator(actionToConvert.getActuator()));
		return action;
	}

	public List<fr.unice.polytech.dsl.kernel.behavioral.State> mapTransition(Transition transitionToConvert,
			Integer stateIndice, List<fr.unice.polytech.dsl.kernel.behavioral.State> kernelStates) {

		fr.unice.polytech.dsl.kernel.behavioral.Transition transition = new fr.unice.polytech.dsl.kernel.behavioral.Transition();
		transition.setCondition(mapCondition(transitionToConvert.getCondition()));
		transition.setNext(kernelStates.stream()
				.filter(state -> state.getName().equals(transitionToConvert.getNext().getName())).findFirst().get());

		kernelStates.get(stateIndice).setTransition(transition);
		return kernelStates;
	}

	public List<fr.unice.polytech.dsl.kernel.behavioral.State> mapTransitionList(
			Map<Transition, Integer> transitionMapToConvert,
			List<fr.unice.polytech.dsl.kernel.behavioral.State> kernelStates) {

		for (Transition transition : transitionMapToConvert.keySet()) {
			kernelStates = mapTransition(transition, transitionMapToConvert.get(transition), kernelStates);
		}
		return kernelStates;

	}

	public List<fr.unice.polytech.dsl.kernel.behavioral.State> mapStateList(List<State> statesToConvert) {
		Map<Transition, Integer> transitionMapToConvert = new HashMap<>();
		List<fr.unice.polytech.dsl.kernel.behavioral.State> kernelStates = new ArrayList<>();

		int i = 0;
		for (State state : statesToConvert) {
			fr.unice.polytech.dsl.kernel.behavioral.State kernelState = mapState(state);
			kernelStates.add(kernelState);
			transitionMapToConvert.put(state.getTransition(), i);
			i++;
		}

		kernelStates = mapTransitionList(transitionMapToConvert, kernelStates);
		return kernelStates;

	}

	public fr.unice.polytech.dsl.kernel.behavioral.condition.Condition mapCondition(Condition condition) {
		if (condition instanceof MultipleElementCondition) {
			MultipleElementConditionImpl xtextCondition = (MultipleElementConditionImpl) condition;

			fr.unice.polytech.dsl.kernel.behavioral.condition.MultipleElementCondition kernelCondition = new fr.unice.polytech.dsl.kernel.behavioral.condition.MultipleElementCondition();

			kernelCondition.setConditionList(xtextCondition.getConditions().stream().map(cond -> mapCondition(cond))
					.collect(Collectors.toList()));

			for (OPERATOR operator : xtextCondition.getOperators()) {
				kernelCondition.addOperator(Operator.valueOf(operator.toString().toUpperCase()));
			}

			return kernelCondition;
			
		} else if (condition instanceof ValueElementCondition) {
			ValueElementConditionImpl xtextCondition = (ValueElementConditionImpl) condition;

			fr.unice.polytech.dsl.kernel.behavioral.condition.ValueElementCondition kernelCondition = new fr.unice.polytech.dsl.kernel.behavioral.condition.ValueElementCondition<>();

			kernelCondition.setSensor(
					(fr.unice.polytech.dsl.kernel.structural.AnalogSensor) mapSensor(xtextCondition.getSensor()));
			kernelCondition.setValue(xtextCondition.getValue());
			kernelCondition.setComparator(Comparator.valueOf(xtextCondition.getComparator().toString()));

			return kernelCondition;
		} else {
			SingleElementConditionImpl xtextCondition = (SingleElementConditionImpl) condition;

			SingleElementCondition kernelCondition = new SingleElementCondition();

			kernelCondition.setSensor((DigitalSensor) mapSensor(xtextCondition.getSensor()));
			kernelCondition.setSignal(SIGNAL.valueOf(xtextCondition.getValue().toString()));

			return kernelCondition;
		}
	}

}
