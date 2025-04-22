package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Scanner;

public class ScannerUser {
    private Scanner device;

    public ScannerUser(Scanner device) {
        this.device = device;
        System.out.println("Initializing ScannerUser with Scanner");
    }

    public void scanDocument() {
        System.out.println("Using the Scanner");
        if (this.device != null) {
            this.device.scanDocument();
        } else {
            System.err.println("Scanner is not available");
        }
    }
}
