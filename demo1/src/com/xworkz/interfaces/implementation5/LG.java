package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class LG implements IRefrigerator, IWashingMachine, IOven, IToaster, IClock {
    public void cool() { System.out.println("MultiImpl13 - cool"); }
    public void freeze() { System.out.println("MultiImpl13 - freeze"); }
    public void defrost() { System.out.println("MultiImpl13 - defrost"); }
    public void wash() { System.out.println("MultiImpl13 - wash"); }
    public void rinse() { System.out.println("MultiImpl13 - rinse"); }
    public void spin() { System.out.println("MultiImpl13 - spin"); }
    public void preheat() { System.out.println("MultiImpl13 - preheat"); }
    public void bake() { System.out.println("MultiImpl13 - bake"); }
    public void grill() { System.out.println("MultiImpl13 - grill"); }
    public void insertBread() { System.out.println("MultiImpl13 - insertBread"); }
    public void toast() { System.out.println("MultiImpl13 - toast"); }
    public void eject() { System.out.println("MultiImpl13 - eject"); }
    public void showTime() { System.out.println("MultiImpl13 - showTime"); }
    public void setAlarm() { System.out.println("MultiImpl13 - setAlarm"); }
    public void stopAlarm() { System.out.println("MultiImpl13 - stopAlarm"); }
}
