package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Sensor;

public class SensorUser {
    private Sensor device;

    public SensorUser(Sensor device) {
        this.device = device;
        System.out.println("Initializing SensorUser with Sensor");
    }

    public void detectMotion() {
        System.out.println("Using the Sensor");
        if (this.device != null) {
            this.device.detectMotion();
        } else {
            System.err.println("Sensor is not available");
        }
    }
}
