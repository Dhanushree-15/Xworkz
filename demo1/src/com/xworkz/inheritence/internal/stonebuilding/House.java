package com.xworkz.inheritence.internal.stonebuilding;

public class House extends StoneBuilding {
    public House() {
        super();
        System.out.println("Running non-arg constructor House");
    }

    @Override
    public void shelter() {
        System.out.println("House provides comfortable shelter--child");
    }

    @Override
    public void structure() {
        System.out.println("House structure is designed for living--child");
    }

    @Override
    public void floors() {
        System.out.println("House can have one or more floors--child");
    }

    @Override
    public void foundation() {
        System.out.println("House foundation is strong and durable--child");
    }

    @Override
    public void rooms() {
        System.out.println("House has bedrooms, kitchen, and living areas--child");
    }

    public void garden() {
        System.out.println("House has a beautiful garden --child");
    }
}
