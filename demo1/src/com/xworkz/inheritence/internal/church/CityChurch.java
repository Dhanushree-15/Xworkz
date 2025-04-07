package com.xworkz.inheritence.internal.church;

public class CityChurch {
    public CityChurch() {
        System.out.println("Running non-arg constructor CityChurch--parent");
    }

    public void service() {
        System.out.println("CityChurch holds service--parent");
    }

    public void pray() {
        System.out.println("People pray in CityChurch--parent");
    }

    public void candles() {
        System.out.println("Candles are lit in CityChurch--parent");
    }

    public void hymns() {
        System.out.println("Churchgoers sing hymns--parent");
    }

    public void bible() {
        System.out.println("Bible is read in CityChurch--parent");
    }
}
