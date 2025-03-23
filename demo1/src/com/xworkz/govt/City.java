package com.xworkz.govt;

public class City {
    String[] Ward={
            "floor","place"
    };
    public City(){
        for(String ward: Ward){
            System.out.println(ward);
        }
    }
}
