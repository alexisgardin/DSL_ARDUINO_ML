package fr.unice.polytech.dsl.kernel.structural;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

public class Sensor extends Brick {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
