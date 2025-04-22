package com.xworkz.Abstrc.Internal;

public class SmartLockImpl implements SmartLock {
    @Override
    public void lockDoor() {
        System.out.println("lockDoor is executed in SmartLockImpl");
    }
}
