package fr.unice.polytech.dsl.builder;

import fr.unice.polytech.dsl.exception.builder.PinAlreadyUsedException;
import fr.unice.polytech.dsl.kernel.behavioral.State;
import fr.unice.polytech.dsl.kernel.structural.Brick;

import java.util.Arrays;

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


    public void createState(String ... state) {

        return Arduino.getInstance().states().addAll(new State());
    }
}
