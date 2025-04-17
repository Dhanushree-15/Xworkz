package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IRefrigerator;
import com.xworkz.interfaces.interfaces.IWashingMachine;

public class Refrige implements IRefrigerator, IWashingMachine {
    public void cool() { System.out.println("DualImpl13 - cool"); }
    public void freeze() { System.out.println("DualImpl13 - freeze"); }
    public void defrost() { System.out.println("DualImpl13 - defrost"); }
    public void wash() { System.out.println("DualImpl13 - wash"); }
    public void rinse() { System.out.println("DualImpl13 - rinse"); }
    public void spin() { System.out.println("DualImpl13 - spin"); }
}
