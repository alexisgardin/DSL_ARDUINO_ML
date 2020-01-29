package fr.unice.polytech.dsl.kernel.behavioral.condition;

import fr.unice.polytech.dsl.kernel.generator.Visitor;
import fr.unice.polytech.dsl.kernel.structural.AnalogSensor;

public class ValueElementCondition<T extends Number> extends Condition {

    private Comparator comparator;
    private AnalogSensor sensor;
    private T value;

    @Override
    public boolean isSingle() {
        return true;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public T getValue() {
        return value;
    }

    public Comparator getComparator() {
        return comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public AnalogSensor getSensor() {
        return sensor;
    }

    public void setSensor(AnalogSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return comparator.getValue() + " " + value.toString();
    }
}
