package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IOven;
import com.xworkz.interfaces.interfaces.IWashingMachine;

public class LightHouse implements IWashingMachine, IOven {
    public void wash() { System.out.println("DualImpl14 - wash"); }
    public void rinse() { System.out.println("DualImpl14 - rinse"); }
    public void spin() { System.out.println("DualImpl14 - spin"); }
    public void preheat() { System.out.println("DualImpl14 - preheat"); }
    public void bake() { System.out.println("DualImpl14 - bake"); }
    public void grill() { System.out.println("DualImpl14 - grill"); }
}
