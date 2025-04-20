package com.xworkz.interfaces.interfaces;

public interface IDrone {
    void takeOff();
    void land();
    void fly();

    default void setDrillSpeed() {
        System.out.println("To set the drill to correct speed.");
    }

}