package com.xworkz.interfaces.interfaces;

public interface IFlashlight {
    void turnOn();
    void adjustBeam();
    void blink();

    default void sandEdge() {
        System.out.println("To sand the edge smooth.");
    }

}