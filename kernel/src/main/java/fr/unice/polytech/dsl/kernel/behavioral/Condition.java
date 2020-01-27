package fr.unice.polytech.dsl.kernel.behavioral;


import fr.unice.polytech.dsl.kernel.generator.Visitable;

public abstract class Condition implements Visitable {
     private static int recursion = 0;

     public int getRecursion() {
          return recursion;
     }
     public void increaseRecursion(){
          recursion++;
     }
     public abstract boolean isSingle();

     public void reset() {
          recursion=0;
     }
}
