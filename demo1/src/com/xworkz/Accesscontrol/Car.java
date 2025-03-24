package com.xworkz.Accesscontrol;

public class Car {
    private void startEngine() {
        System.out.println("Engine Started");
    }
    public void drive() {
        startEngine();
        System.out.println("Car is moving");
    }
}
