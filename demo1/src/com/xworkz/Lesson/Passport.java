package com.xworkz.Lesson;

public class Passport {
    private int passportNumber;
    private String holderName;
    private double validityYears;

    public Passport(int passportNumber, String holderName, double validityYears) {
        this.passportNumber = passportNumber;
        this.holderName = holderName;
        this.validityYears = validityYears;
    }

    @Override
    public String toString() {
        return "Passport [passportNumber=" + passportNumber + ", holderName=" + holderName + ", validityYears=" + validityYears + "]";
    }
    @Override
    public int hashCode(){
        return 41;
    }
}
