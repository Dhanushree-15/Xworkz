package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.potato.Potato;
import com.xworkz.inheritence.internal.potato.SweetPotato;
import com.xworkz.inheritence.internal.potato.PotatoUser;

public class PotatoRunner {
    public static void main(String[] args) {
        Potato potato = new Potato();
        Potato potato2 = new SweetPotato();
        SweetPotato sweetPotato = new SweetPotato();

        System.out.println("-----------");

        PotatoUser user = new PotatoUser();
        user.use(potato);
        System.out.println("-----------");
        user.use(potato2);
        System.out.println("-----------");
        user.use(sweetPotato);
    }
}
