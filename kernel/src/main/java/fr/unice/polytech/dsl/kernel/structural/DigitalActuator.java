package fr.unice.polytech.dsl.kernel.structural;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

public class DigitalActuator extends Actuator {

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


}
