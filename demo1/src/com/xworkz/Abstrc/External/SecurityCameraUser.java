package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.SecurityCamera;

public class SecurityCameraUser {
    private SecurityCamera device;

    public SecurityCameraUser(SecurityCamera device) {
        this.device = device;
        System.out.println("Initializing SecurityCameraUser with SecurityCamera");
    }

    public void recordVideo() {
        System.out.println("Using the SecurityCamera");
        if (this.device != null) {
            this.device.recordVideo();
        } else {
            System.err.println("SecurityCamera is not available");
        }
    }
}
