package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Flashlight;

public class FlashlightUser {
    private Flashlight device;

    public FlashlightUser(Flashlight device) {
        this.device = device;
        System.out.println("Initializing FlashlightUser with Flashlight");
    }

    public void shineLight() {
        System.out.println("Using the Flashlight");
        if (this.device != null) {
            this.device.shineLight();
        } else {
            System.err.println("Flashlight is not available");
        }
    }
}
