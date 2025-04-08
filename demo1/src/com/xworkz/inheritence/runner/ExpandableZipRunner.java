package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.suitcase.Suitcase;
import com.xworkz.inheritence.internal.suitcase.Zip;
import com.xworkz.inheritence.internal.suitcase.ExpandableZip;

public class ExpandableZipRunner {
    public static void main(String[] args) {
        Suitcase suitcase = new Suitcase();
        suitcase.open();
        suitcase.close();
        suitcase.color();
        suitcase.size();
        suitcase.lock();

        System.out.println("-----------");

        Suitcase suitcase2 = new Zip();
        suitcase2.open();
        suitcase2.close();
        suitcase2.color();
        suitcase2.size();
        suitcase2.lock();

        System.out.println("-----------");

        Suitcase suitcase3 = new ExpandableZip();
        suitcase3.open();
        suitcase3.close();
        suitcase3.color();
        suitcase3.size();
        suitcase3.lock();

        System.out.println("-----------");

        ExpandableZip expandableZip = new ExpandableZip();
        expandableZip.open();
        expandableZip.close();
        expandableZip.color();
        expandableZip.size();
        expandableZip.lock();
        expandableZip.expandStorage(); // ✅ child-specific method

        System.out.println("-----------");

        // Casting example
        if (suitcase3 instanceof ExpandableZip) {
            ExpandableZip casted = (ExpandableZip) suitcase3;
            casted.expandStorage();
        } else {
            System.out.println("Not an instance of ExpandableZip");
        }
    }
}
