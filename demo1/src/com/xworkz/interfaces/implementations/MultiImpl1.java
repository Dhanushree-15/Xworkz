package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class MultiImpl1 implements ICar, IFan, IPhone, ILaptop, IChair {
    public void startEngine() { System.out.println("MultiImpl1 - startEngine"); }
    public void stopEngine() { System.out.println("MultiImpl1 - stopEngine"); }
    public void honk() { System.out.println("MultiImpl1 - honk"); }
    public void switchOn() { System.out.println("MultiImpl1 - switchOn"); }
    public void switchOff() { System.out.println("MultiImpl1 - switchOff"); }
    public void rotate() { System.out.println("MultiImpl1 - rotate"); }
    public void makeCall() { System.out.println("MultiImpl1 - makeCall"); }
    public void receiveCall() { System.out.println("MultiImpl1 - receiveCall"); }
    public void charge() { System.out.println("MultiImpl1 - charge"); }
    public void powerOn() { System.out.println("MultiImpl1 - powerOn"); }
    public void powerOff() { System.out.println("MultiImpl1 - powerOff"); }
    public void runProgram() { System.out.println("MultiImpl1 - runProgram"); }
    public void sit() { System.out.println("MultiImpl1 - sit"); }
    public void adjustHeight() { System.out.println("MultiImpl1 - adjustHeight"); }

}
