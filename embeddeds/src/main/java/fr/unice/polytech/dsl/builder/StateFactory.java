package fr.unice.polytech.dsl.builder;

import fr.unice.polytech.dsl.kernel.behavioral.State;

public class StateFactory {

    public static State state(String name){
        State s = new State();
        s.setName(name);
        return s;
    }
}
