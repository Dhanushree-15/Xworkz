package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Electrolux implements IVacuumCleaner, IRouter, ITablet, IScanner, ISmartWatch {
    public void start() { System.out.println("MultiImpl24 - start"); }
    public void stop() { System.out.println("MultiImpl24 - stop"); }
    public void changeMode() { System.out.println("MultiImpl24 - changeMode"); }
    public void connect() { System.out.println("MultiImpl24 - connect"); }
    public void disconnect() { System.out.println("MultiImpl24 - disconnect"); }
    public void reset() { System.out.println("MultiImpl24 - reset"); }
    public void tap() { System.out.println("MultiImpl24 - tap"); }
    public void swipe() { System.out.println("MultiImpl24 - swipe"); }
    public void installApp() { System.out.println("MultiImpl24 - installApp"); }
    public void scanDocument() { System.out.println("MultiImpl24 - scanDocument"); }
    public void scanImage() { System.out.println("MultiImpl24 - scanImage"); }
    public void preview() { System.out.println("MultiImpl24 - preview"); }
    public void trackSteps() { System.out.println("MultiImpl24 - trackSteps"); }
    public void monitorHeartRate() { System.out.println("MultiImpl24 - monitorHeartRate"); }
    public void displayTime() { System.out.println("MultiImpl24 - displayTime"); }
}
