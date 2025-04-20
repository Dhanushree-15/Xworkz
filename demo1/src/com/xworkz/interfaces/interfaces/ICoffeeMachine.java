package com.xworkz.interfaces.interfaces;

public interface ICoffeeMachine {
    void brewCoffee();
    void steamMilk();
    void clean();

    default void grindSurface() {
        System.out.println("To grind the surface smoothly.");
    }

}