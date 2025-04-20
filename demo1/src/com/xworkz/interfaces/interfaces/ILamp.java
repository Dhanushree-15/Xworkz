package com.xworkz.interfaces.interfaces;

public interface ILamp {
    void turnOn();
    void dim();
    void changeColor();

    default void wearGloves() {
        System.out.println("To wear gloves for safety.");
    }

}