package com.xworkz.inheritence.internal.homeappliance;

public class Telivision extends HomeAppliance {
    public Telivision() {
        super();
        System.out.println("Running non-arg constructor WashingMachine");
    }
    @Override
    public void powerOn() {
        System.out.println("Telivision is powered on--child");
    }
    @Override
    public void powerOff() {
        System.out.println("Telivision is powered off--child");
    }
    @Override
    public void consumeElectricity() {
        System.out.println("Telivision consumes electricity--child");
    }
    @Override
    public void function() {
        System.out.println("Telivision washes clothes--child");
    }
    @Override
    public void brand() {
        System.out.println("Telivision has a specific brand--child");
    }
}
