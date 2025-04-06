package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.r15bike.R15Bike;
import com.xworkz.inheritence.internal.r15bike.SportsBike;

public class BikeRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bike ----------");
        R15Bike bike = new R15Bike();
        bike.transport();
        bike.wheels();
        bike.fuel();
        bike.safety();
        bike.model();

        System.out.println("---------- SportsBike ----------");
        R15Bike sportsBike = new SportsBike();
        sportsBike.transport();
        sportsBike.wheels();
        sportsBike.fuel();
        sportsBike.safety();
        sportsBike.model();

        System.out.println("---------- Direct SportsBike ----------");
        SportsBike directSportsBike = new SportsBike();
        directSportsBike.transport();
        directSportsBike.wheels();
        directSportsBike.fuel();
        directSportsBike.safety();
        directSportsBike.model();
    }
}
