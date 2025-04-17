package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IChair;
import com.xworkz.interfaces.interfaces.ITelevision;

public class WashingMachine implements IChair, ITelevision {
    public void sit() { System.out.println("DualImpl5 - sit"); }
    public void adjustHeight() { System.out.println("DualImpl5 - adjustHeight"); }
    public void rotate() { System.out.println("DualImpl5 - rotate"); }
    public void powerOn() { System.out.println("DualImpl5 - powerOn"); }
    public void powerOff() { System.out.println("DualImpl5 - powerOff"); }
    public void changeChannel() { System.out.println("DualImpl5 - changeChannel"); }
}
