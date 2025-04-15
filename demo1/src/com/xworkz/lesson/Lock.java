package com.xworkz.lesson;

public class Lock {
    private int securityLevel;
    private String material;
    private double price;

    public Lock(int securityLevel, String material, double price) {
        this.securityLevel = securityLevel;
        this.material = material;
        this.price = price;
    }


    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Lock) {
                System.out.println("Ref is Lock, will compare...");
                Lock other = (Lock) obj;
                if ((this.securityLevel == other.securityLevel) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.price == other.price)) {
                    System.out.println("Both locks are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Lock [securityLevel=" + securityLevel + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 53;
    }
}
