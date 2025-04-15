package com.xworkz.accesscontrol;

public class Student {
    public String name;
    int age;
    private double marks;
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public double getMarks() {
        return marks;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}
