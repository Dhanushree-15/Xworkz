package com.xworkz.Electric;

public class Button {
    String shape;
    String function;

    Button(String shape, String function) {
        this.shape = shape;
        this.function = function;
    }

    void showButtonDetails() {
        System.out.println("Button Shape: " + shape + ", Function: " + function);
    }
}
