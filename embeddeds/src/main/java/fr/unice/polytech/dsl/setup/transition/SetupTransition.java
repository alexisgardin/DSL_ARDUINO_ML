package fr.unice.polytech.dsl.setup.transition;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.kernel.behavioral.Transition;
import fr.unice.polytech.dsl.kernel.structural.AnalogSensor;
import fr.unice.polytech.dsl.kernel.structural.DigitalSensor;
import fr.unice.polytech.dsl.setup.transition.SetAnalogComparator;
import fr.unice.polytech.dsl.setup.transition.SetDigitalSignal;

public class SetupTransition {
    private Transition transition;

    public SetupTransition() {
        this.transition = new Transition();
    }

    public SetDigitalSignal whenDigitalSensor(String string) {
        return new SetDigitalSignal(transition, (DigitalSensor) Arduino.getInstance().getSensor(string));
    }

    public SetAnalogComparator whenAnalogSensor(String string) {
        return new SetAnalogComparator(transition, (AnalogSensor) Arduino.getInstance().getSensor(string));
    }


}
