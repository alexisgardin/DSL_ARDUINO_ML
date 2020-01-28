package fr.unice.polytech.dsl.setup;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.exception.StateNotFoundException;
import fr.unice.polytech.dsl.kernel.behavioral.*;
import fr.unice.polytech.dsl.kernel.behavioral.condition.MultipleElementCondition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.SingleElementCondition;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;
import fr.unice.polytech.dsl.kernel.structural.Sensor;

public class SetupTransition {
    private Transition transition;

    public SetupTransition() {
        this.transition = new Transition();
    }

    public SetSignal whenSensor(String string) {
        return new SetSignal(transition, Arduino.getInstance().getSensor(string));
    }

    public static class SetSignal {
        private Transition transition;
        private Sensor sensor;

        public SetSignal(Transition transition, Sensor sensor) {
            this.transition = transition;
            this.sensor = sensor;
        }

        public SetCondition are(SIGNAL signal) {

            SingleElementCondition singleElementCondition = new SingleElementCondition();
            singleElementCondition.setSensor(this.sensor);
            singleElementCondition.setSignal(signal);
            if(transition.getCondition()==null) {
                this.transition.setCondition(singleElementCondition);
            }else{
                ((MultipleElementCondition)transition.getCondition()).addCondition(singleElementCondition);
            }
            return new SetCondition(transition);
        }
    }

    public static class SetCondition{
        Transition transition;

        public SetCondition(Transition transition) {
            this.transition = transition;
        }

        public SetSignal and(String sensor){
            Sensor sensor1 = manageCondition(sensor);
            ((MultipleElementCondition)transition.getCondition()).addOperator(Operator.AND);
            return new SetSignal(transition,sensor1);
        }
        public SetSignal or(String sensor){
            Sensor sensor1 = manageCondition(sensor);
            ((MultipleElementCondition)transition.getCondition()).addOperator(Operator.OR);
            return new SetSignal(transition,sensor1);
        }

        public SetCondition group(){
            if(this.transition.getCondition().isSingle())
                throw new IllegalArgumentException("We cannot group a single expression");
            MultipleElementCondition cond = new MultipleElementCondition();
            cond.addCondition(this.transition.getCondition());
            transition.setCondition(cond);
            return this;
        }

        public NextState atState(String state){
            return new SetState(transition).atState(state);
        }

        private Sensor manageCondition(String sensor) {
            Sensor sensor1 = Arduino.getInstance().getSensor(sensor);
            if(transition.getCondition().isSingle()){
                MultipleElementCondition multipleElementCondition = new MultipleElementCondition();
                multipleElementCondition.addCondition(transition.getCondition());
                transition.setCondition(multipleElementCondition);
            }
            return sensor1;
        }

    }
        public static class SetState{
            private Transition transition;

            public SetState(Transition transition) {
                this.transition = transition;
            }
            public NextState atState(final String state){
                State state1 = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
                state1.setTransition(transition);
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

    /** public static class OnSensor{
     private Transition_ transition;

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
     }**/
}
