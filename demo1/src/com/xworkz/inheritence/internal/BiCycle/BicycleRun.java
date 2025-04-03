package com.xworkz.inheritence.internal.BiCycle;

public class BicycleRun {
    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle();
        bicycle.type();
        bicycle.material();
        bicycle.gearNo();
        bicycle.brakeType();
        bicycle.color();
        System.out.println("----------");
        Bicycle bicycle1=new BicycleDetails();
        bicycle1.type();
        bicycle1.material();
        bicycle1.brakeType();
        bicycle1.gearNo();
        bicycle1.color();
    }
}
