package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class MultiImpl25 implements IRouter, ITablet, IScanner, ISmartWatch, ISpeakerSystem {
    public void connect() { System.out.println("MultiImpl25 - connect"); }
    public void disconnect() { System.out.println("MultiImpl25 - disconnect"); }
    public void reset() { System.out.println("MultiImpl25 - reset"); }
    public void tap() { System.out.println("MultiImpl25 - tap"); }
    public void swipe() { System.out.println("MultiImpl25 - swipe"); }
    public void installApp() { System.out.println("MultiImpl25 - installApp"); }
    public void scanDocument() { System.out.println("MultiImpl25 - scanDocument"); }
    public void scanImage() { System.out.println("MultiImpl25 - scanImage"); }
    public void preview() { System.out.println("MultiImpl25 - preview"); }
    public void trackSteps() { System.out.println("MultiImpl25 - trackSteps"); }
    public void monitorHeartRate() { System.out.println("MultiImpl25 - monitorHeartRate"); }
    public void displayTime() { System.out.println("MultiImpl25 - displayTime"); }
    public void turnOn() { System.out.println("MultiImpl25 - turnOn"); }
    public void adjustBass() { System.out.println("MultiImpl25 - adjustBass"); }
    public void mute() { System.out.println("MultiImpl25 - mute"); }
}
