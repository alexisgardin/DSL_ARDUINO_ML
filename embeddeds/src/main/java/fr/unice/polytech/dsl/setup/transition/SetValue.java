package fr.unice.polytech.dsl.setup.transition;

import fr.unice.polytech.dsl.kernel.behavioral.Transition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.ValueElementCondition;
import fr.unice.polytech.dsl.setup.transition.SetCondition;

public class SetValue {
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

    public SetCondition withValue(Number value, double multiplicator) {
        valueElementCondition.setValue(value);
        valueElementCondition.getSensor().setFactor(multiplicator);
        return new SetCondition(transition);
    }
}