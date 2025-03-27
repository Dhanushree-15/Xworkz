package com.xworkz.Electric;

public class Panel {
    String material;
    String color;

    Panel(String material, String color) {
        this.material = material;
        this.color = color;
    }

    void showPanelDetails() {
        System.out.println("Panel Material: " + material + ", Color: " + color);
    }
}
