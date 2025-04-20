package com.xworkz.interfaces.interfaces;

public interface IThermostat {
    void setTemp();
    void increaseTemp();
    void decreaseTemp();

    default void wearGoggles() {
        System.out.println("To cut through drywall.");
    }

}