package com.xworkz.lesson;

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Passport) {
                System.out.println("Ref is Passport, will compare...");
                Passport other = (Passport) obj;
                if ((this.passportNumber == other.passportNumber) &&
                (this.holderName != null && this.holderName.equals(other.holderName)) &&
                (this.validityYears == other.validityYears)) {
                    System.out.println("Both passports are same");
                    return true;
                }
            }
        }
        return false;
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
