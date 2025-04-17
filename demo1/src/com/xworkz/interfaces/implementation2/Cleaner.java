package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IRobot;
import com.xworkz.interfaces.interfaces.IVacuumCleaner;

public class Cleaner implements IRobot, IVacuumCleaner {
    public void walk() { System.out.println("DualImpl23 - walk"); }
    public void speak() { System.out.println("DualImpl23 - speak"); }
    public void grabObject() { System.out.println("DualImpl23 - grabObject"); }
    public void start() { System.out.println("DualImpl23 - start"); }
    public void stop() { System.out.println("DualImpl23 - stop"); }
    public void changeMode() { System.out.println("DualImpl23 - changeMode"); }
}
