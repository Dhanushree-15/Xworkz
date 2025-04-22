package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.CoffeeMachine;

public class CoffeeMachineUser {
    private CoffeeMachine device;

    public CoffeeMachineUser(CoffeeMachine device) {
        this.device = device;
        System.out.println("Initializing CoffeeMachineUser with CoffeeMachine");
    }

    public void brewCoffee() {
        System.out.println("Using the CoffeeMachine");
        if (this.device != null) {
            this.device.brewCoffee();
        } else {
            System.err.println("CoffeeMachine is not available");
        }
    }
}
