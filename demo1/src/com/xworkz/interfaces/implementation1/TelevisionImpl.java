package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class TelevisionImpl implements ITelevision {
    public void powerOn() { System.out.println("TelevisionImpl - powerOn"); }
    public void powerOff() { System.out.println("TelevisionImpl - powerOff"); }
    public void changeChannel() { System.out.println("TelevisionImpl - changeChannel"); }

    public void reviewPlan() {
        System.out.println("To review drilling plan.");
    }

}