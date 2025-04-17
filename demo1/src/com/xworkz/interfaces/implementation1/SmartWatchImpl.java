package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class SmartWatchImpl implements ISmartWatch {
    public void trackSteps() { System.out.println("SmartWatchImpl - trackSteps"); }
    public void monitorHeartRate() { System.out.println("SmartWatchImpl - monitorHeartRate"); }
    public void displayTime() { System.out.println("SmartWatchImpl - displayTime"); }
}
