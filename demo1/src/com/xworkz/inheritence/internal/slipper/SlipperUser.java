package com.xworkz.inheritence.internal.slipper;

public class SlipperUser {
    public void use(Slipper slipper) {
        slipper.wear();
        slipper.walk();
        slipper.grip();
        slipper.comfort();
        slipper.relax();

        if (slipper instanceof FlipFlop) {
            System.out.println("slipper is instance of FlipFlop");
            FlipFlop flip = (FlipFlop) slipper;
            flip.beachWear();
        }
    }
}
