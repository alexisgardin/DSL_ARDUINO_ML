package fr.unice.polytech.dsl.kernel.behavioral;

import fr.unice.polytech.dsl.kernel.generator.Visitor;

import java.util.ArrayList;
import java.util.List;

public class MultipleElementCondition extends Condition {

    private List<Condition> conditionList;
    private List<Operator> operators;

    public MultipleElementCondition() {
        this.conditionList = new ArrayList<>();
        this.operators = new ArrayList<>();
    }

    public List<Condition> getConditionList() {
        return conditionList;
    }

    public void setConditionList(List<Condition> conditionList) {
        this.conditionList = conditionList;
    }

    public Operator getOperator(int i) {
        return operators.get(i);
    }

    public void addOperator( Operator operator) {
        this.operators.add(operator);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean isSingle() {
        return false;
    }

    public void addCondition(Condition condition) {
        conditionList.add(condition);
    }
}
