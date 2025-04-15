package com.xworkz.lesson;

public class Truck {
    private int loadCapacity;     // Load capacity in tons
    private String modelName;     // Model or brand name of the truck
    private double mileage;       // Mileage in km per litre

    public Truck(int loadCapacity, String modelName, double mileage) {
        this.loadCapacity = loadCapacity;
        this.modelName = modelName;
        this.mileage = mileage;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Truck) {
                System.out.println("Ref is Truck, will compare...");
                Truck other = (Truck) obj;
                if ((this.loadCapacity == other.loadCapacity) &&
                (this.modelName != null && this.modelName.equals(other.modelName)) &&
                (this.mileage == other.mileage)) {
                    System.out.println("Both trucks are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Truck [loadCapacity=" + loadCapacity + ", modelName=" + modelName + ", mileage=" + mileage + "]";
    }
    @Override
    public int hashCode(){
        return 13;
    }
}
