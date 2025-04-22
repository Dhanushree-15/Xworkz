package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Light;

public class LightUser {
    private Light device;

    public LightUser(Light device) {
        this.device = device;
        System.out.println("Initializing LightUser with Light");
    }

    public void turnOn() {
        System.out.println("Using the Light");
        if (this.device != null) {
            this.device.turnOn();
        } else {
            System.err.println("Light is not available");
        }
    }
}
