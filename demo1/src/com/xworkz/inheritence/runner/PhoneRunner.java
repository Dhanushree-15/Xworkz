package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.phone.Phone;
import com.xworkz.inheritence.internal.phone.Smartphone;
import com.xworkz.inheritence.internal.phone.PhoneUser;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.message();
        phone.camera();
        phone.battery();
        phone.internet();

        System.out.println("-----------");

        Phone phone2 = new Smartphone();
        phone2.call();
        phone2.message();
        phone2.camera();
        phone2.battery();
        phone2.internet();

        System.out.println("-----------");

        Smartphone smartphone = new Smartphone();
        smartphone.call();
        smartphone.message();
        smartphone.camera();
        smartphone.battery();
        smartphone.internet();
        smartphone.appStore();

        System.out.println("-----------");

        PhoneUser user = new PhoneUser();
        user.use(phone);
        user.use(phone2);
        user.use(smartphone);
    }
}
