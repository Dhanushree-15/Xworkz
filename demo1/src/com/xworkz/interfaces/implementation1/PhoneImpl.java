package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IPhone;

public class PhoneImpl implements IPhone {
    public void makeCall() { System.out.println("PhoneImpl - makeCall"); }
    public void receiveCall() { System.out.println("PhoneImpl - receiveCall"); }
    public void charge() { System.out.println("PhoneImpl - charge"); }
}
