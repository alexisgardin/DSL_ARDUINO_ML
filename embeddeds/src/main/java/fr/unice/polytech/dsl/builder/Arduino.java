package fr.unice.polytech.dsl.builder;

import fr.unice.polytech.dsl.exception.BrickNotFoundException;
import fr.unice.polytech.dsl.exception.StateNotFoundException;
import fr.unice.polytech.dsl.kernel.App;
import fr.unice.polytech.dsl.kernel.behavioral.Action;
import fr.unice.polytech.dsl.kernel.behavioral.State;
import fr.unice.polytech.dsl.kernel.generator.ToWiring;
import fr.unice.polytech.dsl.kernel.generator.Visitor;
import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.Brick;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;
import fr.unice.polytech.dsl.kernel.structural.Sensor;
import fr.unice.polytech.dsl.setup.Setup;
import fr.unice.polytech.dsl.setup.action.SetBindingAction;
import fr.unice.polytech.dsl.setup.action.SetupAction;
import fr.unice.polytech.dsl.setup.transition.SetAnalogComparator;
import fr.unice.polytech.dsl.setup.transition.SetDigitalSignal;
import fr.unice.polytech.dsl.setup.transition.SetupTransition;

import java.util.ArrayList;
import java.util.List;


public class Arduino {

    private List<Brick> brickList;
    private List<State> states;
    private List<Action> actions;
    private static Setup setup;
    private static Arduino mInstance;

    private Arduino() {
        brickList = new ArrayList<>();
        states = new ArrayList<>();
        actions = new ArrayList<>();
    }

    public static Setup setup(Brick brick) {
        if (setup == null) {
            setup = new Setup(brick);
        }
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

    public List<Action> actions() {
        return this.actions;
    }

    public SetBindingAction createAction(String nameOfAction, String nameOfBrick, SIGNAL signal) {
        return SetupAction.createAction(nameOfAction, nameOfBrick, signal);

    }
    public SetBindingAction createActionWithAnalogValue(String nameOfAction, String nameOfBrick, int value) {
        return SetupAction.createAction(nameOfAction, nameOfBrick, value);

    }


    public void run(final String initialState) {
        // Building the App
        App app = new App();
        app.setName("App");
        app.setBricks(brickList);
        app.setStates(states);
        app.setInitial(states.stream().filter(v -> v.getName().equals(initialState)).findFirst().orElseThrow(StateNotFoundException::new));
        // Generating Code
        Visitor codeGenerator = new ToWiring();
        app.accept(codeGenerator);

        // Printing the generated code on the console
        System.out.println(codeGenerator.getResult());
    }

    public State getState(String state) {
        return states.stream().filter(v -> v.getName().equals(state)).findFirst().orElseThrow(StateNotFoundException::new);
    }

    public Sensor getSensor(String sensor) {
        return (Sensor) brickList.stream().filter(v -> v.getName().equals(sensor)).findFirst().orElseThrow(BrickNotFoundException::new);
    }

    public Actuator getActuator(String actuator) {
        return (Actuator) brickList.stream().filter(v -> v.getName().equals(actuator)).findFirst().orElseThrow(BrickNotFoundException::new);
    }

    public SetDigitalSignal whenDigitalSensor(String sensor) {
        return new SetupTransition().whenDigitalSensor(sensor);
    }

    public SetAnalogComparator whenAnalogSensor(String sensor) {
        return new SetupTransition().whenAnalogSensor(sensor);
    }
}
