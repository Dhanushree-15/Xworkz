package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Philips implements IToaster, IClock, IWatch, IBlender, IHeater {
    public void insertBread() { System.out.println("MultiImpl16 - insertBread"); }
    public void toast() { System.out.println("MultiImpl16 - toast"); }
    public void eject() { System.out.println("MultiImpl16 - eject"); }
    public void showTime() { System.out.println("MultiImpl16 - showTime"); }
    public void setAlarm() { System.out.println("MultiImpl16 - setAlarm"); }
    public void stopAlarm() { System.out.println("MultiImpl16 - stopAlarm"); }
    public void showTime1() { System.out.println("MultiImpl16 - showTime1"); }
    public void startTimer() { System.out.println("MultiImpl16 - startTimer"); }
    public void stopTimer() { System.out.println("MultiImpl16 - stopTimer"); }
    public void blend() { System.out.println("MultiImpl16 - blend"); }
    public void pulse() { System.out.println("MultiImpl16 - pulse"); }
    public void clean() { System.out.println("MultiImpl16 - clean"); }
    public void turnOn() { System.out.println("MultiImpl16 - turnOn"); }
    public void turnOff() { System.out.println("MultiImpl16 - turnOff"); }
    public void setTemperature() { System.out.println("MultiImpl16 - setTemperature"); }
}
