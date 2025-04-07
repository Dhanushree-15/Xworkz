package com.xworkz.inheritence.internal.stationery;

public class StationeryUser {
    public void use(Stationery stationery) {
        stationery.write();
        stationery.erase();
        stationery.color();
        stationery.size();
        stationery.price();

        if (stationery instanceof Pen) {
            System.out.println("stationery is instance of Pen");
            Pen pen = (Pen) stationery;
            pen.refill();
        }
    }
}
