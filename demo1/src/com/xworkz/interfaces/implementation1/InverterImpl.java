package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IInverter;

public class InverterImpl implements IInverter {
    public void supplyPower() { System.out.println("InverterImpl - supplyPower"); }
    public void chargeBattery() { System.out.println("InverterImpl - chargeBattery"); }
    public void switchMode() { System.out.println("InverterImpl - switchMode"); }
}
