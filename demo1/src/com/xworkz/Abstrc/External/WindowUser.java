package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Window;

public class WindowUser {
    private Window device;

    public WindowUser(Window device) {
        this.device = device;
        System.out.println("Initializing WindowUser with Window");
    }

    public void slideOpen() {
        System.out.println("Using the Window");
        if (this.device != null) {
            this.device.slideOpen();
        } else {
            System.err.println("Window is not available");
        }
    }
}
