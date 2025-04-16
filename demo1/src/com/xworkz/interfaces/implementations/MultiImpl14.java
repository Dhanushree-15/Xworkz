package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;


public class MultiImpl14 implements IWashingMachine, IOven, IToaster, IClock, IWatch {
    public void wash() { System.out.println("MultiImpl14 - wash"); }
    public void rinse() { System.out.println("MultiImpl14 - rinse"); }
    public void spin() { System.out.println("MultiImpl14 - spin"); }
    public void preheat() { System.out.println("MultiImpl14 - preheat"); }
    public void bake() { System.out.println("MultiImpl14 - bake"); }
    public void grill() { System.out.println("MultiImpl14 - grill"); }
    public void insertBread() { System.out.println("MultiImpl14 - insertBread"); }
    public void toast() { System.out.println("MultiImpl14 - toast"); }
    public void eject() { System.out.println("MultiImpl14 - eject"); }
    public void showTime1() { System.out.println("MultiImpl14 - showTime1"); }
    public void setAlarm() { System.out.println("MultiImpl14 - setAlarm"); }
    public void stopAlarm() { System.out.println("MultiImpl14 - stopAlarm"); }
    public void showTime() { System.out.println("MultiImpl14 - showTime"); }
    public void startTimer() { System.out.println("MultiImpl14 - startTimer"); }
    public void stopTimer() { System.out.println("MultiImpl14 - stopTimer"); }
}
