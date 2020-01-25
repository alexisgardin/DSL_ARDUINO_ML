package fr.unice.polytech.dsl.kernel.behavioral;

import fr.unice.polytech.dsl.kernel.generator.Visitable;
import fr.unice.polytech.dsl.kernel.generator.Visitor;
import fr.unice.polytech.dsl.kernel.structural.Actuator;
import fr.unice.polytech.dsl.kernel.structural.SIGNAL;

public class Action implements Visitable {
	private String name;
	private SIGNAL value;
	private Actuator actuator;


	public SIGNAL getValue() {
		return value;
	}

	public void setValue(SIGNAL value) {
		this.value = value;
	}

	public Actuator getActuator() {
		return actuator;
	}

	public void setActuator(Actuator actuator) {
		this.actuator = actuator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
