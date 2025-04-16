package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class MultiImpl23 implements IRobot, IVacuumCleaner, IRouter, ITablet, IScanner {
    public void walk() { System.out.println("MultiImpl23 - walk"); }
    public void speak() { System.out.println("MultiImpl23 - speak"); }
    public void grabObject() { System.out.println("MultiImpl23 - grabObject"); }
    public void start() { System.out.println("MultiImpl23 - start"); }
    public void stop() { System.out.println("MultiImpl23 - stop"); }
    public void changeMode() { System.out.println("MultiImpl23 - changeMode"); }
    public void connect() { System.out.println("MultiImpl23 - connect"); }
    public void disconnect() { System.out.println("MultiImpl23 - disconnect"); }
    public void reset() { System.out.println("MultiImpl23 - reset"); }
    public void tap() { System.out.println("MultiImpl23 - tap"); }
    public void swipe() { System.out.println("MultiImpl23 - swipe"); }
    public void installApp() { System.out.println("MultiImpl23 - installApp"); }
    public void scanDocument() { System.out.println("MultiImpl23 - scanDocument"); }
    public void scanImage() { System.out.println("MultiImpl23 - scanImage"); }
    public void preview() { System.out.println("MultiImpl23 - preview"); }
}
