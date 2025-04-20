package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IFlashlight;

public class FlashlightImpl implements IFlashlight {
    public void turnOn() { System.out.println("FlashlightImpl - turnOn"); }
    public void adjustBeam() { System.out.println("FlashlightImpl - adjustBeam"); }
    public void blink() { System.out.println("FlashlightImpl - blink"); }

    public void sandEdge() {
        System.out.println("To sand the edge smooth.");
    }

}