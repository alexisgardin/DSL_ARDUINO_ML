package fr.unice.polytech.dsl.kernel.behavioral;

import fr.unice.polytech.dsl.kernel.generator.Visitor;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;
import fr.unice.polytech.dsl.kernel.structural.Sensor;

import java.util.ArrayList;
import java.util.List;

public class MultipleTriggerTransition extends Transition {

    private List<Sensor> sensors;
    private List<SIGNAL> signals;

    public MultipleTriggerTransition(){
        sensors=new ArrayList<>();
        signals = new ArrayList<>();
    }
    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public List<SIGNAL> getSignals() {
        return signals;
    }

    public void setSignals(List<SIGNAL> signals) {
        this.signals = signals;
    }

    public void addTransition(Sensor sensor, SIGNAL signal) {
        addSensor(sensor);
        addSignal(signal);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public void addSignal(SIGNAL signal) {
        this.signals.add(signal);
    }
    //WE HAVE THE SAME AMOUNT OF SIGNAL AND SENSORS
    public boolean isValid() {
        if (sensors.size() != signals.size())
        	throw new IllegalArgumentException("In multiple trigger transition we need to have the same amount of sensor and signal");
        return true;
    }

    @Override
    public boolean isMultiple() {
        return true;
    }
}
