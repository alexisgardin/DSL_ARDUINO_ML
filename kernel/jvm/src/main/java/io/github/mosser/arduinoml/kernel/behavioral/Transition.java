package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.*;

public class Transition implements Visitable {

	private State next;
	private Condition condition;

	public State getNext() {
		return next;
	}

	public void setNext(State next) {
		this.next = next;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}
}
