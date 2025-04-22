package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Vacuum;

public class VacuumUser {
    private Vacuum device;

    public VacuumUser(Vacuum device) {
        this.device = device;
        System.out.println("Initializing VacuumUser with Vacuum");
    }

    public void cleanFloor() {
        System.out.println("Using the Vacuum");
        if (this.device != null) {
            this.device.cleanFloor();
        } else {
            System.err.println("Vacuum is not available");
        }
    }
}
