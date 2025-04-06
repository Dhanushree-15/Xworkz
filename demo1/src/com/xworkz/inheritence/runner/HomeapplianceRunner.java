package com.xworkz.inheritence.runner;


import com.xworkz.inheritence.internal.homeappliance.HomeAppliance;
import com.xworkz.inheritence.internal.homeappliance.Telivision;

public class HomeapplianceRunner {
    public static void main(String[] args) {
        HomeAppliance appliance1 = new HomeAppliance();
        appliance1.powerOn();
        appliance1.powerOff();
        appliance1.consumeElectricity();
        appliance1.function();
        appliance1.brand();

        System.out.println("-------------------");
        HomeAppliance appliance = new Telivision();
        appliance.powerOn();
        appliance.powerOff();
        appliance.consumeElectricity();
        appliance.function();
        appliance.brand();

        System.out.println("-----------------");
        Telivision telivision = new Telivision();
        telivision.powerOn();
        telivision.powerOff();
        telivision.consumeElectricity();
        telivision.function();
        telivision.brand();
    }
}
