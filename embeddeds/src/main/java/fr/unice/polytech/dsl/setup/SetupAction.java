package fr.unice.polytech.dsl.setup;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.exception.BrickNotFoundException;
import fr.unice.polytech.dsl.exception.NoActionDefineException;
import fr.unice.polytech.dsl.exception.StateNotFoundException;
import fr.unice.polytech.dsl.kernel.behavioral.Action;
import fr.unice.polytech.dsl.kernel.behavioral.State;
import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.Brick;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;

import java.util.*;
import java.util.stream.Collectors;

import static fr.unice.polytech.dsl.builder.factory.ActionFactory.action;

public class SetupAction {


    public static Bind createAction(String nameOfAction, String nameOfBrick, SIGNAL signal) {
        Optional<Brick> first = Arduino.getInstance().bricks().stream().filter(v -> v.getName().equals(nameOfBrick)).findFirst();
        if (first.isPresent()) {

            Action action = action((Actuator) first.get(), signal, nameOfAction);
            Arduino.getInstance().actions().add(action);
            return new Bind(action);
        } else {
            throw new BrickNotFoundException();
        }
    }


    public static Bind createAction(String nameOfAction, int pin, SIGNAL signal) {
        Optional<Brick> first = Arduino.getInstance().bricks().stream().filter(v -> v.getPin() == pin).findFirst();
        if (first.isPresent()) {
            Action action = action((Actuator) first.get(), signal, nameOfAction);
            Arduino.getInstance().actions().add(action);
            return new Bind(action);
        } else {
            throw new BrickNotFoundException();
        }
    }


    public static class Bind {
        private List<Action> actions;

        public Bind(Action action) {
            this.actions = new ArrayList<Action>() {{
                add(action);
            }};
        }

        public Arduino bindToState(final String state) {

            State second = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
            if (actions.isEmpty())
                throw new NoActionDefineException();
            second.getActions().addAll(actions);
            return Arduino.getInstance();
        }

        public Bind addRelatedAction(final String nameOfBrick, final SIGNAL signal) {
            Optional<Brick> first = Arduino.getInstance().bricks().stream().filter(v -> v.getName().equals(nameOfBrick)).findFirst();
            if(actions.isEmpty()){
                throw new NoActionDefineException();
            }
            if (first.isPresent()) {

                Action action = action((Actuator) first.get(), signal, actions.get(0).getName());
                Arduino.getInstance().actions().add(action);
                actions.add(action);
                return this;
            } else {
                throw new BrickNotFoundException();
            }
        }

        public Arduino bindToStates(final String... state) {

            Set<State> states = Arduino.getInstance().states().stream().filter(v -> Arrays.asList(state).contains(v.getName())).collect(Collectors.toSet());
            if (states.size() != state.length) {
                throw new StateNotFoundException();
            }
            states.forEach(v -> v.getActions().add(actions.get(0)));
            return Arduino.getInstance();
        }
    }
}
