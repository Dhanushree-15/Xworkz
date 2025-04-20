package com.xworkz.interfaces.interfaces;

public interface IElectricKettle {
    void boilWater();
    void autoOff();
    void keepWarm();

    default void measureDepth() {
        System.out.println("To measure the drilling depth.");
    }

}