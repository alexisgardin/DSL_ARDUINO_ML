package fr.unice.polytech.dsl.kernel.structural;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

public abstract class Actuator extends Brick {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }



    @Override
    public abstract boolean isAnalog();

    @Override
    public abstract boolean isDigital();



    @Override
    public boolean isSensor() {
        return false;
    }

    @Override
    public boolean isActuator() {
        return true;
    }
}
