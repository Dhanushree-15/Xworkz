package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Printer;

public class PrinterUser {
    private Printer device;

    public PrinterUser(Printer device) {
        this.device = device;
        System.out.println("Initializing PrinterUser with Printer");
    }

    public void printDocument() {
        System.out.println("Using the Printer");
        if (this.device != null) {
            this.device.printDocument();
        } else {
            System.err.println("Printer is not available");
        }
    }
}
