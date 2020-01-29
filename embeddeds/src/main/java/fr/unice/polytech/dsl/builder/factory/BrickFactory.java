package fr.unice.polytech.dsl.builder.factory;

import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.AnalogSensor;
import fr.unice.polytech.dsl.kernel.structural.DigitalSensor;

public class BrickFactory {
    public static DigitalSensor digitalSensor(String name, int pin){
        DigitalSensor sensor = new DigitalSensor();
        sensor.setName(name);
        sensor.setPin(pin);
        return sensor;
    }


    public static AnalogSensor analogSensor(String name, int pin){
        AnalogSensor sensor = new AnalogSensor();
        sensor.setName(name);
        sensor.setPin(pin);
        return sensor;
    }
    public static Actuator actuator(String name, int pin){
        Actuator actuator = new Actuator();
        actuator.setName(name);
        actuator.setPin(pin);
        return actuator;
    }
}
