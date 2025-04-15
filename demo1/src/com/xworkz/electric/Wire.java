package com.xworkz.electric;

public class Wire {
    String material;
    int length;

    Wire(String material, int length) {
        this.material = material;
        this.length = length;
    }

    void showWireDetails() {
        System.out.println("Wire Material: " + material + ", Length: " + length + " meters");
    }
}
