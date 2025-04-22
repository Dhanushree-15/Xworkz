package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Bus;

public class BusUser {
    private Bus device;

    public BusUser(Bus device) {
        this.device = device;
        System.out.println("Initializing BusUser with Bus");
    }

    public void transportPeople() {
        System.out.println("Using the Bus");
        if (this.device != null) {
            this.device.transportPeople();
        } else {
            System.err.println("Bus is not available");
        }
    }
}
