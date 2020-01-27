package fr.unice.polytech.dsl;

import fr.unice.polytech.dsl.builder.Arduino;

import static fr.unice.polytech.dsl.builder.factory.BrickFactory.actuator;
import static fr.unice.polytech.dsl.builder.factory.BrickFactory.sensor;
import static fr.unice.polytech.dsl.kernel.structural.SIGNAL.HIGH;
import static fr.unice.polytech.dsl.kernel.structural.SIGNAL.LOW;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        dualCheckAlarm();
    }

    public static void dualCheckAlarm(){
        Arduino.setup(actuator("led", 12)).and(actuator("buzzer", 8))
                .and(sensor("button", 9))
                .and(sensor("button2", 11))
                .createState("work", "notwork")
                .createAction("AlarmOn","led", HIGH)
                    .addRelatedAction("buzzer", HIGH).bindToState("work")
                .createAction("AlarmOff", "led", LOW)
                    .addRelatedAction("buzzer", LOW).bindToState("notwork")
                .when("button1").are(HIGH).and("button2").are(HIGH).encapsulate().or()

                .atState("work").goToState("notwork")
                .onSensors("button", "button2").whenWeAreAteState("notwork").when(HIGH, LOW).goToState("work")
                .run("notwork");
    }

    public static void verySimpleAlarm() {
        Arduino.setup(actuator("led", 12))
                .and(sensor("button", 9))
                .and(actuator("buzz", 11))
                .createState("pressed", "unpress")
                .createAction("AlarmOn", "led", HIGH)
                    .addRelatedAction("buzz", HIGH).bindToState("pressed")
                .createAction("AlarmOff", "led", LOW)
                    .addRelatedAction("buzz", LOW).bindToState("unpress")
                .onSensor("button").whenWeAreAteState("unpress").when(HIGH).goToState("pressed")
                .onSensor("button").whenWeAreAteState("pressed").when(LOW).goToState("unpress")
                .run("unpress");
    }

    public static void stateBasedAlarm(){
        Arduino.setup(actuator("led", 12))
                .and(sensor("button", 9))
                .createState("on", "off")
                .createAction("LightOn", "led", HIGH).bindToState("on")
                .createAction("LightOff", "led", LOW).bindToState("off")
                .onSensor("button").whenWeAreAteState("off").when(HIGH).goToState("on")
                .onSensor("button").whenWeAreAteState("on").when(HIGH).goToState("off")
                .run("off");
    }
}
