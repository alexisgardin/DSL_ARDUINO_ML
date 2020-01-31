package fr.unice.polytech.dsl.kernel.structural;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

public class AnalogActuator extends Actuator {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean isAnalog() {
        return true;
    }

    @Override
    public boolean isDigital() {
        return false;
    }
}
