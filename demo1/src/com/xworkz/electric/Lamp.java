package com.xworkz.electric;

public class Lamp {
    int wattage;
    String brand;

    Lamp(int wattage, String brand) {
        this.wattage = wattage;
        this.brand = brand;
    }

    void showLampDetails() {
        System.out.println("Lamp Wattage: " + wattage + "W, Brand: " + brand);
    }
}
