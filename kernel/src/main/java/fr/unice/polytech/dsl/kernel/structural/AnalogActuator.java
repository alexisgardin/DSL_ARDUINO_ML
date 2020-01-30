package fr.unice.polytech.dsl.kernel.structural;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

public class AnalogActuator extends Actuator {
    private int value;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    @Override
    public boolean isAnalog() {
        return true;
    }

    @Override
    public boolean isDigital() {
        return false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(short value) {
        if(value>255 || value < 0){
            throw new IllegalArgumentException("When you set value here, you assign value to this actuator and you only" +
                    " can assign value between 0 and 255, see : https://www.arduino.cc/reference/en/language/functions/analog-io/analogwrite/");
        }
        this.value = value;
    }
}
