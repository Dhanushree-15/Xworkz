package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Fan;

public class FanUser {
    private Fan device;

    public FanUser(Fan device) {
        this.device = device;
        System.out.println("Initializing FanUser with Fan");
    }

    public void rotate() {
        System.out.println("Using the Fan");
        if (this.device != null) {
            this.device.rotate();
        } else {
            System.err.println("Fan is not available");
        }
    }
}
