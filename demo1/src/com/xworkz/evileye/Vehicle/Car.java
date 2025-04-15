package com.xworkz.evileye.Vehicle;

public abstract class Car {
    int doors;
    String brand;
    double mileage;
    boolean approve;

    Car(int doors){
        this.doors=doors;
    }
    Car(int doors,String brand){
        this.doors=doors;
        this.brand=brand;
    }
    Car(int doors,String brand,double mileage,boolean approve){
        this.doors=doors;
        this.brand=brand;
        this.mileage=mileage;
        this.approve=approve;
    }
}


