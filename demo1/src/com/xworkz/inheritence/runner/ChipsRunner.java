package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.PotatoChips.PotatoChips;
import com.xworkz.inheritence.internal.PotatoChips.SpicyChips;

public class ChipsRunner {
    public static void main(String[] args) {
        PotatoChips chips1 = new PotatoChips();
        chips1.made();
        chips1.crispy();
        chips1.flavors();
        chips1.packed();
        chips1.snack();

        System.out.println("-----------------");
        PotatoChips chips = new SpicyChips();
        chips.made();
        chips.crispy();
        chips.flavors();
        chips.packed();
        chips.snack();

        System.out.println("-----------------");
        SpicyChips spicyChips = new SpicyChips();
        spicyChips.made();
        spicyChips.crispy();
        spicyChips.flavors();
        spicyChips.packed();
        spicyChips.snack();
    }
}
