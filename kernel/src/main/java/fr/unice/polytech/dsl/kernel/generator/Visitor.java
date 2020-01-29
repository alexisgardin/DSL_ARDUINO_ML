package fr.unice.polytech.dsl.kernel.generator;

import fr.unice.polytech.dsl.kernel.App;
import fr.unice.polytech.dsl.kernel.behavioral.*;
import fr.unice.polytech.dsl.kernel.behavioral.condition.MultipleElementCondition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.SingleElementCondition;
import fr.unice.polytech.dsl.kernel.behavioral.condition.ValueElementCondition;
import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.AnalogSensor;
import fr.unice.polytech.dsl.kernel.structural.DigitalSensor;
import fr.unice.polytech.dsl.kernel.structural.Sensor;

import java.util.HashMap;
import java.util.Map;

public abstract class Visitor<T> {

    /***********************
     ** Helper mechanisms **
     ***********************/

    protected Map<String, Object> context = new HashMap<>();
    protected T result;

    public abstract void visit(App app);

    public abstract void visit(State state);

    public abstract void visit(Transition transition);

    public abstract void visit(Action action);

    public abstract void visit(Actuator actuator);

    public abstract void visit(Sensor sensor);

    public abstract void visit(MultipleElementCondition multipleElementCondition);

    public abstract void visit(SingleElementCondition singleElementCondition);
    public abstract void visit(ValueElementCondition valueElementCondition);

    public T getResult() {
        return result;
    }

}

