package com.xworkz.lesson;

public class Key {
    private int numberOfTeeth;
    private String type;
    private double lengthInCm;

    public Key(int numberOfTeeth, String type, double lengthInCm) {
        this.numberOfTeeth = numberOfTeeth;
        this.type = type;
        this.lengthInCm = lengthInCm;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Key) {
                System.out.println("Ref is Key, will compare...");
                Key other = (Key) obj;
                if ((this.numberOfTeeth == other.numberOfTeeth) &&
                (this.type != null && this.type.equals(other.type)) &&
                (this.lengthInCm == other.lengthInCm)) {
                    System.out.println("Both keys are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Key [numberOfTeeth=" + numberOfTeeth + ", type=" + type + ", lengthInCm=" + lengthInCm + "]";
    }
    @Override
    public int hashCode(){
        return 60;
    }
}
