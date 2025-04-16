package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class MultiImpl12 implements IMicrowave, IRefrigerator, IWashingMachine, IOven, IToaster {
    public void start() { System.out.println("MultiImpl12 - start"); }
    public void stop() { System.out.println("MultiImpl12 - stop"); }
    public void setTimer() { System.out.println("MultiImpl12 - setTimer"); }
    public void cool() { System.out.println("MultiImpl12 - cool"); }
    public void freeze() { System.out.println("MultiImpl12 - freeze"); }
    public void defrost() { System.out.println("MultiImpl12 - defrost"); }
    public void wash() { System.out.println("MultiImpl12 - wash"); }
    public void rinse() { System.out.println("MultiImpl12 - rinse"); }
    public void spin() { System.out.println("MultiImpl12 - spin"); }
    public void preheat() { System.out.println("MultiImpl12 - preheat"); }
    public void bake() { System.out.println("MultiImpl12 - bake"); }
    public void grill() { System.out.println("MultiImpl12 - grill"); }
    public void insertBread() { System.out.println("MultiImpl12 - insertBread"); }
    public void toast() { System.out.println("MultiImpl12 - toast"); }
    public void eject() { System.out.println("MultiImpl12 - eject"); }
}
