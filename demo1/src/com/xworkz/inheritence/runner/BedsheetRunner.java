package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bluebedsheet.BlueBedsheet;
import com.xworkz.inheritence.internal.bluebedsheet.CottonBedsheet;

public class BedsheetRunner {
    public static void main(String[] args) {
        BlueBedsheet bedsheet1 = new BlueBedsheet();
        bedsheet1.cover();
        bedsheet1.wash();
        bedsheet1.fold();
        bedsheet1.texture();
        bedsheet1.design();

        System.out.println("-------------------");
        BlueBedsheet bedsheet = new CottonBedsheet();
        bedsheet.cover();
        bedsheet.wash();
        bedsheet.fold();
        bedsheet.texture();
        bedsheet.design();

        System.out.println("-----------------");
        CottonBedsheet cottonBedsheet = new CottonBedsheet();
        cottonBedsheet.cover();
        cottonBedsheet.wash();
        cottonBedsheet.fold();
        cottonBedsheet.texture();
        cottonBedsheet.design();
    }
}
