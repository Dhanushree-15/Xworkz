package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Timer;

public class TimerUser {
    private Timer device;

    public TimerUser(Timer device) {
        this.device = device;
        System.out.println("Initializing TimerUser with Timer");
    }

    public void startTimer() {
        System.out.println("Using the Timer");
        if (this.device != null) {
            this.device.startTimer();
        } else {
            System.err.println("Timer is not available");
        }
    }
}
