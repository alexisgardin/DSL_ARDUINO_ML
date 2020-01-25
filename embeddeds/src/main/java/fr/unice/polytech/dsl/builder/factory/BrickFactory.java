package fr.unice.polytech.dsl.builder.factory;

import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.Brick;
import fr.unice.polytech.dsl.kernel.structural.Sensor;

public class BrickFactory {
    public static Sensor sensor(String name, int pin){
        Sensor sensor = new Sensor();
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
