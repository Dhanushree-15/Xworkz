package com.xworkz.inheritence.internal.pant;

public class PantUser {
    public void tryPant(Pant pant) {
        pant.wear();
        pant.fabric();
        pant.style();
        pant.comfort();
        pant.size();

        if (pant instanceof JeansPant) {
            System.out.println("pant is instance of JeansPant");
            JeansPant jeans = (JeansPant) pant;
            jeans.washCare();
        }
    }

}
