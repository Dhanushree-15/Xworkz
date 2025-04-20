package com.xworkz.interfaces.interfaces;

public interface IThermometer {
    void measureTemp();
    void reset();
    void calibrate();

    default void cutThrough() {
        System.out.println("To review drilling plan.");
    }

}