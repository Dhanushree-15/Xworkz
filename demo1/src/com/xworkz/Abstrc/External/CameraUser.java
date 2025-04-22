package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Camera;

public class CameraUser {
    private Camera device;

    public CameraUser(Camera device) {
        this.device = device;
        System.out.println("Initializing CameraUser with Camera");
    }

    public void takePhoto() {
        System.out.println("Using the Camera");
        if (this.device != null) {
            this.device.takePhoto();
        } else {
            System.err.println("Camera is not available");
        }
    }
}
