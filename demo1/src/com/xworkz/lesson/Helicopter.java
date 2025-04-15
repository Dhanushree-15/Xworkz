package com.xworkz.lesson;

public class Helicopter {
    private int a;
    private String b;
    private double c;

    public Helicopter(int a, String b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Helicopter) {
                System.out.println("Ref is Helicopter, will compare...");
                Helicopter other = (Helicopter) obj;
                if ((this.a == other.a) &&
                (this.b != null && this.b.equals(other.b)) &&
                (this.c == other.c)) {
                    System.out.println("Both helicopters are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Helicopter [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
    @Override
    public int hashCode(){
        return 65;
    }
}
