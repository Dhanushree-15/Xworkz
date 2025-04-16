package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class SmartFridgeImpl implements ISmartFridge {
    public void trackItems() { System.out.println("SmartFridgeImpl - trackItems"); }
    public void cool() { System.out.println("SmartFridgeImpl - cool"); }
    public void notify1() { System.out.println("SmartFridgeImpl - notify1"); }
}
