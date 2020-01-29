package fr.unice.polytech.dsl.setup.action;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.exception.BrickNotFoundException;
import fr.unice.polytech.dsl.kernel.behavioral.Action;
import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.Brick;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;

import java.util.Optional;

import static fr.unice.polytech.dsl.builder.factory.ActionFactory.action;

public class SetupAction {

    private SetupAction() {
    }

    public static SetBindingAction createAction(String nameOfAction, String nameOfBrick, SIGNAL signal) {
        Optional<Brick> first = Arduino.getInstance().bricks().stream().filter(v -> v.getName().equals(nameOfBrick)).findFirst();
        if (first.isPresent()) {

            Action action = action((Actuator) first.get(), signal, nameOfAction);
            Arduino.getInstance().actions().add(action);
            return new SetBindingAction(action);
        } else {
            throw new BrickNotFoundException();
        }
    }

}
