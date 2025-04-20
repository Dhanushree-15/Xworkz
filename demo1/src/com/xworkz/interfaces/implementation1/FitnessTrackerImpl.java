package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IFitnessTracker;

public class FitnessTrackerImpl implements IFitnessTracker {
    public void countSteps() { System.out.println("FitnessTrackerImpl - countSteps"); }
    public void trackSleep() { System.out.println("FitnessTrackerImpl - trackSleep"); }
    public void monitorHeartRate() { System.out.println("FitnessTrackerImpl - monitorHeartRate"); }

    public void tightenNut() {
        System.out.println("To tighten a nut using a wrench.");
    }

}