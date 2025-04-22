package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Dishwasher;

public class DishwasherUser {
    private Dishwasher device;

    public DishwasherUser(Dishwasher device) {
        this.device = device;
        System.out.println("Initializing DishwasherUser with Dishwasher");
    }

    public void cleanDishes() {
        System.out.println("Using the Dishwasher");
        if (this.device != null) {
            this.device.cleanDishes();
        } else {
            System.err.println("Dishwasher is not available");
        }
    }
}
