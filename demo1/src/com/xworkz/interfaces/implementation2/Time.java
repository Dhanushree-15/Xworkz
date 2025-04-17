package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IClock;
import com.xworkz.interfaces.interfaces.IWatch;

public class Time implements IClock, IWatch {
    public void showTime() { System.out.println("DualImpl17 - showTime"); }
    public void setAlarm() { System.out.println("DualImpl17 - setAlarm"); }
    public void stopAlarm() { System.out.println("DualImpl17 - stopAlarm"); }

    public void startTimer() { System.out.println("DualImpl17 - startTimer"); }
    public void stopTimer() { System.out.println("DualImpl17 - stopTimer"); }
}
