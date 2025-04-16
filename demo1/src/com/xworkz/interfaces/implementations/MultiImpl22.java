package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class MultiImpl22 implements IDrone, IRobot, IVacuumCleaner, IRouter, ITablet {
    public void takeOff() { System.out.println("MultiImpl22 - takeOff"); }
    public void land() { System.out.println("MultiImpl22 - land"); }
    public void fly() { System.out.println("MultiImpl22 - fly"); }
    public void walk() { System.out.println("MultiImpl22 - walk"); }
    public void speak() { System.out.println("MultiImpl22 - speak"); }
    public void grabObject() { System.out.println("MultiImpl22 - grabObject"); }
    public void start() { System.out.println("MultiImpl22 - start"); }
    public void stop() { System.out.println("MultiImpl22 - stop"); }
    public void changeMode() { System.out.println("MultiImpl22 - changeMode"); }
    public void connect() { System.out.println("MultiImpl22 - connect"); }
    public void disconnect() { System.out.println("MultiImpl22 - disconnect"); }
    public void reset() { System.out.println("MultiImpl22 - reset"); }
    public void tap() { System.out.println("MultiImpl22 - tap"); }
    public void swipe() { System.out.println("MultiImpl22 - swipe"); }
    public void installApp() { System.out.println("MultiImpl22 - installApp"); }
}
