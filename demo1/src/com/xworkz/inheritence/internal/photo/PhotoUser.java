package com.xworkz.inheritence.internal.photo;

public class PhotoUser {
    public void use(Photo photo) {
        photo.capture();
        photo.store();
        photo.print();
        photo.format();
        photo.share();

        if (photo instanceof DigitalPhoto) {
            System.out.println("photo is instance of DigitalPhoto");
            DigitalPhoto digital = (DigitalPhoto) photo;
            digital.applyFilter();
        }
    }
}
