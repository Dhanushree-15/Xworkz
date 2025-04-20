package com.xworkz.interfaces.interfaces;

public interface ICar {
    void startEngine();
    void stopEngine();
    void honk();

    default void boreHole() {
        System.out.println("To bore a small hole for wiring.");
    }

}