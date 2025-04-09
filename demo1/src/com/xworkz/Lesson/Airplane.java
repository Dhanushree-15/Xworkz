package com.xworkz.Lesson;

public class Airplane {
    private int numberOfEngines;
    private String model;
    private double maxSpeed;

    public Airplane(int numberOfEngines, String model, double maxSpeed) {
        this.numberOfEngines = numberOfEngines;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Airplane [numberOfEngines=" + numberOfEngines + ", model=" + model + ", maxSpeed=" + maxSpeed + "]";
    }
}
