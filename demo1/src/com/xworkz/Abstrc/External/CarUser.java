package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Car;

public class CarUser {
    private Car device;

    public CarUser(Car device) {
        this.device = device;
        System.out.println("Initializing CarUser with Car");
    }

    public void drive() {
        System.out.println("Using the Car");
        if (this.device != null) {
            this.device.drive();
        } else {
            System.err.println("Car is not available");
        }
    }
}
