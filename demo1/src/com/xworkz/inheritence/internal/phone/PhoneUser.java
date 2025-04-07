package com.xworkz.inheritence.internal.phone;

public class PhoneUser {
    public void use(Phone phone) {
        phone.call();
        phone.message();
        phone.camera();
        phone.battery();
        phone.internet();

        if (phone instanceof Smartphone) {
            System.out.println("phone is instance of Smartphone");
            Smartphone smart = (Smartphone) phone;
            smart.appStore();
        }
    }
}
