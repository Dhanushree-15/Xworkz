package com.xworkz.Accesscontrol;

public class Machine {
    private void powerOn() {
        System.out.println("Machine is powered on");
    }
    public void operate() {
        powerOn();
        System.out.println("Machine is operating");
    }
}
