package com.xworkz.lesson;

public class Boat {
    private int capacity;
    private String type;
    private double length;

    public Boat(int capacity, String type, double length) {
        this.capacity = capacity;
        this.type = type;
        this.length = length;
    }

    

    @Override
    public String toString() {
        return "Boat [capacity=" + capacity + ", type=" + type + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Boat) {
                System.out.println("ref is Boat, will compare...");
                Boat b1 = this;
                Boat b2 = (Boat) obj;

                if (b1.capacity == b2.capacity &&
                        b1.length == b2.length &&
                        (b1.type != null && b1.type.equals(b2.type))) {

                    System.out.println("both boats are same");
                    return true;
                }
            }
        }
        return false;
    }
}
