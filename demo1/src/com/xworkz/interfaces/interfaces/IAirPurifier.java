package com.xworkz.interfaces.interfaces;

public interface IAirPurifier {
    void purifyAir();
    void changeFilter();
    void turnOn();

    default void fixFrame() {
        System.out.println("To fix the frame on the wall.");
    }

}