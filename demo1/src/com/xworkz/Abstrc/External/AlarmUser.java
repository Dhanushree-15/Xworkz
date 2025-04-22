package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Alarm;

public class AlarmUser {
    private Alarm device;

    public AlarmUser(Alarm device) {
        this.device = device;
        System.out.println("Initializing AlarmUser with Alarm");
    }

    public void ring() {
        System.out.println("Using the Alarm");
        if (this.device != null) {
            this.device.ring();
        } else {
            System.err.println("Alarm is not available");
        }
    }
}
