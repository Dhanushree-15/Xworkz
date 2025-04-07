package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.PotatoChips.PotatoChips;
import com.xworkz.inheritence.internal.PotatoChips.SpicyChips;
import com.xworkz.inheritence.internal.PotatoChips.ChipsUser;

public class PotatoRunner {
    public static void main(String[] args) {
        PotatoChips chips = new PotatoChips();
        chips.made();
        chips.crispy();
        chips.flavors();
        chips.packed();
        chips.snack();

        System.out.println("-----------");

        PotatoChips chips2 = new SpicyChips();
        chips2.made();
        chips2.crispy();
        chips2.flavors();
        chips2.packed();
        chips2.snack();

        System.out.println("-----------");

        SpicyChips spicyChips = new SpicyChips();
        spicyChips.made();
        spicyChips.crispy();
        spicyChips.flavors();
        spicyChips.packed();
        spicyChips.snack();
        spicyChips.spicyLevel();

        System.out.println("-----------");

        ChipsUser user = new ChipsUser();
        user.use(chips);
        user.use(chips2);
        user.use(spicyChips);
    }
}
