package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class SmartBulbImpl implements ISmartBulb {
    public void changeColor() { System.out.println("SmartBulbImpl - changeColor"); }
    public void dimLight() { System.out.println("SmartBulbImpl - dimLight"); }
    public void turnOff() { System.out.println("SmartBulbImpl - turnOff"); }
}
