package com.xworkz.interfaces.interfaces;

public interface IPrinter {
    void print();
    void scan();
    void copy();

    default void aimSpot() {
        System.out.println("To aim at the marked spot.");
    }

}