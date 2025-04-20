package com.xworkz.interfaces.interfaces;

public interface IHeater {
    void turnOn();
    void turnOff();
    void setTemperature();

    default void hammerNail() {
        System.out.println("To hammer a nail.");
    }

}