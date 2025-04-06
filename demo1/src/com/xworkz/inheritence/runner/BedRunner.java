package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.kurlanbed.KurlanBed;
import com.xworkz.inheritence.internal.kurlanbed.KingSizeBed;

public class BedRunner {
    public static void main(String[] args) {
        KurlanBed bed1 = new KurlanBed();
        bed1.sleep();
        bed1.fold();
        bed1.comfort();
        bed1.decorate();
        bed1.adjust();

        System.out.println("-------------------");
        KurlanBed bed = new KingSizeBed();
        bed.sleep();
        bed.fold();
        bed.comfort();
        bed.decorate();
        bed.adjust();

        System.out.println("-----------------");
        KingSizeBed kingSizeBed = new KingSizeBed();
        kingSizeBed.sleep();
        kingSizeBed.fold();
        kingSizeBed.comfort();
        kingSizeBed.decorate();
        kingSizeBed.adjust();
    }
}
