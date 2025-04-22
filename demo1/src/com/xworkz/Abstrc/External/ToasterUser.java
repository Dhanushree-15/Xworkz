package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Toaster;

public class ToasterUser {
    private Toaster device;

    public ToasterUser(Toaster device) {
        this.device = device;
        System.out.println("Initializing ToasterUser with Toaster");
    }

    public void toastBread() {
        System.out.println("Using the Toaster");
        if (this.device != null) {
            this.device.toastBread();
        } else {
            System.err.println("Toaster is not available");
        }
    }
}
