package com.xworkz.Lesson;

public class Key {
    private int numberOfTeeth;
    private String type;
    private double lengthInCm;

    public Key(int numberOfTeeth, String type, double lengthInCm) {
        this.numberOfTeeth = numberOfTeeth;
        this.type = type;
        this.lengthInCm = lengthInCm;
    }

    @Override
    public String toString() {
        return "Key [numberOfTeeth=" + numberOfTeeth + ", type=" + type + ", lengthInCm=" + lengthInCm + "]";
    }
    @Override
    public int hashCode(){
        return 60;
    }
}
