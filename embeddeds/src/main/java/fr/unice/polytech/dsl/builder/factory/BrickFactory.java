package fr.unice.polytech.dsl.builder.factory;

import fr.unice.polytech.dsl.kernel.structural.*;

public class BrickFactory {
    public static DigitalSensor digitalSensor(String name, int pin){
        DigitalSensor sensor = new DigitalSensor();
        sensor.setName(name);
        sensor.setPin(Integer.toString(pin));
        return sensor;
    }

    public static DigitalSensor digitalSensor(String name, String pin){
        DigitalSensor sensor = new DigitalSensor();
        sensor.setName(name);
        sensor.setPin(pin);
        return sensor;
    }

    public static AnalogSensor analogSensor(String name, int pin){
        AnalogSensor sensor = new AnalogSensor();
        sensor.setName(name);
        sensor.setPin(Integer.toString(pin));
        return sensor;
    }


    public static AnalogSensor analogSensor(String name, int pin, double factor){
        AnalogSensor analogSensor = analogSensor(name, pin);
        analogSensor.setFactor(factor);
        return analogSensor;
    }


    public static AnalogSensor analogSensor(String name, String pin){
        AnalogSensor sensor = new AnalogSensor();
        sensor.setName(name);
        sensor.setPin(pin);
        return sensor;
    }

    public static AnalogSensor analogSensor(String name, String pin, double factor){
        AnalogSensor analogSensor = analogSensor(name, pin);
        analogSensor.setFactor(factor);
        return analogSensor;
    }

    public static DigitalActuator digitalActuator(String name, int pin){
        DigitalActuator actuator = new DigitalActuator();
        actuator.setName(name);
        actuator.setPin(Integer.toString(pin));
        return actuator;
    }

    public static AnalogActuator analogActuator(String name, int pin){
        AnalogActuator actuator = new AnalogActuator();
        actuator.setName(name);
        actuator.setPin(Integer.toString(pin));
        return actuator;
    }

    public static DigitalActuator digitalActuator(String name, String pin){
        DigitalActuator actuator = new DigitalActuator();
        actuator.setName(name);
        actuator.setPin(pin);
        return actuator;
    }

    public static AnalogActuator analogActuator(String name, String pin){
        AnalogActuator actuator = new AnalogActuator();
        actuator.setName(name);
        actuator.setPin(pin);
        return actuator;
    }
}
