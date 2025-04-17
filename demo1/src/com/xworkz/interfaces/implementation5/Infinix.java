package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Infinix implements IProjector, IDrone, IRobot, IVacuumCleaner, IRouter {
    public void projectImage() { System.out.println("MultiImpl21 - projectImage"); }
    public void adjustFocus() { System.out.println("MultiImpl21 - adjustFocus"); }
    public void shutDown() { System.out.println("MultiImpl21 - shutDown"); }
    public void takeOff() { System.out.println("MultiImpl21 - takeOff"); }
    public void land() { System.out.println("MultiImpl21 - land"); }
    public void fly() { System.out.println("MultiImpl21 - fly"); }
    public void walk() { System.out.println("MultiImpl21 - walk"); }
    public void speak() { System.out.println("MultiImpl21 - speak"); }
    public void grabObject() { System.out.println("MultiImpl21 - grabObject"); }
    public void start() { System.out.println("MultiImpl21 - start"); }
    public void stop() { System.out.println("MultiImpl21 - stop"); }
    public void changeMode() { System.out.println("MultiImpl21 - changeMode"); }
    public void connect() { System.out.println("MultiImpl21 - connect"); }
    public void disconnect() { System.out.println("MultiImpl21 - disconnect"); }
    public void reset() { System.out.println("MultiImpl21 - reset"); }
}
