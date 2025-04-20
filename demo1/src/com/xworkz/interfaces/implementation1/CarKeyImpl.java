package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.ICarKey;

public class CarKeyImpl implements ICarKey {
    public void lock() { System.out.println("CarKeyImpl - lock"); }
    public void unlock() { System.out.println("CarKeyImpl - unlock"); }
    public void panicAlarm() { System.out.println("CarKeyImpl - panicAlarm"); }

    public void secureBolt() {
        System.out.println("To secure a bolt tightly.");
    }

}