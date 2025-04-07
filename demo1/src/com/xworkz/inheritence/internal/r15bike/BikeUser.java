package com.xworkz.inheritence.internal.r15bike;

public class BikeUser {
    public void use(R15Bike bike) {
        bike.transport();
        bike.wheels();
        bike.fuel();
        bike.safety();
        bike.model();

        if (bike instanceof SportsBike) {
            System.out.println("bike is instance of SportsBike");
            SportsBike sports = (SportsBike) bike;
            sports.raceMode(); // Optional: additional method specific to SportsBike
        }
    }
}
