package com.xworkz.inheritence.internal.planet;

public class PlanetUser {
    public void use(Planet planet) {
        planet.orbit();
        planet.gravity();
        planet.atmosphere();
        planet.life();
        planet.ocean();

        if (planet instanceof Earth) {
            System.out.println("planet is instance of Earth");
            Earth earth = (Earth) planet;
            earth.supportTechnology();
        }
    }
}
