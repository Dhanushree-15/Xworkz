package com.xworkz.interfaces.interfaces;

public interface IAirConditioner {
    void turnOn();
    void turnOff();
    void setTemperature();

    default void drillWall() {
        System.out.println("To make holes in concrete walls.");
    }

}