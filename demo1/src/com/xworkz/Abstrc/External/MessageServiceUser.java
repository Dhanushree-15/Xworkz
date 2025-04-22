package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.MessageService;

public class MessageServiceUser {
    private MessageService device;

    public MessageServiceUser(MessageService device) {
        this.device = device;
        System.out.println("Initializing MessageServiceUser with MessageService");
    }

    public void sendMessage() {
        System.out.println("Using the MessageService");
        if (this.device != null) {
            this.device.sendMessage();
        } else {
            System.err.println("MessageService is not available");
        }
    }
}
