package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IElectricKettle;

public class ElectricKettleImpl implements IElectricKettle {
    public void boilWater() { System.out.println("ElectricKettleImpl - boilWater"); }
    public void autoOff() { System.out.println("ElectricKettleImpl - autoOff"); }
    public void keepWarm() { System.out.println("ElectricKettleImpl - keepWarm"); }
}
