package com.xworkz.lesson;

public class Table {
    private int numberOfLegs;
    private String material;
    private double heightInCm;

    public Table(int numberOfLegs, String material, double heightInCm) {
        this.numberOfLegs = numberOfLegs;
        this.material = material;
        this.heightInCm = heightInCm;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Table) {
                System.out.println("Ref is Table, will compare...");
                Table other = (Table) obj;
                if ((this.numberOfLegs == other.numberOfLegs) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.heightInCm == other.heightInCm)) {
                    System.out.println("Both tables are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Table [numberOfLegs=" + numberOfLegs + ", material=" + material + ", heightInCm=" + heightInCm + "]";
    }
    @Override
    public int hashCode(){
        return 21;
    }
}
