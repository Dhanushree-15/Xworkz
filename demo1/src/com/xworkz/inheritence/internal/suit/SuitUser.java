package com.xworkz.inheritence.internal.suit;

import com.xworkz.inheritence.internal.suit.Suit;
import com.xworkz.inheritence.internal.suit.WeddingSuit;

public class SuitUser {
    public void useSuit(Suit suit) {
        System.out.println("Running useSuit from SuitUser");

        if (suit instanceof WeddingSuit) {
            WeddingSuit weddingSuit = (WeddingSuit) suit;
            weddingSuit.dryClean(); // child-specific method
        } else {
            System.out.println("Not a WeddingSuit instance");
        }
    }
}
