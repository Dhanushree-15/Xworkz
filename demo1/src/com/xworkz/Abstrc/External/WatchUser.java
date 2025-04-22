package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Watch;

public class WatchUser {
    private Watch device;

    public WatchUser(Watch device) {
        this.device = device;
        System.out.println("Initializing WatchUser with Watch");
    }

    public void showTime() {
        System.out.println("Using the Watch");
        if (this.device != null) {
            this.device.showTime();
        } else {
            System.err.println("Watch is not available");
        }
    }
}
