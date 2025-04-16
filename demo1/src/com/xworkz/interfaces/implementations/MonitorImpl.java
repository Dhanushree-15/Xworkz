package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IMonitor;

public class MonitorImpl implements IMonitor {
    public void displayImage() { System.out.println("MonitorImpl - displayImage"); }
    public void adjustBrightness() { System.out.println("MonitorImpl - adjustBrightness"); }
    public void turnOff() { System.out.println("MonitorImpl - turnOff"); }
}
