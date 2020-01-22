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
import fr.unice.polytech.dsl.arduinoml.Brick;
import fr.unice.polytech.dsl.arduinoml.Sensor;
import fr.unice.polytech.dsl.arduinoml.State;
import fr.unice.polytech.dsl.arduinoml.Transition;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;

public class KernelAdapter {
	
	private List<io.github.mosser.arduinoml.kernel.behavioral.State> states = new ArrayList();
	private List<io.github.mosser.arduinoml.kernel.structural.Sensor> sensors = new ArrayList();
	private List<io.github.mosser.arduinoml.kernel.structural.Actuator> actuators = new ArrayList();
	
	public io.github.mosser.arduinoml.kernel.structural.Brick mapBrick(Brick brickToConvert) {
		if (brickToConvert instanceof Sensor) {
			return mapSensor((Sensor) brickToConvert);
		}
		
		if (brickToConvert instanceof Actuator) {
			return mapActuator((Actuator) brickToConvert);
		}
		
		return null;
	}
	
	public io.github.mosser.arduinoml.kernel.structural.Sensor mapSensor(Sensor sensorToConvert) {
		io.github.mosser.arduinoml.kernel.structural.Sensor sensor = new io.github.mosser.arduinoml.kernel.structural.Sensor(); 
		sensor.setName(sensorToConvert.getName());
		sensor.setPin(sensorToConvert.getPin());
		sensors.add(sensor);
		System.out.println(sensor.getName());
		return sensor;
	}
	
	public io.github.mosser.arduinoml.kernel.structural.Actuator mapActuator(Actuator actuatorToConvert) {
		io.github.mosser.arduinoml.kernel.structural.Actuator actuator = new io.github.mosser.arduinoml.kernel.structural.Actuator();
		actuator.setName(actuatorToConvert.getName());
		actuator.setPin(actuatorToConvert.getPin());
		actuators.add(actuator);
		System.out.println(actuator.getName());
		return actuator;
	}
	
	public io.github.mosser.arduinoml.kernel.behavioral.State mapState(State stateToConvert) {
		io.github.mosser.arduinoml.kernel.behavioral.State state = new io.github.mosser.arduinoml.kernel.behavioral.State();
		state.setName(stateToConvert.getName());
		//state.setTransition(mapTransition(stateToConvert.getTransition()));
		state.setActions(
				stateToConvert.getActions()
								.stream()
								.map(action -> mapAction(action))
								.collect(Collectors.toList()));
		states.add(state);
		System.out.println(state);
		return state;
	}
	
	public io.github.mosser.arduinoml.kernel.behavioral.Action mapAction(Action actionToConvert) {
		io.github.mosser.arduinoml.kernel.behavioral.Action action = new io.github.mosser.arduinoml.kernel.behavioral.Action();
		action.setValue(SIGNAL.valueOf(actionToConvert.getValue().toString()));
		action.setActuator(mapActuator(actionToConvert.getActuator()));
		System.out.println(action);
		return action;
	}
	
	
	public List<io.github.mosser.arduinoml.kernel.behavioral.State> mapTransition(
			Transition transitionToConvert,
			Integer stateIndice,
			List<io.github.mosser.arduinoml.kernel.behavioral.State> kernelStates) {
		
		io.github.mosser.arduinoml.kernel.behavioral.Transition transition = new io.github.mosser.arduinoml.kernel.behavioral.Transition();
		transition.setValue(SIGNAL.valueOf(transitionToConvert.getValue().toString()));
		transition.setSensor(mapSensor(transitionToConvert.getSensor()));
		transition.setNext(kernelStates.stream().filter(state -> state.getName().equals(transitionToConvert.getNext().getName())).findFirst().get());
		
		kernelStates.get(stateIndice).setTransition(transition);
		System.out.println(transition);
		return kernelStates;
	}
	
	
	public List<io.github.mosser.arduinoml.kernel.behavioral.State> mapTransitionList(Map<Transition, Integer> transitionMapToConvert,
			List<io.github.mosser.arduinoml.kernel.behavioral.State> kernelStates){
			
		for(Transition transition : transitionMapToConvert.keySet()) {
			kernelStates = mapTransition(transition, transitionMapToConvert.get(transition), kernelStates);
		}
		return kernelStates;
		
	}
	
	public List<io.github.mosser.arduinoml.kernel.behavioral.State> mapStateList(List<State> statesToConvert){
		Map<Transition, Integer> transitionMapToConvert = new HashMap<>();
		List<io.github.mosser.arduinoml.kernel.behavioral.State> kernelStates = new ArrayList<>();
		
		int i=0;
		for(State state : statesToConvert) {
			io.github.mosser.arduinoml.kernel.behavioral.State kernelState = mapState(state);
			kernelStates.add(kernelState);
			transitionMapToConvert.put(state.getTransition(), i);
			i++;
		}
		
		kernelStates = mapTransitionList(transitionMapToConvert, kernelStates);
		return kernelStates;
		
	}
	
	
}
