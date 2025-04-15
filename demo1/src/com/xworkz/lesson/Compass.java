package com.xworkz.lesson;

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
    public int hashCode() {
        return 76;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Compass) {
                System.out.println("ref is Compass, will compare...");
                Compass c1 = this;
                Compass c2 = (Compass) obj;

                if (c1.needleLength == c2.needleLength &&
                        c1.radius == c2.radius &&
                        (c1.directionType != null && c1.directionType.equals(c2.directionType))) {

                    System.out.println("both compasses are same");
                    return true;
                }
            }
        }
        return false;
    }
}
