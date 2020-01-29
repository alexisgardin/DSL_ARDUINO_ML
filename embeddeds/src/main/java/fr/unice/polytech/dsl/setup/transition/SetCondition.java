package fr.unice.polytech.dsl.setup.transition;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.kernel.behavioral.Operator;
import fr.unice.polytech.dsl.kernel.behavioral.Transition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.MultipleElementCondition;
import fr.unice.polytech.dsl.kernel.structural.AnalogSensor;
import fr.unice.polytech.dsl.kernel.structural.DigitalSensor;
import fr.unice.polytech.dsl.kernel.structural.Sensor;

public class SetCondition {
    Transition transition;

    public SetCondition(Transition transition) {
        this.transition = transition;
    }

    public SetDigitalSignal andDigital(String sensor) {
        Sensor sensor1 = manageCondition(sensor);
        ((MultipleElementCondition) transition.getCondition()).addOperator(Operator.AND);
        return new SetDigitalSignal(transition, (DigitalSensor) sensor1);
    }

    public SetDigitalSignal orDigital(String sensor) {
        Sensor sensor1 = manageCondition(sensor);
        ((MultipleElementCondition) transition.getCondition()).addOperator(Operator.OR);
        return new SetDigitalSignal(transition, (DigitalSensor) sensor1);
    }

    public SetAnalogComparator andAnalog(String sensor) {
        Sensor sensor1 = manageCondition(sensor);
        ((MultipleElementCondition) transition.getCondition()).addOperator(Operator.AND);
        return new SetAnalogComparator(transition, (AnalogSensor) sensor1);
    }

    public SetAnalogComparator orAnalog(String sensor) {
        Sensor sensor1 = manageCondition(sensor);
        ((MultipleElementCondition) transition.getCondition()).addOperator(Operator.OR);
        return new SetAnalogComparator(transition, (AnalogSensor) sensor1);
    }

    public SetCondition group() {
        if (this.transition.getCondition().isSingle())
            throw new IllegalArgumentException("We cannot group a single expression");
        MultipleElementCondition cond = new MultipleElementCondition();
        cond.addCondition(this.transition.getCondition());
        transition.setCondition(cond);
        return this;
    }

    public SetNextState atState(String state) {
        return new SetState(transition).atState(state);
    }

    private Sensor manageCondition(String sensor) {
        Sensor sensor1 = Arduino.getInstance().getSensor(sensor);
        if (transition.getCondition().isSingle()) {
            MultipleElementCondition multipleElementCondition = new MultipleElementCondition();
            multipleElementCondition.addCondition(transition.getCondition());
            transition.setCondition(multipleElementCondition);
        }
        return sensor1;
    }


}
