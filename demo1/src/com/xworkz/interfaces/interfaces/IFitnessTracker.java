package com.xworkz.interfaces.interfaces;

public interface IFitnessTracker {
    void countSteps();
    void trackSleep();
    void monitorHeartRate();

    default void tightenNut() {
        System.out.println("To tighten a nut using a wrench.");
    }

}