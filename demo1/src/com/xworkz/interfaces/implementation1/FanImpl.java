package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IFan;

public class FanImpl implements IFan {
    public void switchOn() { System.out.println("FanImpl - switchOn"); }
    public void switchOff() { System.out.println("FanImpl - switchOff"); }
    public void rotate() { System.out.println("FanImpl - rotate"); }

    public void holdDrillFirm() {
        System.out.println("To hold the driller firmly.");
    }

}