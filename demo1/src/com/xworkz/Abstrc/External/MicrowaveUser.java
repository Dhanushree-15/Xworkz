package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Microwave;

public class MicrowaveUser {
    private Microwave device;

    public MicrowaveUser(Microwave device) {
        this.device = device;
        System.out.println("Initializing MicrowaveUser with Microwave");
    }

    public void heatFood() {
        System.out.println("Using the Microwave");
        if (this.device != null) {
            this.device.heatFood();
        } else {
            System.err.println("Microwave is not available");
        }
    }
}
