package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IBattery;

public class BatteryImpl implements IBattery {
    public void charge() { System.out.println("BatteryImpl - charge"); }
    public void discharge() { System.out.println("BatteryImpl - discharge"); }
    public void checkLevel() { System.out.println("BatteryImpl - checkLevel"); }
}
