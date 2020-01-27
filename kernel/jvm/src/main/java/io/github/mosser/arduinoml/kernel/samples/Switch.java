package io.github.mosser.arduinoml.kernel.samples;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.*;
import io.github.mosser.arduinoml.kernel.generator.ToWiring;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.*;

import java.util.Arrays;

public class Switch {

	public static void main(String[] args) {

		//basic_case();
		two_buttons_basic_case();
	}

	private static void basic_case(){

		// Declaring elementary bricks
		Sensor button = new Sensor();
		button.setName("button");
		button.setPin(9);

		Actuator led = new Actuator();
		led.setName("LED");
		led.setPin(12);

		// Declaring states
		State on = new State();
		on.setName("on");

		State off = new State();
		off.setName("off");

		// Creating actions
		Action switchTheLightOn = new Action();
		switchTheLightOn.setActuator(led);
		switchTheLightOn.setValue(SIGNAL.HIGH);

		Action switchTheLightOff = new Action();
		switchTheLightOff.setActuator(led);
		switchTheLightOff.setValue(SIGNAL.LOW);

		// Binding actions to states
		on.setActions(Arrays.asList(switchTheLightOn));
		off.setActions(Arrays.asList(switchTheLightOff));

		// Creating transitions
		SingleElementCondition conditionOn2Off = new SingleElementCondition();
		conditionOn2Off.setSensor(button);
		conditionOn2Off.setSignal(SIGNAL.HIGH);

		Transition on2off = new Transition();
		on2off.setNext(off);
		on2off.setCondition(conditionOn2Off);


		SingleElementCondition conditionOff2On = new SingleElementCondition();
		conditionOff2On.setSensor(button);
		conditionOff2On.setSignal(SIGNAL.HIGH);

		Transition off2on = new Transition();
		off2on.setNext(on);
		off2on.setCondition(conditionOff2On);

		// Binding transitions to states
		on.setTransition(on2off);
		off.setTransition(off2on);

		// Building the App
		App theSwitch = new App();
		theSwitch.setName("Switch!");
		theSwitch.setBricks(Arrays.asList(button, led ));
		theSwitch.setStates(Arrays.asList(on, off));
		theSwitch.setInitial(off);

		// Generating Code
		Visitor codeGenerator = new ToWiring();
		theSwitch.accept(codeGenerator);

		// Printing the generated code on the console
		System.out.println(codeGenerator.getResult());
	}

	private static void two_buttons_basic_case(){
		// Declaring elementary bricks
		Sensor button = new Sensor();
		button.setName("button");
		button.setPin(9);

		Sensor button1 = new Sensor();
		button1.setName("button1");
		button1.setPin(10);

		Actuator led = new Actuator();
		led.setName("LED");
		led.setPin(12);

		// Declaring states
		State on = new State();
		on.setName("on");

		State off = new State();
		off.setName("off");

		// Creating actions
		Action switchTheLightOn = new Action();
		switchTheLightOn.setActuator(led);
		switchTheLightOn.setValue(SIGNAL.HIGH);

		Action switchTheLightOff = new Action();
		switchTheLightOff.setActuator(led);
		switchTheLightOff.setValue(SIGNAL.LOW);

		// Binding actions to states
		on.setActions(Arrays.asList(switchTheLightOn));
		off.setActions(Arrays.asList(switchTheLightOff));

		// Creating transitions
		SingleElementCondition sub_condition111 = new SingleElementCondition();
		sub_condition111.setSensor(button1);
		sub_condition111.setSignal(SIGNAL.HIGH);

		SingleElementCondition sub_condition112 = new SingleElementCondition();
		sub_condition112.setSensor(button);
		sub_condition112.setSignal(SIGNAL.LOW);

		MultipleElementCondition sub_condition11 = new MultipleElementCondition();
		sub_condition11.setConditionList(Arrays.asList(sub_condition111, sub_condition112));
		sub_condition11.setOperator(Operator.OR);

		SingleElementCondition sub_condition12 = new SingleElementCondition();
		sub_condition12.setSensor(button);
		sub_condition12.setSignal(SIGNAL.HIGH);

		MultipleElementCondition conditionOn2Off = new MultipleElementCondition();
		conditionOn2Off.setConditionList(Arrays.asList(sub_condition11, sub_condition12));
		conditionOn2Off.setOperator(Operator.AND);

		Transition on2off = new Transition();
		on2off.setNext(off);
		on2off.setCondition(conditionOn2Off);

		SingleElementCondition conditionOff2On = new SingleElementCondition();
		conditionOff2On.setSensor(button);
		conditionOff2On.setSignal(SIGNAL.HIGH);

		Transition off2on = new Transition();
		off2on.setNext(on);
		off2on.setCondition(conditionOff2On);

		// Binding transitions to states
		on.setTransition(on2off);
		off.setTransition(off2on);

		// Building the App
		App theSwitch = new App();
		theSwitch.setName("Switch!");
		theSwitch.setBricks(Arrays.asList(button, button1, led ));
		theSwitch.setStates(Arrays.asList(on, off));
		theSwitch.setInitial(off);

		// Generating Code
		Visitor codeGenerator = new ToWiring();
		theSwitch.accept(codeGenerator);

		// Printing the generated code on the console
		System.out.println(codeGenerator.getResult());
	}
}
