package fr.unice.polytech.dsl;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;

import static fr.unice.polytech.dsl.builder.factory.BrickFactory.actuator;
import static fr.unice.polytech.dsl.builder.factory.BrickFactory.sensor;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        verySimpleAlarm();
    }

    public static void dualCheckAlarm(){
        Arduino.setup(actuator("led", 12))
                .and(sensor("button", 9))
                .and(sensor("button2", 11))
                .createState("work", "notwork");
    }

    public static void verySimpleAlarm() {
        Arduino.setup(actuator("led", 12))
                .and(sensor("button", 9))
                .and(actuator("buzz", 11))
                .createState("pressed", "unpress")
                .createAction("AlarmOn", "led", SIGNAL.HIGH)
                    .addRelatedAction("buzz", SIGNAL.HIGH).bindToState("pressed")
                .createAction("AlarmOff", "led", SIGNAL.LOW)
                    .addRelatedAction("buzz", SIGNAL.LOW).bindToState("unpress")
                .onSensor("button").whenStateIs("unpress").when(SIGNAL.HIGH).nextState("pressed")
                .onSensor("button").whenStateIs("pressed").when(SIGNAL.LOW).nextState("unpress")
                .run("unpress");
    }

    public static void stateBasedAlarm(){
        Arduino.setup(actuator("led", 12))
                .and(sensor("button", 9))
                .createState("on", "off")
                .createAction("LightOn", "led", SIGNAL.HIGH).bindToState("on")
                .createAction("LightOff", "led", SIGNAL.LOW).bindToState("off")
                .onSensor("button").whenStateIs("off").when(SIGNAL.HIGH).nextState("on")
                .onSensor("button").whenStateIs("on").when(SIGNAL.HIGH).nextState("off")
                .run("off");
    }
}
