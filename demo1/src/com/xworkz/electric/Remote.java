package com.xworkz.electric;

public class Remote {
    int numberOfButtons;
    String batteryType;

    Remote(int numberOfButtons, String batteryType) {
        this.numberOfButtons = numberOfButtons;
        this.batteryType = batteryType;
    }

    void showRemoteDetails() {
        System.out.println("Remote with " + numberOfButtons + " buttons, Battery Type: " + batteryType);
    }
}
