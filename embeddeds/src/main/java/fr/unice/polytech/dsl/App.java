package fr.unice.polytech.dsl;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.kernel.behavioral.condition.Comparator;

import static fr.unice.polytech.dsl.builder.factory.BrickFactory.*;
import static fr.unice.polytech.dsl.kernel.structural.SIGNAL.HIGH;
import static fr.unice.polytech.dsl.kernel.structural.SIGNAL.LOW;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //dualCheckAlarm();
        //verySimpleAlarm();
        // stateBasedAlarm();
        //multiStateAlarm();
        //temperatureBaseAlarm();
        multiStateLevelAlarm();
    }

    /**
     * Attention, certaine pin arduino uno fonctionne différemment pas avec les valeurs analog
     * les pin 9, 10, 11 devraient faire l'affaire
     * Voir : https://www.arduino.cc/reference/en/language/functions/analog-io/analogwrite/
     */
    public static void multiStateLevelAlarm() {
        Arduino.setup(analogActuator("buzzer", 10))
                .and(digitalSensor("button", 9))
                .createState("low", "medium", "high")
                .createAction("HighIntensity", "buzzer", HIGH).bindToState("high") //We let the factory build the good action in function of actuator type
                .createAction("LowIntensity", "buzzer", LOW).bindToState("low")
                .createActionWithAnalogValue("LowIntensity", "buzzer", 128).bindToState("medium")
                .whenDigitalSensor("button").are(HIGH).atState("medium").goToState("high")
                .whenDigitalSensor("button").are(HIGH).atState("high").goToState("low")
                .whenDigitalSensor("button").are(HIGH).atState("low").goToState("medium")
                .run("low");
        /**
         Arduino.setup(actuator("led", 12))
         .and(sensor("button", 9))
         .createState("on", "off")
         .createAction("LightOn", "led", HIGH).bindToState("on")
         .createAction("LightOff", "led", LOW).bindToState("off")
         .whenSensor("button").are(HIGH).atState("on").goToState("off")
         .whenSensor("button").are(HIGH).atState("off").goToState("on")
         .run("off");
         */
    }

    public static void temperatureBaseAlarm() {
        Arduino.setup(digitalActuator("led", 12))
                .and(analogSensor("temp", 9, 0.4887585533))
                .and(digitalActuator("buzz", 11))
                .createState("highTemp", "lowTemp")
                .createAction("AlarmOn", "led", HIGH)
                .addRelatedAction("buzz", HIGH).bindToState("highTemp")
                .createAction("AlarmOff", "led", LOW)
                .addRelatedAction("buzz", LOW).bindToState("lowTemp")
                .whenAnalogSensor("temp").are(Comparator.SUPERIOR).withValue(25).atState("lowTemp").goToState("highTemp")
                .whenAnalogSensor("temp").are(Comparator.INFERIOR).withValue(25).atState("highTemp").goToState("lowTemp")
                .run("lowTemp");

    }

    public static void dualCheckAlarm() {
        Arduino.setup(digitalActuator("led", 12)).and(digitalActuator("buzzer", 8))
                .and(digitalSensor("button1", 9))
                .and(digitalSensor("button2", 11))
                .createState("work", "notwork")
                .createAction("AlarmOn", "led", HIGH)
                .addRelatedAction("buzzer", HIGH).bindToState("work")
                .createAction("AlarmOff", "led", LOW)
                .addRelatedAction("buzzer", LOW).bindToState("notwork")
                .whenDigitalSensor("button1").are(HIGH).andDigital("button2").are(HIGH)
                .atState("notwork").goToState("work")
                .whenDigitalSensor("button1").are(LOW).orDigital("button2").are(LOW).atState("work").goToState("notwork")
                .run("notwork");
    }

    public static void verySimpleAlarm() {
        Arduino.setup(digitalActuator("led", 12))
                .and(digitalSensor("button", 9))
                .and(digitalActuator("buzz", 11))
                .createState("pressed", "unpress")
                .createAction("AlarmOn", "led", HIGH)
                .addRelatedAction("buzz", HIGH).bindToState("pressed")
                .createAction("AlarmOff", "led", LOW)
                .addRelatedAction("buzz", LOW).bindToState("unpress")
                .whenDigitalSensor("button").are(HIGH).atState("unpress").goToState("pressed")
                .whenDigitalSensor("button").are(LOW).atState("pressed").goToState("unpress")
                .run("unpress");
    }

    public static void stateBasedAlarm() {
        Arduino.setup(digitalActuator("led", 12))
                .and(digitalSensor("button", 9))
                .createState("on", "off")
                .createAction("LightOn", "led", HIGH).bindToState("on")
                .createAction("LightOff", "led", LOW).bindToState("off")
                .whenDigitalSensor("button").are(HIGH).atState("on").goToState("off")
                .whenDigitalSensor("button").are(HIGH).atState("off").goToState("on")
                .run("off");
        /**
         Arduino.setup(actuator("led", 12))
         .and(sensor("button", 9))
         .createState("on", "off")
         .createAction("LightOn", "led", HIGH).bindToState("on")
         .createAction("LightOff", "led", LOW).bindToState("off")
         .whenSensor("button").are(HIGH).atState("on").goToState("off")
         .whenSensor("button").are(HIGH).atState("off").goToState("on")
         .run("off");
         */
    }

    public static void multiStateAlarm() {
        Arduino.setup(digitalActuator("led", 12))
                .and(digitalActuator("buzzer", 11))
                .and(digitalSensor("button", 9))
                .createState("LedOn", "BuzzerOn", "Off")
                .createAction("UpBuzzer", "buzzer", HIGH).addRelatedAction("led", LOW).bindToState("BuzzerOn")
                .createAction("LedUp", "led", HIGH).addRelatedAction("buzzer", LOW).bindToState("LedOn")
                .createAction("Off", "led", LOW).addRelatedAction("buzzer", LOW).bindToState("Off")
                .whenDigitalSensor("button").are(HIGH).atState("Off").goToState("BuzzerOn")
                .whenDigitalSensor("button").are(HIGH).atState("BuzzerOn").goToState("LedOn")
                .whenDigitalSensor("button").are(HIGH).atState("LedOn").goToState("Off")
                .run("Off");
    }
}
