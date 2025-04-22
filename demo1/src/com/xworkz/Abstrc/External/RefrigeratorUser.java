package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Refrigerator;

public class RefrigeratorUser {
    private Refrigerator device;

    public RefrigeratorUser(Refrigerator device) {
        this.device = device;
        System.out.println("Initializing RefrigeratorUser with Refrigerator");
    }

    public void coolItems() {
        System.out.println("Using the Refrigerator");
        if (this.device != null) {
            this.device.coolItems();
        } else {
            System.err.println("Refrigerator is not available");
        }
    }
}
