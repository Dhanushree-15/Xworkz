package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Tele implements IFan, IPhone, ILaptop, IChair, ITelevision {
    public void switchOn() { System.out.println("MultiImpl2 - switchOn"); }
    public void switchOff() { System.out.println("MultiImpl2 - switchOff"); }
    public void rotate() { System.out.println("MultiImpl2 - rotate"); }
    public void makeCall() { System.out.println("MultiImpl2 - makeCall"); }
    public void receiveCall() { System.out.println("MultiImpl2 - receiveCall"); }
    public void charge() { System.out.println("MultiImpl2 - charge"); }
    public void powerOn() { System.out.println("MultiImpl2 - powerOn"); }
    public void powerOff() { System.out.println("MultiImpl2 - powerOff"); }
    public void runProgram() { System.out.println("MultiImpl2 - runProgram"); }
    public void sit() { System.out.println("MultiImpl2 - sit"); }
    public void adjustHeight() { System.out.println("MultiImpl2 - adjustHeight"); }
    public void rotate1() { System.out.println("MultiImpl2 - rotate"); }
    public void powerOn1() { System.out.println("MultiImpl2 - powerOn"); }
    public void powerOff1() { System.out.println("MultiImpl2 - powerOff"); }
    public void changeChannel() { System.out.println("MultiImpl2 - changeChannel"); }
}
