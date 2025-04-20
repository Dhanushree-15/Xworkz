package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.ICeilingFan;

public class CeilingFanImpl implements ICeilingFan {
    public void setSpeed() { System.out.println("CeilingFanImpl - setSpeed"); }
    public void reverseDirection() { System.out.println("CeilingFanImpl - reverseDirection"); }
    public void stop() { System.out.println("CeilingFanImpl - stop"); }

    public void tapAnchor() {
        System.out.println("To tap wall anchors into place.");
    }

}