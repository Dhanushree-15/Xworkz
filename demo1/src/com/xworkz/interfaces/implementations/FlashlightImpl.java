package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IFlashlight;

public class FlashlightImpl implements IFlashlight {
    public void turnOn() { System.out.println("FlashlightImpl - turnOn"); }
    public void adjustBeam() { System.out.println("FlashlightImpl - adjustBeam"); }
    public void blink() { System.out.println("FlashlightImpl - blink"); }
}
