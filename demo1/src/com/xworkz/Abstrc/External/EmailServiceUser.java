package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.EmailService;

public class EmailServiceUser {
    private EmailService device;

    public EmailServiceUser(EmailService device) {
        this.device = device;
        System.out.println("Initializing EmailServiceUser with EmailService");
    }

    public void sendEmail() {
        System.out.println("Using the EmailService");
        if (this.device != null) {
            this.device.sendEmail();
        } else {
            System.err.println("EmailService is not available");
        }
    }
}
