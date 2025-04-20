package com.xworkz.interfaces.interfaces;

public interface IMeasuringScale {
    void weigh();
    void tare();
    void reset();

    default void pushLightly() {
        System.out.println("To apply light pressure.");
    }

}