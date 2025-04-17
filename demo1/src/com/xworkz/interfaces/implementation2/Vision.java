package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IHeater;
import com.xworkz.interfaces.interfaces.IProjector;

public class Vision implements IHeater, IProjector {
    public void turnOn() { System.out.println("DualImpl20 - turnOn"); }
    public void turnOff() { System.out.println("DualImpl20 - turnOff"); }
    public void setTemperature() { System.out.println("DualImpl20 - setTemperature"); }
    public void projectImage() { System.out.println("DualImpl20 - projectImage"); }
    public void adjustFocus() { System.out.println("DualImpl20 - adjustFocus"); }
    public void shutDown() { System.out.println("DualImpl20 - shutDown"); }
}
