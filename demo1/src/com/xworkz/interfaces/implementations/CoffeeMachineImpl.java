package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.ICoffeeMachine;

public class CoffeeMachineImpl implements ICoffeeMachine {
    public void brewCoffee() { System.out.println("CoffeeMachineImpl - brewCoffee"); }
    public void steamMilk() { System.out.println("CoffeeMachineImpl - steamMilk"); }
    public void clean() { System.out.println("CoffeeMachineImpl - clean"); }
}
