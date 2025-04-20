package com.xworkz.interfaces.interfaces;

public interface IWindowBlind {
    void open();
    void close();
    void adjustTilt();

    default void labelSpot() {
        System.out.println("To label drilled spots.");
    }

}