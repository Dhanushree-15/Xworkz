package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.BarcodeScanner;

public class BarcodeScannerUser {
    private BarcodeScanner device;

    public BarcodeScannerUser(BarcodeScanner device) {
        this.device = device;
        System.out.println("Initializing BarcodeScannerUser with BarcodeScanner");
    }

    public void scanBarcode() {
        System.out.println("Using the BarcodeScanner");
        if (this.device != null) {
            this.device.scanBarcode();
        } else {
            System.err.println("BarcodeScanner is not available");
        }
    }
}
