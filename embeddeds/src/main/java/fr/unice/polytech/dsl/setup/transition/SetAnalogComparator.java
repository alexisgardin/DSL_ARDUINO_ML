package fr.unice.polytech.dsl.setup.transition;

import fr.unice.polytech.dsl.kernel.behavioral.Transition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.Comparator;
import fr.unice.polytech.dsl.kernel.behavioral.condition.MultipleElementCondition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.ValueElementCondition;
import fr.unice.polytech.dsl.kernel.structural.AnalogSensor;

public class SetAnalogComparator {
    private Transition transition;
    private AnalogSensor sensor;

    public SetAnalogComparator(Transition transition, AnalogSensor sensor) {
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