package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IDrone;
import com.xworkz.interfaces.interfaces.IRobot;

public class DualImpl22 implements IDrone, IRobot {
    public void takeOff() { System.out.println("DualImpl22 - takeOff"); }
    public void land() { System.out.println("DualImpl22 - land"); }
    public void fly() { System.out.println("DualImpl22 - fly"); }
    public void walk() { System.out.println("DualImpl22 - walk"); }
    public void speak() { System.out.println("DualImpl22 - speak"); }
    public void grabObject() { System.out.println("DualImpl22 - grabObject"); }
}
