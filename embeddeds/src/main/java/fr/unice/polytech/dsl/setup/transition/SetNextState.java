package fr.unice.polytech.dsl.setup.transition;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.exception.StateNotFoundException;
import fr.unice.polytech.dsl.kernel.behavioral.State;
import fr.unice.polytech.dsl.kernel.behavioral.Transition;

public class SetNextState {
    private Transition transition;

    public SetNextState(Transition transition) {
        this.transition = transition;
    }

    public Arduino goToState(final String state) {
        State state1 = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
        transition.setNext(state1);
        return Arduino.getInstance();
    }
}