package fr.unice.polytech.dsl.setup;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.exception.BrickNotFoundException;
import fr.unice.polytech.dsl.exception.StateNotFoundException;
import fr.unice.polytech.dsl.kernel.behavioral.State;
import fr.unice.polytech.dsl.kernel.behavioral.Transition;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;
import fr.unice.polytech.dsl.kernel.structural.Sensor;

public class SetupTransition {

    public static class OnSensor{
        private Transition transition;

        public OnSensor() {
            this.transition = new Transition();
        }

        public SetState onSensor(final String sensor){
            Sensor brick = (Sensor) Arduino.getInstance().bricks().stream().filter(v -> v.getName().equals(sensor)).findFirst().orElseThrow(BrickNotFoundException::new);
            transition.setSensor(brick);
            return new SetState(transition);
        }
    }

    public static class SetState{
        private Transition transition;

        public SetState(Transition transition) {
            this.transition = transition;
        }
       public SetSignal whenStateIs(final String state){
            State state1 = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
            state1.setTransition(transition);
            return new SetSignal(transition);
        }
    }

    public static class SetSignal{
        private Transition transition;

        public SetSignal(Transition transition) {
            this.transition = transition;
        }

       public NextState when(final SIGNAL signal){
            transition.setValue(signal);
            return new NextState(transition);
        }
    }

    public static class NextState{
        private Transition transition;

        public NextState(Transition transition) {
            this.transition = transition;
        }

        public Arduino nextState(final String state){
            State state1 = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
            transition.setNext(state1);
            return Arduino.getInstance();
        }
    }
}
