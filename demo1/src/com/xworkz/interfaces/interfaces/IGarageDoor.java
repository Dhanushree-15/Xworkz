package com.xworkz.interfaces.interfaces;

public interface IGarageDoor {
    void open();
    void close();
    void lock();

    default void preDrill() {
        System.out.println("To pre-drill before screwing.");
    }

}