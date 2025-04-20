package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class WatchImpl implements IWatch {
    public void showTime() { System.out.println("WatchImpl - showTime"); }
    public void startTimer() { System.out.println("WatchImpl - startTimer"); }
    public void stopTimer() { System.out.println("WatchImpl - stopTimer"); }

    public void turnOff() {
        System.out.println("To turn off after use.");
    }

}