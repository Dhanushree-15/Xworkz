package com.xworkz.interfaces.interfaces;

public interface IElectricStove {
    void turnOn();
    void adjustHeat();
    void turnOff();

    default void positionHole() {
        System.out.println("To position the hole accurately.");
    }

}