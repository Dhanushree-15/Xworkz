package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Robot;

public class RobotUser {
    private Robot device;

    public RobotUser(Robot device) {
        this.device = device;
        System.out.println("Initializing RobotUser with Robot");
    }

    public void performTask() {
        System.out.println("Using the Robot");
        if (this.device != null) {
            this.device.performTask();
        } else {
            System.err.println("Robot is not available");
        }
    }
}
