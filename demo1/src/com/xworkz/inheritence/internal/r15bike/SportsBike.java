package com.xworkz.inheritence.internal.r15bike;

public class SportsBike extends R15Bike {
    public SportsBike() {
        super();
        System.out.println("Running non-arg constructor SportsBike");
    }
    @Override
    public void transport() {
        System.out.println("SportsBike is used for high-speed rides--child");
    }
    @Override
    public void wheels() {
        System.out.println("SportsBike has wider tires for better grip--child");
    }
    @Override
    public void fuel() {
        System.out.println("SportsBike consumes high-performance fuel--child");
    }
    @Override
    public void safety() {
        System.out.println("SportsBike requires advanced safety gear--child");
    }
    @Override
    public void model() {
        System.out.println("SportsBike models include racing and touring types--child");
    }
    public void raceMode() {
        System.out.println("SportsBike is set to Race Mode --child");
    }

}
