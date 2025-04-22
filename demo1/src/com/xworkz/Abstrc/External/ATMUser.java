package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.ATM;

public class ATMUser {
    private ATM device;

    public ATMUser(ATM device) {
        this.device = device;
        System.out.println("Initializing ATMUser with ATM");
    }

    public void dispenseCash() {
        System.out.println("Using the ATM");
        if (this.device != null) {
            this.device.dispenseCash();
        } else {
            System.err.println("ATM is not available");
        }
    }
}
