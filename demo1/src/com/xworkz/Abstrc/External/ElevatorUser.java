package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Elevator;

public class ElevatorUser {
    private Elevator device;

    public ElevatorUser(Elevator device) {
        this.device = device;
        System.out.println("Initializing ElevatorUser with Elevator");
    }

    public void moveToFloor() {
        System.out.println("Using the Elevator");
        if (this.device != null) {
            this.device.moveToFloor();
        } else {
            System.err.println("Elevator is not available");
        }
    }
}
