package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.ILaptop;

public class LaptopImpl implements ILaptop {
    public void powerOn() { System.out.println("LaptopImpl - powerOn"); }
    public void powerOff() { System.out.println("LaptopImpl - powerOff"); }
    public void runProgram() { System.out.println("LaptopImpl - runProgram"); }

    public void insertBit() {
        System.out.println("To insert the drill bit.");
    }

}