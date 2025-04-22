package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.PassportScanner;

public class PassportScannerUser {
    private PassportScanner device;

    public PassportScannerUser(PassportScanner device) {
        this.device = device;
        System.out.println("Initializing PassportScannerUser with PassportScanner");
    }

    public void scanPassport() {
        System.out.println("Using the PassportScanner");
        if (this.device != null) {
            this.device.scanPassport();
        } else {
            System.err.println("PassportScanner is not available");
        }
    }
}
