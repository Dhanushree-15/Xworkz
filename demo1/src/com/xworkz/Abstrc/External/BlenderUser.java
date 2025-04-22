package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Blender;

public class BlenderUser {
    private Blender device;

    public BlenderUser(Blender device) {
        this.device = device;
        System.out.println("Initializing BlenderUser with Blender");
    }

    public void blend() {
        System.out.println("Using the Blender");
        if (this.device != null) {
            this.device.blend();
        } else {
            System.err.println("Blender is not available");
        }
    }
}
