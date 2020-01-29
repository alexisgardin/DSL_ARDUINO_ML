package fr.unice.polytech.dsl.setup.transition;

import fr.unice.polytech.dsl.kernel.behavioral.Transition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.MultipleElementCondition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.SingleElementCondition;
import fr.unice.polytech.dsl.kernel.structural.DigitalSensor;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;

public class SetDigitalSignal {
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