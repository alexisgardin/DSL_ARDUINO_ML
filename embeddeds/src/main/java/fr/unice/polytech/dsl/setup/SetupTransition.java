package fr.unice.polytech.dsl.setup;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.exception.StateNotFoundException;
import fr.unice.polytech.dsl.kernel.behavioral.Operator;
import fr.unice.polytech.dsl.kernel.behavioral.State;
import fr.unice.polytech.dsl.kernel.behavioral.Transition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.Comparator;
import fr.unice.polytech.dsl.kernel.behavioral.condition.MultipleElementCondition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.SingleElementCondition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.ValueElementCondition;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;
import fr.unice.polytech.dsl.kernel.structural.DigitalSensor;

public class SetupTransition {
    private Transition transition;

    public SetupTransition() {
        this.transition = new Transition();
    }

    public SetDigitalSignal whenDigitalSensor(String string) {
        return new SetDigitalSignal(transition, Arduino.getInstance().getSensor(string));
    }

    public SetAnalogComparator whenAnalogSensor(String string) {
        return new SetAnalogComparator(transition, Arduino.getInstance().getSensor(string));
    }

    public static class SetAnalogComparator{
        private Transition transition;
        private DigitalSensor sensor;

        public SetAnalogComparator(Transition transition, DigitalSensor sensor) {
            this.transition = transition;
            this.sensor = sensor;
        }

        public SetValue are(Comparator comparator) {
            ValueElementCondition valueElementCondition = new ValueElementCondition<>();
            valueElementCondition.setSensor(this.sensor);
            valueElementCondition.setComparator(comparator);
            if (transition.getCondition() == null) {
                this.transition.setCondition(valueElementCondition);
            } else {
                ((MultipleElementCondition) transition.getCondition()).addCondition(valueElementCondition);
            }
            return new SetValue(transition, valueElementCondition);
        }
    }
    public static class SetDigitalSignal {
        private Transition transition;
        private DigitalSensor sensor;

        public SetDigitalSignal(Transition transition, DigitalSensor sensor) {
            this.transition = transition;
            this.sensor = sensor;
        }

        public SetCondition are(SIGNAL signal) {

            SingleElementCondition singleElementCondition = new SingleElementCondition();
            singleElementCondition.setSensor(this.sensor);
            singleElementCondition.setSignal(signal);
            if (transition.getCondition() == null) {
                this.transition.setCondition(singleElementCondition);
            } else {
                ((MultipleElementCondition) transition.getCondition()).addCondition(singleElementCondition);
            }
            return new SetCondition(transition);
        }
    }

    public static class SetValue {
        private Transition transition;
        private ValueElementCondition valueElementCondition;

        public SetValue(Transition transition, ValueElementCondition valueElementCondition) {
            this.transition = transition;
            this.valueElementCondition = valueElementCondition;
        }

        public SetCondition withValue(Number value) {
            valueElementCondition.setValue(value);
            return new SetCondition(transition);
        }
    }

    public static class SetCondition {
        Transition transition;

        public SetCondition(Transition transition) {
            this.transition = transition;
        }

        public SetDigitalSignal and(String sensor) {
            DigitalSensor sensor1 = manageCondition(sensor);
            ((MultipleElementCondition) transition.getCondition()).addOperator(Operator.AND);
            return new SetDigitalSignal(transition, sensor1);
        }

        public SetDigitalSignal or(String sensor) {
            DigitalSensor sensor1 = manageCondition(sensor);
            ((MultipleElementCondition) transition.getCondition()).addOperator(Operator.OR);
            return new SetDigitalSignal(transition, sensor1);
        }

        public SetCondition group() {
            if (this.transition.getCondition().isSingle())
                throw new IllegalArgumentException("We cannot group a single expression");
            MultipleElementCondition cond = new MultipleElementCondition();
            cond.addCondition(this.transition.getCondition());
            transition.setCondition(cond);
            return this;
        }

        public NextState atState(String state) {
            return new SetState(transition).atState(state);
        }

        private DigitalSensor manageCondition(String sensor) {
            DigitalSensor sensor1 = Arduino.getInstance().getSensor(sensor);
            if (transition.getCondition().isSingle()) {
                MultipleElementCondition multipleElementCondition = new MultipleElementCondition();
                multipleElementCondition.addCondition(transition.getCondition());
                transition.setCondition(multipleElementCondition);
            }
            return sensor1;
        }

    }

    public static class SetState {
        private Transition transition;

        public SetState(Transition transition) {
            this.transition = transition;
        }

        public NextState atState(final String state) {
            State state1 = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
            state1.setTransition(transition);
            return new NextState(transition);
        }
    }

    public static class NextState {
        private Transition transition;

        public NextState(Transition transition) {
            this.transition = transition;
        }

        public Arduino goToState(final String state) {
            State state1 = Arduino.getInstance().states().stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
            transition.setNext(state1);
            return Arduino.getInstance();
        }
    }
}
