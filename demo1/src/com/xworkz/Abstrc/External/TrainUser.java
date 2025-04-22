package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Train;

public class TrainUser {
    private Train device;

    public TrainUser(Train device) {
        this.device = device;
        System.out.println("Initializing TrainUser with Train");
    }

    public void move() {
        System.out.println("Using the Train");
        if (this.device != null) {
            this.device.move();
        } else {
            System.err.println("Train is not available");
        }
    }
}
