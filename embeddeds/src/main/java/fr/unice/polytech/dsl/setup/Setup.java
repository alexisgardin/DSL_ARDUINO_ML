package fr.unice.polytech.dsl.setup;

import fr.unice.polytech.dsl.builder.Arduino;
import fr.unice.polytech.dsl.exception.PinAlreadyUsedException;
import fr.unice.polytech.dsl.kernel.structural.Brick;

import static fr.unice.polytech.dsl.builder.factory.StateFactory.state;

public class Setup {

    public Setup(Brick brick) {
        Arduino.getInstance().bricks().add(brick);
    }

    public Setup and(final Brick brick) {
        if (Arduino.getInstance().bricks().stream().anyMatch(br -> br.getPin() == brick.getPin())) {
            throw new PinAlreadyUsedException();
        }
        Arduino.getInstance().bricks().add(brick);
        return this;
    }


    public Arduino createState(String ... states) {
        for (String s : states) {
            Arduino.getInstance().states().add(state(s));
        }
        return Arduino.getInstance();
    }
}
