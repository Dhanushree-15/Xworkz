package com.xworkz.Camlin;

public class MainClass {
    public static void main(String[] args) {
        // Local variables
        Jail jail = new Jail("Alcatraz", "San Francisco", "John Doe", 500);
        Satellite satellite = new Satellite(SatelliteType.COMMUNICATION, 1500000, 2000, 500);
        IdCard idCard = new IdCard("Plastic", new String[]{"Red", "Blue"}, 10.5, "Govt");
        Alien alien = new Alien("John", "2025-03-25", "Green, tall, big eyes");
        Camera camera = new Camera("Canon", 1200, CameraType.DSLR, "WiFi");


        Jail[] jails = {
                new Jail("Sing Sing", "New York", "Mike Ross", 300)
        };
        Satellite[] satellites = {
                satellite, new Satellite(SatelliteType.WEATHER, 2000000, 2500, 600)
        };
        IdCard[] idCards = {
                idCard, new IdCard("Metal", new String[]{"Black", "Silver"}, 15.0, "Tech Corp")
        };
        Alien[] aliens = {
                alien, new Alien("Sam", "2025-04-01", "Short, blue skin")
        };
        Camera[] cameras = {
                camera, new Camera("Nikon", 1500, CameraType.SECURITY, "Bluetooth")
        };

        // Using objects as parameters
        printJail(jail);
    }

    public static void printJail(Jail jail) {
        System.out.println("Jail Name: " + jail.getName());
    }
}


