package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;
public class SmartLockImpl implements ISmartLock {
    public void lock() { System.out.println("SmartLockImpl - lock"); }
    public void unlock() { System.out.println("SmartLockImpl - unlock"); }
    public void setPIN() { System.out.println("SmartLockImpl - setPIN"); }
}
