package fr.unice.polytech.dsl.kernel.behavioral;

public enum Operator {
    AND("&&"),
    OR("||");

    private String javaEquivalent;

    private Operator(String javaEquivalent) {
        this.javaEquivalent = javaEquivalent;
    }

    public String getJavaEquivalent() {
        return javaEquivalent;
    }
}
