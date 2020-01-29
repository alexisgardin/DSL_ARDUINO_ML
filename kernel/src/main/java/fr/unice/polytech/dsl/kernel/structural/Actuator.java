package fr.unice.polytech.dsl.kernel.structural;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

public class Actuator extends Brick {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    //TODO IMPLEMENTS ANALOG ACUATOR
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
        return false;
    }

    @Override
    public boolean isActuator() {
        return true;
    }
}
