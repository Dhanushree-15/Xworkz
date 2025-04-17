package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IDrone;
import com.xworkz.interfaces.interfaces.IProjector;

public class Focus implements IProjector, IDrone {
    public void projectImage() { System.out.println("DualImpl21 - projectImage"); }
    public void adjustFocus() { System.out.println("DualImpl21 - adjustFocus"); }
    public void shutDown() { System.out.println("DualImpl21 - shutDown"); }
    public void takeOff() { System.out.println("DualImpl21 - takeOff"); }
    public void land() { System.out.println("DualImpl21 - land"); }
    public void fly() { System.out.println("DualImpl21 - fly"); }
}
