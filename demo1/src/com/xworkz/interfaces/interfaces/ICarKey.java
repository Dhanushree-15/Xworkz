package com.xworkz.interfaces.interfaces;

public interface ICarKey {
    void lock();
    void unlock();
    void panicAlarm();

    default void secureBolt() {
        System.out.println("To secure a bolt tightly.");
    }

}