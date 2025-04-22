package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Bike;

public class BikeUser {
    private Bike device;

    public BikeUser(Bike device) {
        this.device = device;
        System.out.println("Initializing BikeUser with Bike");
    }

    public void startEngine() {
        System.out.println("Using the Bike");
        if (this.device != null) {
            this.device.startEngine();
        } else {
            System.err.println("Bike is not available");
        }
    }
}
