package com.xworkz.Lesson;

public class Bed {
    private int bedId;
    private String bedType;
    private double length;

    public Bed(int bedId, String bedType, double length) {
        this.bedId = bedId;
        this.bedType = bedType;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Bed [bedId=" + bedId + ", bedType=" + bedType + ", length=" + length + "]";
    }
    @Override
    public int hashCode(){
        return 97;
    }

}
