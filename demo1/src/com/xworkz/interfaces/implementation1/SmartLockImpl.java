package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;
public class SmartLockImpl implements ISmartLock {
    public void lock() { System.out.println("SmartLockImpl - lock"); }
    public void unlock() { System.out.println("SmartLockImpl - unlock"); }
    public void setPIN() { System.out.println("SmartLockImpl - setPIN"); }

    public void inspectWork() {
        System.out.println("To inspect the drilled hole.");
    }

}