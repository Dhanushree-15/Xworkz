package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IElectricStove;

public class ElectricStoveImpl implements IElectricStove {
    public void turnOn() { System.out.println("ElectricStoveImpl - turnOn"); }
    public void adjustHeat() { System.out.println("ElectricStoveImpl - adjustHeat"); }
    public void turnOff() { System.out.println("ElectricStoveImpl - turnOff"); }
}
