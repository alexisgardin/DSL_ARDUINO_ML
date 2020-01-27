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

        //dualCheckAlarm();
        //verySimpleAlarm();
       // stateBasedAlarm();
        multiStateAlarm();
    }

    public static void dualCheckAlarm(){
        Arduino.setup(actuator("led", 12)).and(actuator("buzzer", 8))
                .and(sensor("button1", 9))
                .and(sensor("button2", 11))
                .createState("work", "notwork")
                .createAction("AlarmOn","led", HIGH)
                    .addRelatedAction("buzzer", HIGH).bindToState("work")
                .createAction("AlarmOff", "led", LOW)
                    .addRelatedAction("buzzer", LOW).bindToState("notwork")
                .whenSensor("button1").are(HIGH).and("button2").are(HIGH)
                .atState("notwork").goToState("work")
                .whenSensor("button1").are(LOW).or("button2").are(LOW).atState("work").goToState("notwork")
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
                .whenSensor("button").are(HIGH).atState("unpress").goToState("pressed")
                .whenSensor("button").are(LOW).atState("pressed").goToState("unpress")
                .run("unpress");
    }

    public static void stateBasedAlarm(){
      Arduino.setup(actuator("led", 12))
                .and(sensor("button", 9))
                .createState("on", "off")
                .createAction("LightOn", "led", HIGH).bindToState("on")
                .createAction("LightOff", "led", LOW).bindToState("off")
              .whenSensor("button").are(HIGH).atState("on").goToState("off")
              .whenSensor("button").are(HIGH).atState("off").goToState("on")
                .run("off");
    }

    public static void multiStateAlarm(){
        Arduino.setup(actuator("led", 12))
                .and(actuator("buzzer", 11))
                .and(sensor("button", 9))
                .createState("LedOn", "BuzzerOn", "Off")
                .createAction("UpBuzzer", "buzzer", HIGH).addRelatedAction("led", LOW).bindToState("BuzzerOn")
                .createAction("LedUp", "led", HIGH).addRelatedAction("buzzer", LOW).bindToState("LedOn")
                .createAction("Off", "led", LOW).addRelatedAction("buzzer", LOW).bindToState("Off")
                .whenSensor("button").are(HIGH).atState("Off").goToState("BuzzerOn")
                .whenSensor("button").are(HIGH).atState("BuzzerOn").goToState("LedOn")
                .whenSensor("button").are(HIGH).atState("LedOn").goToState("Off")
                .run("Off");
    }
}
