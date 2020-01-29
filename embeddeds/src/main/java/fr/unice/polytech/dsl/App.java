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
        temperatureBaseAlarm();
    }

    public static void temperatureBaseAlarm(){
        Arduino.setup(actuator("led", 12))
                .and(analogSensor("temp", 9, 0.4887585533))
                .and(actuator("buzz", 11))
                .createState("highTemp", "lowTemp")
                .createAction("AlarmOn", "led", HIGH)
                .addRelatedAction("buzz", HIGH).bindToState("highTemp")
                .createAction("AlarmOff", "led", LOW)
                .addRelatedAction("buzz", LOW).bindToState("lowTemp")
                .whenAnalogSensor("temp").are(Comparator.SUPERIOR).withValue(25).atState("lowTemp").goToState("highTemp")
                .whenAnalogSensor("temp").are(Comparator.INFERIOR).withValue(25).atState("highTemp").goToState("lowTemp")
                .run("lowTemp");

    }
    public static void dualCheckAlarm(){
        Arduino.setup(actuator("led", 12)).and(actuator("buzzer", 8))
                .and(digitalSensor("button1", 9))
                .and(digitalSensor("button2", 11))
                .createState("work", "notwork")
                .createAction("AlarmOn","led", HIGH)
                    .addRelatedAction("buzzer", HIGH).bindToState("work")
                .createAction("AlarmOff", "led", LOW)
                    .addRelatedAction("buzzer", LOW).bindToState("notwork")
                .whenDigitalSensor("button1").are(HIGH).andDigital("button2").are(HIGH)
                .atState("notwork").goToState("work")
                .whenDigitalSensor("button1").are(LOW).orDigital("button2").are(LOW).atState("work").goToState("notwork")
                .run("notwork");
    }

    public static void verySimpleAlarm() {
        Arduino.setup(actuator("led", 12))
                .and(digitalSensor("button", 9))
                .and(actuator("buzz", 11))
                .createState("pressed", "unpress")
                .createAction("AlarmOn", "led", HIGH)
                    .addRelatedAction("buzz", HIGH).bindToState("pressed")
                .createAction("AlarmOff", "led", LOW)
                    .addRelatedAction("buzz", LOW).bindToState("unpress")
                .whenDigitalSensor("button").are(HIGH).atState("unpress").goToState("pressed")
                .whenDigitalSensor("button").are(LOW).atState("pressed").goToState("unpress")
                .run("unpress");
    }

    public static void stateBasedAlarm(){
      Arduino.setup(actuator("led", 12))
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

    public static void multiStateAlarm(){
        Arduino.setup(actuator("led", 12))
                .and(actuator("buzzer", 11))
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
