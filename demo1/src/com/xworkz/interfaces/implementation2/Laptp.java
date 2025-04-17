package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IChair;
import com.xworkz.interfaces.interfaces.ILaptop;

public class Laptp implements ILaptop, IChair {
    public void powerOn() { System.out.println("DualImpl4 - powerOn"); }
    public void powerOff() { System.out.println("DualImpl4 - powerOff"); }
    public void runProgram() { System.out.println("DualImpl4 - runProgram"); }
    public void sit() { System.out.println("DualImpl4 - sit"); }
    public void adjustHeight() { System.out.println("DualImpl4 - adjustHeight"); }
    public void rotate() { System.out.println("DualImpl4 - rotate"); }
}
