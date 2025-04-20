package com.xworkz.interfaces.interfaces;

public interface ISmartWatch {
    void trackSteps();
    void monitorHeartRate();
    void displayTime();

    default void cleanBit() {
        System.out.println("To lock the chuck properly.");
    }

}