package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.ILight;

public class LightImpl implements ILight {
    public void switchOn() { System.out.println("LightImpl - switchOn"); }
    public void switchOff() { System.out.println("LightImpl - switchOff"); }
    public void dim() { System.out.println("LightImpl - dim"); }
}
