package fr.unice.polytech.dsl.builder;

import fr.unice.polytech.dsl.kernel.behavioral.State;
import fr.unice.polytech.dsl.kernel.structural.Brick;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Arduino {

    private List<Brick> brickList;
    private List<State> states;
    private static Setup setup;
    private static Arduino mInstance;

    private Arduino() {
        brickList = new ArrayList<>();
        states = new ArrayList<>();
    }

    public static Setup setup(Brick brick){
        setup = new Setup(brick);
        return setup;
    }

    public static Arduino getInstance() {
        if (mInstance == null) {
            mInstance = new Arduino();
        }
        return mInstance;
    }

    public List<Brick> bricks() {
        return brickList;
    }

    public List<State> states() {
        return states;
    }
}
