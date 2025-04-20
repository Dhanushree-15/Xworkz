package com.xworkz.interfaces.interfaces;

public interface ILight {
    void switchOn();
    void switchOff();
    void dim();

    default void drillMetal() {
        System.out.println("To drill into metal surface.");
    }

}