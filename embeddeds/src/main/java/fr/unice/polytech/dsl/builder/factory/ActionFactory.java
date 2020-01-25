package fr.unice.polytech.dsl.builder.factory;

import fr.unice.polytech.dsl.kernel.behavioral.Action;
import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;

public class ActionFactory {
    public static Action action(final Actuator brick, SIGNAL signal, final String name){
        Action action = new Action();
        action.setActuator(brick);
        action.setValue(signal);
        action.setName(name);
        return action;
    }

}
