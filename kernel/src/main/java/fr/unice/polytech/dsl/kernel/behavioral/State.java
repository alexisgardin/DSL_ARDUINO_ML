package fr.unice.polytech.dsl.kernel.behavioral;

import fr.unice.polytech.dsl.kernel.App;
import fr.unice.polytech.dsl.kernel.NamedElement;
import fr.unice.polytech.dsl.kernel.generator.Visitable;
import fr.unice.polytech.dsl.kernel.generator.Visitor;

import java.util.ArrayList;
import java.util.List;

public class State implements NamedElement, Visitable {

    private String name;
    private List<Action> actions = new ArrayList<Action>();
    private Transition transition;
    private App app;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Transition getTransition() {
        return transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
