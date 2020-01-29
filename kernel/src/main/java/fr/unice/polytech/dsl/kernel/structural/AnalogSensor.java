package fr.unice.polytech.dsl.kernel.structural;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

public class AnalogSensor extends Sensor {
    private double factor = 1;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    @Override
    public boolean isAnalog() {
        return true;
    }

    @Override
    public boolean isDigital() {
        return false;
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
