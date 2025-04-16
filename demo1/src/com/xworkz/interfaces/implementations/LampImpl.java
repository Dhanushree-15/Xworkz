package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.ILamp;

public class LampImpl implements ILamp {
    public void turnOn() { System.out.println("LampImpl - turnOn"); }
    public void dim() { System.out.println("LampImpl - dim"); }
    public void changeColor() { System.out.println("LampImpl - changeColor"); }
}
