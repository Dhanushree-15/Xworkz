package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.GPS;

public class GPSUser {
    private GPS device;

    public GPSUser(GPS device) {
        this.device = device;
        System.out.println("Initializing GPSUser with GPS");
    }

    public void trackLocation() {
        System.out.println("Using the GPS");
        if (this.device != null) {
            this.device.trackLocation();
        } else {
            System.err.println("GPS is not available");
        }
    }
}
