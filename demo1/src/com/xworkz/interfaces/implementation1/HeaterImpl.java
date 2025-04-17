package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IHeater;

public class HeaterImpl implements IHeater {
    public void turnOn() { System.out.println("HeaterImpl - turnOn"); }
    public void turnOff() { System.out.println("HeaterImpl - turnOff"); }
    public void setTemperature() { System.out.println("HeaterImpl - setTemperature"); }
}
