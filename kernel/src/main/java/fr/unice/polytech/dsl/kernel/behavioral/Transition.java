package fr.unice.polytech.dsl.kernel.behavioral;

import fr.unice.polytech.dsl.kernel.generator.Visitable;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;
import fr.unice.polytech.dsl.kernel.structural.Sensor;

public abstract class Transition implements Visitable {

    protected State next;


    public State getNext() {
        return next;
    }

    public void setNext(State next) {
        this.next = next;
    }

    public abstract void addSensor(Sensor sensor);
	public abstract void addSignal(SIGNAL signal);

    public abstract boolean isMultiple();
}
