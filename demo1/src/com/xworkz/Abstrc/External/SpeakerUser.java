package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Speaker;

public class SpeakerUser {
    private Speaker device;

    public SpeakerUser(Speaker device) {
        this.device = device;
        System.out.println("Initializing SpeakerUser with Speaker");
    }

    public void playSound() {
        System.out.println("Using the Speaker");
        if (this.device != null) {
            this.device.playSound();
        } else {
            System.err.println("Speaker is not available");
        }
    }
}
