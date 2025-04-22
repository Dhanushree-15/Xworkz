package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Heater;

public class HeaterUser {
    private Heater device;

    public HeaterUser(Heater device) {
        this.device = device;
        System.out.println("Initializing HeaterUser with Heater");
    }

    public void heatRoom() {
        System.out.println("Using the Heater");
        if (this.device != null) {
            this.device.heatRoom();
        } else {
            System.err.println("Heater is not available");
        }
    }
}
