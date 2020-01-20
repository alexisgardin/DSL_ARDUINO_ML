package fr.unice.polytech.dsl.builder;


import fr.unice.polytech.dsl.kernel.structural.Brick;

import static fr.unice.polytech.dsl.builder.BrickFactory.actuator;
import static fr.unice.polytech.dsl.builder.BrickFactory.sensor;

public class Device {
    public static Brick button(int pin) {
        return sensor("button", pin);
    }

    public static Brick led(int pin) {
        return actuator("led", pin);
    }
}
