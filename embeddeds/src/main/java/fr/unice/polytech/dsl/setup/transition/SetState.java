package fr.unice.polytech.dsl.setup.transition;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.exception.StateNotFoundException;
import fr.unice.polytech.dsl.kernel.behavioral.State;
import fr.unice.polytech.dsl.kernel.behavioral.Transition;

public class SetState {
    private Transition transition;

    public SetState(Transition transition) {
        this.transition = transition;
    }

    public SetNextState atState(final String state) {
        State state1 = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst()
                .orElseThrow(StateNotFoundException::new);
        state1.setTransition(transition);
        return new SetNextState(transition);
    }
}