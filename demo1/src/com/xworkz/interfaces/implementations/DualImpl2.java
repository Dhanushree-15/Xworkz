package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IFan;
import com.xworkz.interfaces.interfaces.IPhone;

public class DualImpl2 implements IFan, IPhone {
    public void switchOn() { System.out.println("DualImpl2 - switchOn"); }
    public void switchOff() { System.out.println("DualImpl2 - switchOff"); }
    public void rotate() { System.out.println("DualImpl2 - rotate"); }
    public void makeCall() { System.out.println("DualImpl2 - makeCall"); }
    public void receiveCall() { System.out.println("DualImpl2 - receiveCall"); }
    public void charge() { System.out.println("DualImpl2 - charge"); }
}
