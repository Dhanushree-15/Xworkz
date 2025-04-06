package com.xworkz.inheritence.internal.switchboard;

public class SwitchBoard {
    public SwitchBoard() {
        System.out.println("ElectronicDevice created --parent");
    }

    public void powerOn() {
        System.out.println("SwitchBoard powering on --parent");
    }

    public void powerOff() {
        System.out.println("SwitchBoard shutting down --parent");
    }

    public void battery() {
        System.out.println("SwitchBoard battery status --parent");
    }

    public void charge() {
        System.out.println("Charging SwitchBoard --parent");
    }

    public void connect() {
        System.out.println("Connecting to network --parent");
    }
}
