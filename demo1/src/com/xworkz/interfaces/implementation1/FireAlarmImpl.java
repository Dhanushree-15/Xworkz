package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IFireAlarm;

public class FireAlarmImpl implements IFireAlarm {
    public void detectSmoke() { System.out.println("FireAlarmImpl - detectSmoke"); }
    public void soundAlarm() { System.out.println("FireAlarmImpl - soundAlarm"); }
    public void reset() { System.out.println("FireAlarmImpl - reset"); }

    public void replaceBit() {
        System.out.println("To replace a worn drill bit.");
    }

}