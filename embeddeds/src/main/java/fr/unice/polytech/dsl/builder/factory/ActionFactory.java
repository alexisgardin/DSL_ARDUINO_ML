package fr.unice.polytech.dsl.builder.factory;

import fr.unice.polytech.dsl.kernel.behavioral.Action;
import fr.unice.polytech.dsl.kernel.behavioral.AnalogAction;
import fr.unice.polytech.dsl.kernel.behavioral.DigitalAction;
import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;
import sun.misc.Signal;

public class ActionFactory {
    /**
     * Let the ActionFactory create the good action in function of the context
     * @param brick
     * @param signal
     * @param name
     * @return an Action
     */
    public static Action action(final Actuator brick, SIGNAL signal, final String name){

        Action action;
        if(brick.isAnalog()){
            action = new AnalogAction();
            ((AnalogAction)action).setValue(signal == SIGNAL.HIGH? 255 : 0);
        }else  {
            action = new DigitalAction();
            ((DigitalAction)action).setValue(signal);
        }
        action.setActuator(brick);
        action.setName(name);
        return action;
    }

    public static Action action(final Actuator brick, int value, final String name){

        AnalogAction action = new AnalogAction();
        action.setValue(value);
        action.setActuator(brick);
        action.setName(name);
        return action;
    }

}
