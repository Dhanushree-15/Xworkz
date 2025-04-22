package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.TV;

public class TVUser {
    private TV device;

    public TVUser(TV device) {
        this.device = device;
        System.out.println("Initializing TVUser with TV");
    }

    public void displayChannel() {
        System.out.println("Using the TV");
        if (this.device != null) {
            this.device.displayChannel();
        } else {
            System.err.println("TV is not available");
        }
    }
}
