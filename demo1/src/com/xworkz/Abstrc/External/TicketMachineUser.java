package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.TicketMachine;

public class TicketMachineUser {
    private TicketMachine device;

    public TicketMachineUser(TicketMachine device) {
        this.device = device;
        System.out.println("Initializing TicketMachineUser with TicketMachine");
    }

    public void printTicket() {
        System.out.println("Using the TicketMachine");
        if (this.device != null) {
            this.device.printTicket();
        } else {
            System.err.println("TicketMachine is not available");
        }
    }
}
