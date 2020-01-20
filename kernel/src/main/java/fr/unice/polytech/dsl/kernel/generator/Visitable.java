package fr.unice.polytech.dsl.kernel.generator;

public interface Visitable {

	public void accept(Visitor visitor);

}
