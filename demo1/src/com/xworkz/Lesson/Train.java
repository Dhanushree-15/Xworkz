package com.xworkz.Lesson;

public class Train {
    private int numberOfCoaches;   // Number of coaches in the train
    private String routeName;      // Name of the route or train
    private double speed;          // Average speed of the train in km/h

    public Train(int numberOfCoaches, String routeName, double speed) {
        this.numberOfCoaches = numberOfCoaches;
        this.routeName = routeName;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Train [numberOfCoaches=" + numberOfCoaches + ", routeName=" + routeName + ", speed=" + speed + "]";
    }
}
