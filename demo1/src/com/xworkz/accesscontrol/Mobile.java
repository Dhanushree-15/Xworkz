package com.xworkz.accesscontrol;

public class Mobile {
    private void checkBattery() {
        System.out.println("Battery is 80%");
    }
    public void start() {
        checkBattery();
        System.out.println("Mobile is starting");
    }
}
