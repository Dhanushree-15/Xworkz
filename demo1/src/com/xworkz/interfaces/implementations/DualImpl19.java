package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IBlender;
import com.xworkz.interfaces.interfaces.IHeater;

public class DualImpl19 implements IBlender, IHeater {
    public void blend() { System.out.println("DualImpl19 - blend"); }
    public void pulse() { System.out.println("DualImpl19 - pulse"); }
    public void clean() { System.out.println("DualImpl19 - clean"); }
    public void turnOn() { System.out.println("DualImpl19 - turnOn"); }
    public void turnOff() { System.out.println("DualImpl19 - turnOff"); }
    public void setTemperature() { System.out.println("DualImpl19 - setTemperature"); }
}
