package fr.unice.polytech.dsl.kernel.behavioral.condition;

import fr.unice.polytech.dsl.kernel.generator.Visitor;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;
import fr.unice.polytech.dsl.kernel.structural.Sensor;

public class SingleElementCondition extends Condition {

    private Sensor sensor;
    private SIGNAL signal;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
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
