package com.xworkz.lesson;

public class Airplane {
    private int capacity;
    private String type;
    private double range;

    public Airplane(int capacity, String type, double range) {
        this.capacity = capacity;
        this.type = type;
        this.range = range;
    }
    @Override
    public String toString() {
        return "Airplane [capacity=" + capacity + ", type=" + type + ", range=" + range + "]";
    }

    @Override
    public int hashCode() {
        return 7390;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Airplane) {
                System.out.println("Ref is Airplane, it will compare....");
                Airplane a1 = this;
                Airplane a2 = (Airplane) obj;
                if (a1.capacity == a2.capacity && a1.range == a2.range && a1.type.equals(a2.type)) {
                    System.out.println("Both Airplanes are same");
                    return true;
                }
            }
        }
        return false;
    }
}

