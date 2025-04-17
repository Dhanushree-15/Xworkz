package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Xiaomi implements IBlender, IHeater, IProjector, IDrone, IRobot {
    public void blend() { System.out.println("MultiImpl19 - blend"); }
    public void pulse() { System.out.println("MultiImpl19 - pulse"); }
    public void clean() { System.out.println("MultiImpl19 - clean"); }
    public void turnOn() { System.out.println("MultiImpl19 - turnOn"); }
    public void turnOff() { System.out.println("MultiImpl19 - turnOff"); }
    public void setTemperature() { System.out.println("MultiImpl19 - setTemperature"); }
    public void projectImage() { System.out.println("MultiImpl19 - projectImage"); }
    public void adjustFocus() { System.out.println("MultiImpl19 - adjustFocus"); }
    public void shutDown() { System.out.println("MultiImpl19 - shutDown"); }
    public void takeOff() { System.out.println("MultiImpl19 - takeOff"); }
    public void land() { System.out.println("MultiImpl19 - land"); }
    public void fly() { System.out.println("MultiImpl19 - fly"); }
    public void walk() { System.out.println("MultiImpl19 - walk"); }
    public void speak() { System.out.println("MultiImpl19 - speak"); }
    public void grabObject() { System.out.println("MultiImpl19 - grabObject"); }
}
