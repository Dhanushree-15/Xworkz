package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.ICoffeeMachine;

public class CoffeeMachineImpl implements ICoffeeMachine {
    public void brewCoffee() { System.out.println("CoffeeMachineImpl - brewCoffee"); }
    public void steamMilk() { System.out.println("CoffeeMachineImpl - steamMilk"); }
    public void clean() { System.out.println("CoffeeMachineImpl - clean"); }

    public void grindSurface() {
        System.out.println("To grind the surface smoothly.");
    }

}