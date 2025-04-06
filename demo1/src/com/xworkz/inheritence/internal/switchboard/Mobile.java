package com.xworkz.inheritence.internal.switchboard;

public class Mobile extends SwitchBoard {
    public Mobile() {
        super();
        System.out.println("Mobile created --child");
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile booting up --child");
    }

    @Override
    public void powerOff() {
        System.out.println("Mobile shutting down --child");
    }

    @Override
    public void battery() {
        System.out.println("Checking mobile battery --child");
    }

    @Override
    public void charge() {
        System.out.println("Charging mobile --child");
    }

    @Override
    public void connect() {
        System.out.println("Connecting mobile to network --child");
    }
}
