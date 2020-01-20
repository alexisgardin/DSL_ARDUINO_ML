package fr.unice.polytech.dsl.builder;

import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.Brick;
import fr.unice.polytech.dsl.kernel.structural.Sensor;

public class BrickFactory {
    public static Brick sensor(String name, int pin){
        Sensor sensor = new Sensor();
        sensor.setName(name);
        sensor.setPin(pin);
        return sensor;
    }
    public static Brick actuator(String name, int pin){
        Actuator actuator = new Actuator();
        actuator.setName(name);
        actuator.setPin(pin);
        return actuator;
    }
}
