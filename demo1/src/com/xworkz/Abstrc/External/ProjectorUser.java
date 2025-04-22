package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Projector;

public class ProjectorUser {
    private Projector device;

    public ProjectorUser(Projector device) {
        this.device = device;
        System.out.println("Initializing ProjectorUser with Projector");
    }

    public void projectImage() {
        System.out.println("Using the Projector");
        if (this.device != null) {
            this.device.projectImage();
        } else {
            System.err.println("Projector is not available");
        }
    }
}
