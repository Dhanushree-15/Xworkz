package com.xworkz.interfaces.interfaces;

public interface ISmartLock {
    void lock();
    void unlock();
    void setPIN();

    default void inspectWork() {
        System.out.println("To lubricate the bit.");
    }

}