package com.xworkz.Inbox;

public class Message {
    static int count;
    static String message;


    static {
        count = 100;
        message = "Welcome to Static Block Example!";
        System.out.println("Static Block Executed!");
    }


    public Message() {
        count++;
    }

    public void display() {
        System.out.println("Count: " + count);
        System.out.println("Message: " + message);
    }
}

