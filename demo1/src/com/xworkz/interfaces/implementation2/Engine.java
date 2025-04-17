package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.ICar;
import com.xworkz.interfaces.interfaces.IFan;

public class Engine implements ICar, IFan {
    public void startEngine() { System.out.println("DualImpl1 - startEngine"); }
    public void stopEngine() { System.out.println("DualImpl1 - stopEngine"); }
    public void honk() { System.out.println("DualImpl1 - honk"); }
    public void switchOn() { System.out.println("DualImpl1 - switchOn"); }
    public void switchOff() { System.out.println("DualImpl1 - switchOff"); }
    public void rotate() { System.out.println("DualImpl1 - rotate"); }
}
