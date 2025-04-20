package com.xworkz.interfaces.interfaces;

public interface IClock {
    void showTime();
    void setAlarm();
    void stopAlarm();

    default void attachPanel() {
        System.out.println("To attach a wooden panel.");
    }

}