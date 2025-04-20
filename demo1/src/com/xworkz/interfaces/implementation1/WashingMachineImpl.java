package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class WashingMachineImpl implements IWashingMachine {
    public void wash() { System.out.println("WashingMachineImpl - wash"); }
    public void rinse() { System.out.println("WashingMachineImpl - rinse"); }
    public void spin() { System.out.println("WashingMachineImpl - spin"); }

    public void resetBit() {
        System.out.println("To reset the drill bit.");
    }

}