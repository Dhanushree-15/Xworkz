package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IClock;

public class ClockImpl implements IClock {
    public void showTime() { System.out.println("ClockImpl - showTime"); }
    public void setAlarm() { System.out.println("ClockImpl - setAlarm"); }
    public void stopAlarm() { System.out.println("ClockImpl - stopAlarm"); }
}
