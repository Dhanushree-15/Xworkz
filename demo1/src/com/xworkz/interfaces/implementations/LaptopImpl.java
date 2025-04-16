package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.ILaptop;

public class LaptopImpl implements ILaptop {
    public void powerOn() { System.out.println("LaptopImpl - powerOn"); }
    public void powerOff() { System.out.println("LaptopImpl - powerOff"); }
    public void runProgram() { System.out.println("LaptopImpl - runProgram"); }
}
