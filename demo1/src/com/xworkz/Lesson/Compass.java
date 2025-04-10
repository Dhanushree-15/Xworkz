package com.xworkz.Lesson;

public class Compass {
    private int needleLength;
    private String directionType;
    private double radius;

    public Compass(int needleLength, String directionType, double radius) {
        this.needleLength = needleLength;
        this.directionType = directionType;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Compass [needleLength=" + needleLength + ", directionType=" + directionType + ", radius=" + radius + "]";
    }
    @Override
    public int hashCode(){
        return 76;
    }
}
