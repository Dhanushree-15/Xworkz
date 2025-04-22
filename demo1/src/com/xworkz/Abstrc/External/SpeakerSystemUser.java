package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.SpeakerSystem;

public class SpeakerSystemUser {
    private SpeakerSystem device;

    public SpeakerSystemUser(SpeakerSystem device) {
        this.device = device;
        System.out.println("Initializing SpeakerSystemUser with SpeakerSystem");
    }

    public void amplifySound() {
        System.out.println("Using the SpeakerSystem");
        if (this.device != null) {
            this.device.amplifySound();
        } else {
            System.err.println("SpeakerSystem is not available");
        }
    }
}
