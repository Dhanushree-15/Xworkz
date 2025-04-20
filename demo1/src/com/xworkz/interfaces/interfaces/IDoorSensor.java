package com.xworkz.interfaces.interfaces;

public interface IDoorSensor {
    void detectOpen();
    void detectClose();
    void sendAlert();

    default void routeCable() {
        System.out.println("To route cables through walls.");
    }

}