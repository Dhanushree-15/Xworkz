package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.planet.Planet;
import com.xworkz.inheritence.internal.planet.Earth;
import com.xworkz.inheritence.internal.planet.PlanetUser;

public class PlanetRunner {
    public static void main(String[] args) {
        Planet planet = new Planet();
        planet.orbit();
        planet.gravity();
        planet.atmosphere();
        planet.life();
        planet.ocean();

        System.out.println("-----------");

        Planet planet2 = new Earth();
        planet2.orbit();
        planet2.gravity();
        planet2.atmosphere();
        planet2.life();
        planet2.ocean();

        System.out.println("-----------");

        Earth earth = new Earth();
        earth.orbit();
        earth.gravity();
        earth.atmosphere();
        earth.life();
        earth.ocean();
        earth.supportTechnology();

        System.out.println("-----------");

        PlanetUser user = new PlanetUser();
        user.use(planet);
        user.use(planet2);
        user.use(earth);
    }
}
