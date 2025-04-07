package com.xworkz.inheritence.internal.scissors;

public class ScissorsUser {
    public void use(Scissors scissors) {
        scissors.cut();
        scissors.sharp();
        scissors.home();
        scissors.size();
        scissors.handle();

        if (scissors instanceof HairScissors) {
            System.out.println("scissors is instance of HairScissors");
            HairScissors hs = (HairScissors) scissors;
            hs.adjustBlades();
        }
    }
}
