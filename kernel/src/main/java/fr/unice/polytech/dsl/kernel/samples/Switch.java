package fr.unice.polytech.dsl.kernel.samples;

import fr.unice.polytech.dsl.kernel.App;
import fr.unice.polytech.dsl.kernel.behavioral.*;
import fr.unice.polytech.dsl.kernel.behavioral.condition.*;
import fr.unice.polytech.dsl.kernel.generator.ToWiring;
import fr.unice.polytech.dsl.kernel.generator.Visitor;
import fr.unice.polytech.dsl.kernel.structural.*;

import java.util.Arrays;

public class Switch {

    public static void main(String[] args) {
        //basic_case();
        two_buttons_basic_case();
    }

    private static void basic_case() {

        // Declaring elementary bricks
        DigitalSensor button = new DigitalSensor();
        button.setName("button");
        button.setPin("9");

        Actuator led = new DigitalActuator();
        led.setName("LED");
        led.setPin("12");

        // Declaring states
        State on = new State();
        on.setName("on");

        State off = new State();
        off.setName("off");

        // Creating actions
        DigitalAction switchTheLightOn = new DigitalAction();
        switchTheLightOn.setActuator(led);
        switchTheLightOn.setValue(SIGNAL.HIGH);

        DigitalAction switchTheLightOff = new DigitalAction();
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
        theSwitch.setBricks(Arrays.asList(button, led));
        theSwitch.setStates(Arrays.asList(on, off));
        theSwitch.setInitial(off);

        // Generating Code
        Visitor codeGenerator = new ToWiring();
        theSwitch.accept(codeGenerator);

        // Printing the generated code on the console
        System.out.println(codeGenerator.getResult());
    }

    private static void two_buttons_basic_case() {
        // Declaring elementary bricks
        DigitalSensor button = new DigitalSensor();
        button.setName("button");
        button.setPin("9");

        DigitalSensor button1 = new DigitalSensor();
        button1.setName("button1");
        button1.setPin("10");

        AnalogSensor temp = new AnalogSensor();
        temp.setName("temp");
        temp.setPin("15");

        Actuator led = new DigitalActuator();
        led.setName("LED");
        led.setPin("12");

        // Declaring states
        State on = new State();
        on.setName("on");

        State off = new State();
        off.setName("off");

        // Creating actions
        DigitalAction switchTheLightOn = new DigitalAction();
        switchTheLightOn.setActuator(led);
        switchTheLightOn.setValue(SIGNAL.HIGH);

        DigitalAction switchTheLightOff = new DigitalAction();
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
        sub_condition11.addOperator(Operator.OR);

        SingleElementCondition sub_condition12 = new SingleElementCondition();
        sub_condition12.setSensor(button);
        sub_condition12.setSignal(SIGNAL.HIGH);

        MultipleElementCondition conditionOn2Off = new MultipleElementCondition();
        for (Condition condition : Arrays.asList(sub_condition11, sub_condition12)) {
            conditionOn2Off.addCondition(condition);
        }
        conditionOn2Off.addOperator(Operator.AND);

        Transition on2off = new Transition();
        on2off.setNext(off);
        on2off.setCondition(conditionOn2Off);


        SingleElementCondition conditionOff2On = new SingleElementCondition();
        conditionOff2On.setSensor(button);
        conditionOff2On.setSignal(SIGNAL.HIGH);

        /**
         * SET ANALOGIQUE VALUE
         */
        ValueElementCondition<Double> conditionTemp = new ValueElementCondition<>();
        conditionTemp.setSensor(temp);
        conditionTemp.setComparator(Comparator.INFERIOR);
        conditionTemp.setValue(56d);
        conditionOn2Off.getConditionList().add(conditionTemp);
        conditionOn2Off.addOperator(Operator.AND);

        Transition off2on = new Transition();
        off2on.setNext(on);
        off2on.setCondition(conditionOff2On);

        // Binding transitions to states
        on.setTransition(on2off);
        off.setTransition(off2on);

        // Building the App
        App theSwitch = new App();
        theSwitch.setName("Switch!");
        theSwitch.setBricks(Arrays.asList(button, button1, led));
        theSwitch.setStates(Arrays.asList(on, off));
        theSwitch.setInitial(off);

        // Generating Code
        Visitor codeGenerator = new ToWiring();
        theSwitch.accept(codeGenerator);

        // Printing the generated code on the console
        System.out.println(codeGenerator.getResult());


    }
}
