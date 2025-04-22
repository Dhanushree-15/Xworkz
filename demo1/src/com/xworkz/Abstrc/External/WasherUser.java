package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Washer;

public class WasherUser {
    private Washer device;

    public WasherUser(Washer device) {
        this.device = device;
        System.out.println("Initializing WasherUser with Washer");
    }

    public void washClothes() {
        System.out.println("Using the Washer");
        if (this.device != null) {
            this.device.washClothes();
        } else {
            System.err.println("Washer is not available");
        }
    }
}
