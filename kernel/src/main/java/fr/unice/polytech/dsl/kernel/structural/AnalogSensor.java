package fr.unice.polytech.dsl.kernel.structural;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

public class AnalogSensor extends Sensor {
    private int baud;
    private double mv = 1;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getBaud() {
        return baud;
    }

    public void setBaud(int baud) {
        this.baud = baud;
    }

    public double getMv() {
        return mv;
    }

    public void setMv(double mv) {
        this.mv = mv;
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
