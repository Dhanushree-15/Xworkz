package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class SmartPlugImpl implements ISmartPlug {
    public void turnOn() { System.out.println("SmartPlugImpl - turnOn"); }
    public void turnOff() { System.out.println("SmartPlugImpl - turnOff"); }
    public void schedule() { System.out.println("SmartPlugImpl - schedule"); }

    public void lockChuck() {
        System.out.println("To lock the chuck properly.");
    }

}