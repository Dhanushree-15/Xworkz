package com.xworkz.Lesson;

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
    public String toString() {
        return "Helicopter [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
    @Override
    public int hashCode(){
        return 65;
    }
}
