package com.xworkz.lesson;

public class Notebook {
    private int totalPages;
    private String brand;
    private double cost;

    public Notebook(int totalPages, String brand, double cost) {
        this.totalPages = totalPages;
        this.brand = brand;
        this.cost = cost;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Notebook) {
                System.out.println("Ref is Notebook, will compare...");
                Notebook other = (Notebook) obj;
                if ((this.totalPages == other.totalPages) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.cost == other.cost)) {
                    System.out.println("Both notebooks are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Notebook [totalPages=" + totalPages + ", brand=" + brand + ", cost=" + cost + "]";
    }
    @Override
    public int hashCode(){
        return 44;
    }
}
