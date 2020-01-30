package fr.unice.polytech.dsl.kernel.behavioral;

import fr.unice.polytech.dsl.kernel.NamedElement;
import fr.unice.polytech.dsl.kernel.generator.Visitable;
import fr.unice.polytech.dsl.kernel.generator.Visitor;
import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;

public class DigitalAction extends Action {
    private SIGNAL value;


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public SIGNAL getValue() {
        return value;
    }

    public void setValue(SIGNAL value) {
        this.value = value;
    }

}
