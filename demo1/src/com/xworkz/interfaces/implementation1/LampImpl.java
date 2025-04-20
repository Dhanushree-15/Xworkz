package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.ILamp;

public class LampImpl implements ILamp {
    public void turnOn() { System.out.println("LampImpl - turnOn"); }
    public void dim() { System.out.println("LampImpl - dim"); }
    public void changeColor() { System.out.println("LampImpl - changeColor"); }

    public void wearGloves() {
        System.out.println("To wear gloves for safety.");
    }

}