package com.xworkz.inheritence.internal.laptop;

public class DellLaptop {
    public void work(Laptop laptop){
        laptop.runSoftware();
        laptop.providePortability();
        laptop.connectToInternet();
        laptop.supportMultitasking();
        laptop.longBatteryLife();
        if(laptop instanceof GamingLaptop){
            System.out.println("laptop instance of gaminglaptop");
            GamingLaptop gamingLaptop=(GamingLaptop) laptop;
            gamingLaptop.wifi();
        }
    }
}
