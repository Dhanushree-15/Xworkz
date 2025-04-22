package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Oven;

public class OvenUser {
    private Oven device;

    public OvenUser(Oven device) {
        this.device = device;
        System.out.println("Initializing OvenUser with Oven");
    }

    public void bakeCake() {
        System.out.println("Using the Oven");
        if (this.device != null) {
            this.device.bakeCake();
        } else {
            System.err.println("Oven is not available");
        }
    }
}
