package com.xworkz.inheritence.internal.PotatoChips;

public class ChipsUser {
    public void use(PotatoChips chips) {
        chips.made();
        chips.crispy();
        chips.flavors();
        chips.packed();
        chips.snack();

        if (chips instanceof SpicyChips) {
            System.out.println("chips is instance of SpicyChips");
            SpicyChips spicy = (SpicyChips) chips;
            spicy.spicyLevel();
        }
    }
}
