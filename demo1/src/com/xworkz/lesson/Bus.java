package com.xworkz.lesson;

public class Bus {
    private int seatCapacity;
    private String busName;
    private double fare;

    public Bus(int seatCapacity, String busName, double fare) {
        this.seatCapacity = seatCapacity;
        this.busName = busName;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Bus [seatCapacity=" + seatCapacity + ", busName=" + busName + ", fare=" + fare + "]";
    }

    @Override
    public int hashCode() {
        return 89;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bus) {
                System.out.println("ref is Bus, will compare...");
                Bus b1 = this;
                Bus b2 = (Bus) obj;

                if (b1.seatCapacity == b2.seatCapacity &&
                        b1.fare == b2.fare &&
                        (b1.busName != null && b1.busName.equals(b2.busName))) {

                    System.out.println("both buses are same");
                    return true;
                }
            }
        }
        return false;
    }
}
