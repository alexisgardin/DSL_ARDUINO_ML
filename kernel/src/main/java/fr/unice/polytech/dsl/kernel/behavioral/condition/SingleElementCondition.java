package fr.unice.polytech.dsl.kernel.behavioral.condition;

import fr.unice.polytech.dsl.kernel.generator.Visitor;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;
import fr.unice.polytech.dsl.kernel.structural.DigitalSensor;

public class SingleElementCondition extends Condition {

    private DigitalSensor sensor;
    private SIGNAL signal;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public DigitalSensor getSensor() {
        return sensor;
    }

    public void setSensor(DigitalSensor sensor) {
        this.sensor = sensor;
    }

    public SIGNAL getSignal() {
        return signal;
    }

    public void setSignal(SIGNAL signal) {
        this.signal = signal;
    }

    @Override
    public boolean isSingle() {
        return true;
    }
}
