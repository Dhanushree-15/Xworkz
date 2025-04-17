package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IHairDryer;

public class HairDryerImpl implements IHairDryer {
    public void turnOn() { System.out.println("HairDryerImpl - turnOn"); }
    public void adjustHeat() { System.out.println("HairDryerImpl - adjustHeat"); }
    public void coolShot() { System.out.println("HairDryerImpl - coolShot"); }
}
