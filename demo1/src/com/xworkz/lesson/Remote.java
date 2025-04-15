package com.xworkz.lesson;

public class Remote {
    private int buttons;
    private String brand;
    private double range;

    public Remote(int buttons, String brand, double range) {
        this.buttons = buttons;
        this.brand = brand;
        this.range = range;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Remote) {
                System.out.println("Ref is Remote, will compare...");
                Remote other = (Remote) obj;
                if ((this.buttons == other.buttons) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.range == other.range)) {
                    System.out.println("Both remotes are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Remote [buttons=" + buttons + ", brand=" + brand + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 37;
    }
}
