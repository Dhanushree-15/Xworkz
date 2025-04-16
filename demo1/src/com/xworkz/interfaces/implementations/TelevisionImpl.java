package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class TelevisionImpl implements ITelevision {
    public void powerOn() { System.out.println("TelevisionImpl - powerOn"); }
    public void powerOff() { System.out.println("TelevisionImpl - powerOff"); }
    public void changeChannel() { System.out.println("TelevisionImpl - changeChannel"); }
}
