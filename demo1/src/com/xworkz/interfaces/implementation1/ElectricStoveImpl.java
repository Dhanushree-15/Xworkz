package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IElectricStove;

public class ElectricStoveImpl implements IElectricStove {
    public void turnOn() { System.out.println("ElectricStoveImpl - turnOn"); }
    public void adjustHeat() { System.out.println("ElectricStoveImpl - adjustHeat"); }
    public void turnOff() { System.out.println("ElectricStoveImpl - turnOff"); }

    public void positionHole() {
        System.out.println("To position the hole accurately.");
    }

}