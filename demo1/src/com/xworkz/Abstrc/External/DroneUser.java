package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Drone;

public class DroneUser {
    private Drone device;

    public DroneUser(Drone device) {
        this.device = device;
        System.out.println("Initializing DroneUser with Drone");
    }

    public void fly() {
        System.out.println("Using the Drone");
        if (this.device != null) {
            this.device.fly();
        } else {
            System.err.println("Drone is not available");
        }
    }
}
