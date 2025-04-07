package com.xworkz.inheritence.internal.color;

public class Purple extends Color {
    public Purple() {
        super();
        System.out.println("Running non-arg constructor Purple--child");
    }

    @Override
    public void display() {
        System.out.println("Purple is a strong color--child");
    }

    @Override
    public void mix() {
        System.out.println("Purple mixes with yellow to make orange--child");
    }

    @Override
    public void brighten() {
        System.out.println("Purple appears brighter with more intensity--child");
    }

    @Override
    public void fade() {
        System.out.println("Purple fades in sunlight--child");
    }
}
