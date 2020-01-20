package fr.unice.polytech.dsl;

import fr.unice.polytech.dsl.builder.Arduino;

import static fr.unice.polytech.dsl.builder.Device.button;
import static fr.unice.polytech.dsl.builder.Device.led;
import static fr.unice.polytech.dsl.builder.StateFactory.state;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Arduino.setup(led(12)).and(button(9)).then(state("on"));
    }
}
