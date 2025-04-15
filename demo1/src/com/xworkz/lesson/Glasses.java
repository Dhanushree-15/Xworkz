package com.xworkz.lesson;

public class Glasses {
    private int lensPower;
    private String frameType;
    private double price;

    public Glasses(int lensPower, String frameType, double price) {
        this.lensPower = lensPower;
        this.frameType = frameType;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Glasses) {
                System.out.println("Ref is Glasses, will compare...");
                Glasses other = (Glasses) obj;
                if ((this.lensPower == other.lensPower) &&
                (this.frameType != null && this.frameType.equals(other.frameType)) &&
                (this.price == other.price)) {
                    System.out.println("Both glassess are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Glasses [lensPower=" + lensPower + ", frameType=" + frameType + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 69;
    }
}
