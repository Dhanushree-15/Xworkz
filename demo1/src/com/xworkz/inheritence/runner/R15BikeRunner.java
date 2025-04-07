package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.r15bike.R15Bike;
import com.xworkz.inheritence.internal.r15bike.SportsBike;
import com.xworkz.inheritence.internal.r15bike.BikeUser;

public class R15BikeRunner {
    public static void main(String[] args) {
        R15Bike bike = new R15Bike();
        bike.transport();
        bike.wheels();
        bike.fuel();
        bike.safety();
        bike.model();

        System.out.println("-----------");

        R15Bike sportsBike = new SportsBike();
        sportsBike.transport();
        sportsBike.wheels();
        sportsBike.fuel();
        sportsBike.safety();
        sportsBike.model();

        System.out.println("-----------");

        SportsBike directSportsBike = new SportsBike();
        directSportsBike.transport();
        directSportsBike.wheels();
        directSportsBike.fuel();
        directSportsBike.safety();
        directSportsBike.model();
        directSportsBike.raceMode();

        System.out.println("-----------");

        BikeUser user = new BikeUser();
        user.use(bike);
        user.use(sportsBike);
        user.use(directSportsBike);
    }
}
