package com.xworkz.inheritence.internal.Auto;

public class AutoRun {
    public static void main(String[] args) {
        Auto auto=new Auto();
        auto.color();
        auto.fuel();
        auto.capacity();
        auto.meter();
        auto.wheels();
        System.out.println("-------------");
        Auto auto1=new AutoDetails();
        auto1.wheels();
        auto1.meter();
        auto1.capacity();
        auto1.fuel();
        auto1.color();
    }
}
