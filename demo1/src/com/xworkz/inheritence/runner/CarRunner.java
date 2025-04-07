package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.car.BmwCar;
import com.xworkz.inheritence.internal.car.ElectricCar;

public class CarRunner {
    public static void main(String[] args) {
        BmwCar car1 = new BmwCar();
        car1.transport();
        car1.wheels();
        car1.engine();
        car1.models();
        car1.comfort();

        System.out.println("-------------------");
        BmwCar car2 = new ElectricCar();
        car2.transport();
        car2.wheels();
        car2.engine();
        car2.models();
        car2.comfort();

        System.out.println("-----------------");
        ElectricCar electricCar = new ElectricCar();
        electricCar.transport();
        electricCar.wheels();
        electricCar.engine();
        electricCar.models();
        electricCar.comfort();
    }
}
