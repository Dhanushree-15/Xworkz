package com.xworkz.lesson;

public class Brush {
    private int bristleCount;
    private String brushType;
    private double length;

    public Brush(int bristleCount, String brushType, double length) {
        this.bristleCount = bristleCount;
        this.brushType = brushType;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Brush [bristleCount=" + bristleCount + ", brushType=" + brushType + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        return 90;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Brush) {
                System.out.println("ref is Brush, will compare...");
                Brush b1 = this;
                Brush b2 = (Brush) obj;

                if (b1.bristleCount == b2.bristleCount &&
                        b1.length == b2.length &&
                        (b1.brushType != null && b1.brushType.equals(b2.brushType))) {
                    System.out.println("both brushes are same");
                    return true;
                }
            }
        }
        return false;
    }
}
