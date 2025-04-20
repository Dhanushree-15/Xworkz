package com.xworkz.interfaces.interfaces;

public interface IChair {
    void sit();
    void adjustHeight();
    void rotate();

    default void fitPlug() {
        System.out.println("To fit plastic plugs before screwing.");
    }

}