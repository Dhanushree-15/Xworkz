package com.xworkz.Lesson;

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
    public int hashCode(){
        return 89;
    }
}
