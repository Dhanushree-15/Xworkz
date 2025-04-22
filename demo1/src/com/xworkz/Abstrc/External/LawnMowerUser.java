package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.LawnMower;

public class LawnMowerUser {
    private LawnMower device;

    public LawnMowerUser(LawnMower device) {
        this.device = device;
        System.out.println("Initializing LawnMowerUser with LawnMower");
    }

    public void cutGrass() {
        System.out.println("Using the LawnMower");
        if (this.device != null) {
            this.device.cutGrass();
        } else {
            System.err.println("LawnMower is not available");
        }
    }
}
