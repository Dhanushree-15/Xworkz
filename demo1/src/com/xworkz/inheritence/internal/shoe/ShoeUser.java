package com.xworkz.inheritence.internal.shoe;

public class ShoeUser {
    public void use(Shoe shoe) {
        shoe.protect();
        shoe.comfort();
        shoe.style();
        shoe.material();
        shoe.size();

        if (shoe instanceof SportsShoe) {
            System.out.println("shoe is instance of SportsShoe");
            SportsShoe sports = (SportsShoe) shoe;
            sports.grip();
        }
    }
}
