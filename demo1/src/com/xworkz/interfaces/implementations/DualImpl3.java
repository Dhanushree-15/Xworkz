package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.ILaptop;
import com.xworkz.interfaces.interfaces.IPhone;

public class DualImpl3 implements IPhone, ILaptop {
    public void makeCall() { System.out.println("DualImpl3 - makeCall"); }
    public void receiveCall() { System.out.println("DualImpl3 - receiveCall"); }
    public void charge() { System.out.println("DualImpl3 - charge"); }
    public void powerOn() { System.out.println("DualImpl3 - powerOn"); }
    public void powerOff() { System.out.println("DualImpl3 - powerOff"); }
    public void runProgram() { System.out.println("DualImpl3 - runProgram"); }
}
