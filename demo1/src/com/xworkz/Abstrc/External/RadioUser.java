package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Radio;

public class RadioUser {
    private Radio device;

    public RadioUser(Radio device) {
        this.device = device;
        System.out.println("Initializing RadioUser with Radio");
    }

    public void playStation() {
        System.out.println("Using the Radio");
        if (this.device != null) {
            this.device.playStation();
        } else {
            System.err.println("Radio is not available");
        }
    }
}
