package fr.unice.polytech.dsl.kernel.structural;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

public class DigitalSensor extends Sensor {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean isAnalog() {
        return false;
    }

    @Override
    public boolean isDigital() {
        return true;
    }

    @Override
    public boolean isSensor() {
        return true;
    }

    @Override
    public boolean isActuator() {
        return false;
    }
}
