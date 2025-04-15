package com.xworkz.electric;

public class Port {
    String type;
    int numberOfPorts;

    Port(String type, int numberOfPorts) {
        this.type = type;
        this.numberOfPorts = numberOfPorts;
    }

    void showPortDetails() {
        System.out.println("Port Type: " + type + ", Number of Ports: " + numberOfPorts);
    }
}
