package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class MultiImpl15 implements IOven, IToaster, IClock, IWatch, IBlender {
    public void preheat() { System.out.println("MultiImpl15 - preheat"); }
    public void bake() { System.out.println("MultiImpl15 - bake"); }
    public void grill() { System.out.println("MultiImpl15 - grill"); }
    public void insertBread() { System.out.println("MultiImpl15 - insertBread"); }
    public void toast() { System.out.println("MultiImpl15 - toast"); }
    public void eject() { System.out.println("MultiImpl15 - eject"); }
    public void showTime() { System.out.println("MultiImpl15 - showTime"); }
    public void setAlarm() { System.out.println("MultiImpl15 - setAlarm"); }
    public void stopAlarm() { System.out.println("MultiImpl15 - stopAlarm"); }
    public void showTime1() { System.out.println("MultiImpl15 - showTime1"); }
    public void startTimer() { System.out.println("MultiImpl15 - startTimer"); }
    public void stopTimer() { System.out.println("MultiImpl15 - stopTimer"); }
    public void blend() { System.out.println("MultiImpl15 - blend"); }
    public void pulse() { System.out.println("MultiImpl15 - pulse"); }
    public void clean() { System.out.println("MultiImpl15 - clean"); }
}
