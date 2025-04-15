package com.xworkz.lesson;

public class Note {
    private int pageCount;
    private String brand;
    private double price;

    public Note(int pageCount, String brand, double price) {
        this.pageCount = pageCount;
        this.brand = brand;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Note) {
                System.out.println("Ref is Note, will compare...");
                Note other = (Note) obj;
                if ((this.pageCount == other.pageCount) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both notes are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Note [pageCount=" + pageCount + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 44;
    }
}
