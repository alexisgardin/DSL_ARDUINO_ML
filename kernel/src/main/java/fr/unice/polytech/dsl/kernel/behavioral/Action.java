package fr.unice.polytech.dsl.kernel.behavioral;

import fr.unice.polytech.dsl.kernel.NamedElement;
import fr.unice.polytech.dsl.kernel.generator.Visitable;
import fr.unice.polytech.dsl.kernel.generator.Visitor;
import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;

public abstract class Action implements Visitable, NamedElement {
    private String name;
    private Actuator actuator;


    public Actuator getActuator() {
        return actuator;
    }

    public void setActuator(Actuator actuator) {
        this.actuator = actuator;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
