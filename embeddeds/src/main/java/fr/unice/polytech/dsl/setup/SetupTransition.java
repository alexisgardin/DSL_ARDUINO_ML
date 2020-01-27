package fr.unice.polytech.dsl.setup;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.exception.BrickNotFoundException;
import fr.unice.polytech.dsl.exception.StateNotFoundException;
import fr.unice.polytech.dsl.kernel.behavioral.MultipleTriggerTransition;
import fr.unice.polytech.dsl.kernel.behavioral.State;
import fr.unice.polytech.dsl.kernel.behavioral.Transition;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;
import fr.unice.polytech.dsl.kernel.structural.Sensor;

import java.util.Arrays;

public class SetupTransition {

    public static class OnSensor{
        private MultipleTriggerTransition transition;

        public OnSensor() {
            this.transition = new MultipleTriggerTransition();
        }

        public SetState onSensor(final String sensor){
            Sensor brick = (Sensor) Arduino.getInstance().bricks().stream().filter(v -> v.getName().equals(sensor)).findFirst().orElseThrow(BrickNotFoundException::new);
            transition.addSensor(brick);
            return new SetState(transition);
        }
        public SetState onMultipleSensor(final String ... sensor){
            for (String s : sensor) {
                Sensor brick = (Sensor) Arduino.getInstance().bricks()
                        .stream().filter(v -> v.getName().equals(s)).findFirst().orElseThrow(BrickNotFoundException::new);
                transition.addSensor(brick);
            }
            return new SetState(transition);
        }
    }

    public static class SetState{
        private MultipleTriggerTransition transition;

        public SetState(MultipleTriggerTransition transition) {
            this.transition = transition;
        }
       public SetSignal whenWeAreAteState(final String state){
            State state1 = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
            state1.setTransition(transition);
            return new SetSignal(transition);
        }
    }
    public static class SetStates{
        private MultipleTriggerTransition transition;

        public SetStates(MultipleTriggerTransition transition) {
            this.transition = transition;
        }
        public SetSignal whenStatesAre(final String ... state){
            State state1 = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
            state1.setTransition(transition);
            return new SetSignal(transition);
        }
    }

    public static class SetSignal{
        private MultipleTriggerTransition transition;

        public SetSignal(MultipleTriggerTransition transition) {
            this.transition = transition;
        }

        /**
         * Apply this SIGNAL for all sensors
         * @param signal
         * @return
         */
       public NextState when(final SIGNAL signal){
           for (int i = 0; i < transition.getSensors().size(); i++) {
               transition.addSignal(signal);
           }
            return new NextState(transition);
        }
        public NextState when(final SIGNAL ... signal){
            transition.getSignals().addAll(Arrays.asList(signal));
            return new NextState(transition);
        }
    }

    public static class NextState{
        private Transition transition;

        public NextState(Transition transition) {
            this.transition = transition;
        }

        public Arduino goToState(final String state){
            State state1 = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
            transition.setNext(state1);
            return Arduino.getInstance();
        }
    }
}
