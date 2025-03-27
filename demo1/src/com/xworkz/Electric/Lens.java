package com.xworkz.Electric;

public class Lens {
    String type;
    int zoomLevel;

    Lens(String type, int zoomLevel) {
        this.type = type;
        this.zoomLevel = zoomLevel;
    }

    void showLensDetails() {
        System.out.println("Lens Type: " + type + ", Zoom Level: " + zoomLevel);
    }

}
