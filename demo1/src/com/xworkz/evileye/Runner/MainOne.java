package com.xworkz.evileye.Runner;

import com.xworkz.evileye.Animal.Dog;
import com.xworkz.evileye.Device.Smartphone;
import com.xworkz.evileye.Employee.Intern;
import com.xworkz.evileye.Media.Video;
import com.xworkz.evileye.Vehicle.Truck;

public  class MainOne {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sleep();
        dog.makeSound();
        System.out.println("**************************");

        Smartphone phone=new Smartphone();
        phone.performFunction();
        System.out.println("**************************");

        Intern id=new Intern();
        id.evaluatePerformance();
        System.out.println("**************************");

        Video sound=new Video(15,"MP3",true);
        sound.display();
        System.out.println("**************************");

        Truck speed=new Truck(2);
        speed.display();
        Truck speed1=new Truck(2,"Benz");
        speed1.display();
        Truck speed2= new Truck(4,"BMW",18.5,true);
        speed2.display();

    }
}