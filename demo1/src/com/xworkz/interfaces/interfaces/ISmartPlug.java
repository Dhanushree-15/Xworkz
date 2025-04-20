package com.xworkz.interfaces.interfaces;

public interface ISmartPlug {
    void turnOn();
    void turnOff();
    void schedule();

    default void lightArea() {
        System.out.println("To light up the work area.");
    }

}