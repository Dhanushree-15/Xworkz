package com.xworkz.evileye.Vehicle;

public class Truck extends Car{
    public Truck(int doors) {
        super(doors);
    }
    public Truck(int doors,String brand){
        super(doors,brand);
    }
    public Truck(int doors,String brand,double mileage,boolean approve) {
        super(doors, brand, mileage, approve);
    }
    public void display(){
        System.out.println("Trip is to: "+doors+", "+brand+", "+mileage+", "+approve);
    }
}
