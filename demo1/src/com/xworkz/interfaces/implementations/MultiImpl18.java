package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class MultiImpl18 implements IWatch, IBlender, IHeater, IProjector, IDrone {
    public void showTime() { System.out.println("MultiImpl18 - showTime"); }
    public void startTimer() { System.out.println("MultiImpl18 - startTimer"); }
    public void stopTimer() { System.out.println("MultiImpl18 - stopTimer"); }
    public void blend() { System.out.println("MultiImpl18 - blend"); }
    public void pulse() { System.out.println("MultiImpl18 - pulse"); }
    public void clean() { System.out.println("MultiImpl18 - clean"); }
    public void turnOn() { System.out.println("MultiImpl18 - turnOn"); }
    public void turnOff() { System.out.println("MultiImpl18 - turnOff"); }
    public void setTemperature() { System.out.println("MultiImpl18 - setTemperature"); }
    public void projectImage() { System.out.println("MultiImpl18 - projectImage"); }
    public void adjustFocus() { System.out.println("MultiImpl18 - adjustFocus"); }
    public void shutDown() { System.out.println("MultiImpl18 - shutDown"); }
    public void takeOff() { System.out.println("MultiImpl18 - takeOff"); }
    public void land() { System.out.println("MultiImpl18 - land"); }
    public void fly() { System.out.println("MultiImpl18 - fly"); }
}
