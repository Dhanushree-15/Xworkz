package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Hisense implements IClock, IWatch, IBlender, IHeater, IProjector {
    public void showTime() { System.out.println("MultiImpl17 - showTime"); }
    public void setAlarm() { System.out.println("MultiImpl17 - setAlarm"); }
    public void stopAlarm() { System.out.println("MultiImpl17 - stopAlarm"); }
    public void showTime2() { System.out.println("MultiImpl17 - showTime2"); }
    public void startTimer() { System.out.println("MultiImpl17 - startTimer"); }
    public void stopTimer() { System.out.println("MultiImpl17 - stopTimer"); }
    public void blend() { System.out.println("MultiImpl17 - blend"); }
    public void pulse() { System.out.println("MultiImpl17 - pulse"); }
    public void clean() { System.out.println("MultiImpl17 - clean"); }
    public void turnOn() { System.out.println("MultiImpl17 - turnOn"); }
    public void turnOff() { System.out.println("MultiImpl17 - turnOff"); }
    public void setTemperature() { System.out.println("MultiImpl17 - setTemperature"); }
    public void projectImage() { System.out.println("MultiImpl17 - projectImage"); }
    public void adjustFocus() { System.out.println("MultiImpl17 - adjustFocus"); }
    public void shutDown() { System.out.println("MultiImpl17 - shutDown"); }
}
