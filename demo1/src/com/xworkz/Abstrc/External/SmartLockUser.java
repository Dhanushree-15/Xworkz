package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.SmartLock;

public class SmartLockUser {
    private SmartLock device;

    public SmartLockUser(SmartLock device) {
        this.device = device;
        System.out.println("Initializing SmartLockUser with SmartLock");
    }

    public void lockDoor() {
        System.out.println("Using the SmartLock");
        if (this.device != null) {
            this.device.lockDoor();
        } else {
            System.err.println("SmartLock is not available");
        }
    }
}
