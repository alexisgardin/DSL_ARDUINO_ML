package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;
import io.github.mosser.arduinoml.kernel.structural.Sensor;

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
}
