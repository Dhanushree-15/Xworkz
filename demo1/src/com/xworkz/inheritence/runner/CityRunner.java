package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.city.Shimogga;
import com.xworkz.inheritence.internal.city.NewYork;

public class CityRunner {
    public static void main(String[] args) {
        Shimogga city1 = new Shimogga();
        city1.people();
        city1.roads();
        city1.visit();
        city1.life();
        city1.business();

        System.out.println("-----------");

        Shimogga city = new NewYork();
        city.people();
        city.roads();
        city.visit();
        city.life();
        city.business();

        System.out.println("-----------");

        NewYork newYork = new NewYork();
        newYork.people();
        newYork.roads();
        newYork.visit();
        newYork.life();
        newYork.business();
    }
}
