package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Door;

public class DoorUser {
    private Door device;

    public DoorUser(Door device) {
        this.device = device;
        System.out.println("Initializing DoorUser with Door");
    }

    public void open() {
        System.out.println("Using the Door");
        if (this.device != null) {
            this.device.open();
        } else {
            System.err.println("Door is not available");
        }
    }
}
