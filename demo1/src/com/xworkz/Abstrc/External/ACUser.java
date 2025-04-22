package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.AC;

public class ACUser {
    private AC device;

    public ACUser(AC device) {
        this.device = device;
        System.out.println("Initializing ACUser with AC");
    }

    public void coolRoom() {
        System.out.println("Using the AC");
        if (this.device != null) {
            this.device.coolRoom();
        } else {
            System.err.println("AC is not available");
        }
    }
}
