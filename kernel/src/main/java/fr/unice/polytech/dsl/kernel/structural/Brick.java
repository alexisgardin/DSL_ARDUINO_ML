package fr.unice.polytech.dsl.kernel.structural;

import fr.unice.polytech.dsl.kernel.NamedElement;
import fr.unice.polytech.dsl.kernel.generator.Visitable;

public abstract class Brick implements NamedElement, Visitable {

    private String name;
    private String pin;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean isAnalog();
    public abstract boolean isDigital();
    public abstract boolean isSensor();
    public abstract boolean isActuator();

}