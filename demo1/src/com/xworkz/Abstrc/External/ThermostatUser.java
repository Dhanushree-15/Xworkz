package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Thermostat;

public class ThermostatUser {
    private Thermostat device;

    public ThermostatUser(Thermostat device) {
        this.device = device;
        System.out.println("Initializing ThermostatUser with Thermostat");
    }

    public void setTemperature() {
        System.out.println("Using the Thermostat");
        if (this.device != null) {
            this.device.setTemperature();
        } else {
            System.err.println("Thermostat is not available");
        }
    }
}
