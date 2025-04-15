package com.xworkz.lesson;

public class Lamp {
    private int brightnessLevel;
    private String color;
    private double heightInInches;

    public Lamp(int brightnessLevel, String color, double heightInInches) {
        this.brightnessLevel = brightnessLevel;
        this.color = color;
        this.heightInInches = heightInInches;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Lamp) {
                System.out.println("Ref is Lamp, will compare...");
                Lamp other = (Lamp) obj;
                if ((this.brightnessLevel == other.brightnessLevel) &&
                (this.color != null && this.color.equals(other.color)) &&
                (this.heightInInches == other.heightInInches)) {
                    System.out.println("Both lamps are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Lamp [brightnessLevel=" + brightnessLevel + ", color=" + color + ", heightInInches=" + heightInInches + "]";
    }
    @Override
    public int hashCode(){
        return 57;
    }
}
