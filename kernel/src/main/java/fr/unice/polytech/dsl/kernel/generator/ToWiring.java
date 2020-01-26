package fr.unice.polytech.dsl.kernel.generator;

import fr.unice.polytech.dsl.kernel.App;
import fr.unice.polytech.dsl.kernel.behavioral.*;
import fr.unice.polytech.dsl.kernel.structural.*;

import java.util.List;

/**
 * Quick and dirty visitor to support the generation of Wiring code
 */
public class ToWiring extends Visitor<StringBuffer> {

	private final static String CURRENT_STATE = "current_state";

	public ToWiring() {
		this.result = new StringBuffer();
	}

	private void w(String s) {
		result.append(String.format("%s\n",s));
	}

	/**
	 * Write simple, without \n
	 * @param s
	 */
	private void ws(String s) {
		result.append(String.format("%s",s));
	}

	@Override
	public void visit(App app) {
		w("// Wiring code generated from an ArduinoML model");
		w(String.format("// Application name: %s\n", app.getName()));

		w("void setup(){");
		for(Brick brick: app.getBricks()){
			brick.accept(this);
		}
		w("}\n");

		w("long time = 0; long debounce = 200;\n");

		for(State state: app.getStates()){
			state.accept(this);
		}

		if (app.getInitial() != null) {
			w("void loop() {");
			w(String.format("  state_%s();", app.getInitial().getName()));
			w("}");
		}
	}

	@Override
	public void visit(Actuator actuator) {
	 	w(String.format("  pinMode(%d, OUTPUT); // %s [Actuator]", actuator.getPin(), actuator.getName()));
	}


	@Override
	public void visit(Sensor sensor) {
		w(String.format("  pinMode(%d, INPUT);  // %s [Sensor]", sensor.getPin(), sensor.getName()));
	}

	@Override
	public void visit(State state) {
		w(String.format("void state_%s() {",state.getName()));
		for(Action action: state.getActions()) {
			action.accept(this);
		}

		if (state.getTransition() != null) {
			w("  boolean guard = millis() - time > debounce;");
			context.put(CURRENT_STATE, state);
			state.getTransition().accept(this);
			w("}\n");
		}

	}

	@Override
	public void visit(MultipleTriggerTransition transition) {
		ws("	if( ");
		if(transition.isValid()){
			for (int i = 0; i < transition.getSensors().size(); i++) {
				ws(String.format("digitalRead(%d) == %s",
						transition.getSensors().get(i).getPin(),transition.getSignals().get(i)));
				if(i!=transition.getSensors().size()-1){
					ws(" && ");
				}
			}
		}
		w(" && guard ) {");
		w("    time = millis();");
		w(String.format("    state_%s();",transition.getNext().getName()));
		w("  } else {");
		w(String.format("    state_%s();",((State) context.get(CURRENT_STATE)).getName()));
		w("  }");
	}

	@Override
	public void visit(Action action) {
		w(String.format("  digitalWrite(%d,%s);",action.getActuator().getPin(),action.getValue()));
	}

}
