package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class OnePlus implements IHeater, IProjector, IDrone, IRobot, IVacuumCleaner {
    public void turnOn() { System.out.println("MultiImpl20 - turnOn"); }
    public void turnOff() { System.out.println("MultiImpl20 - turnOff"); }
    public void setTemperature() { System.out.println("MultiImpl20 - setTemperature"); }
    public void projectImage() { System.out.println("MultiImpl20 - projectImage"); }
    public void adjustFocus() { System.out.println("MultiImpl20 - adjustFocus"); }
    public void shutDown() { System.out.println("MultiImpl20 - shutDown"); }
    public void takeOff() { System.out.println("MultiImpl20 - takeOff"); }
    public void land() { System.out.println("MultiImpl20 - land"); }
    public void fly() { System.out.println("MultiImpl20 - fly"); }
    public void walk() { System.out.println("MultiImpl20 - walk"); }
    public void speak() { System.out.println("MultiImpl20 - speak"); }
    public void grabObject() { System.out.println("MultiImpl20 - grabObject"); }
    public void start() { System.out.println("MultiImpl20 - start"); }
    public void stop() { System.out.println("MultiImpl20 - stop"); }
    public void changeMode() { System.out.println("MultiImpl20 - changeMode"); }
}
