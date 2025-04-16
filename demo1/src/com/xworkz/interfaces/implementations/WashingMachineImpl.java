package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class WashingMachineImpl implements IWashingMachine {
    public void wash() { System.out.println("WashingMachineImpl - wash"); }
    public void rinse() { System.out.println("WashingMachineImpl - rinse"); }
    public void spin() { System.out.println("WashingMachineImpl - spin"); }
}
