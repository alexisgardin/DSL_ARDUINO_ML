package fr.unice.polytech.dsl.kernel.behavioral;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

public class AnalogAction extends Action {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value > 255 || value < 0) {
            throw new IllegalArgumentException("When you set value here, you assign value to this actuator and you only" +
                    " can assign value between 0 and 255, see : https://www.arduino.cc/reference/en/language/functions/analog-io/analogwrite/");
        }
        this.value = value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
