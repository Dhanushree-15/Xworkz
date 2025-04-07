package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.scissors.Scissors;
import com.xworkz.inheritence.internal.scissors.HairScissors;
import com.xworkz.inheritence.internal.scissors.ScissorsUser;

public class ScissorsRunner {
    public static void main(String[] args) {
        Scissors scissors = new Scissors();
        scissors.cut();
        scissors.sharp();
        scissors.home();
        scissors.size();
        scissors.handle();

        System.out.println("-----------");

        Scissors scissors2 = new HairScissors();
        scissors2.cut();
        scissors2.sharp();
        scissors2.home();
        scissors2.size();
        scissors2.handle();

        System.out.println("-----------");

        HairScissors hairScissors = new HairScissors();
        hairScissors.cut();
        hairScissors.sharp();
        hairScissors.home();
        hairScissors.size();
        hairScissors.handle();
        hairScissors.adjustBlades();

        System.out.println("-----------");

        ScissorsUser user = new ScissorsUser();
        user.use(scissors);
        user.use(scissors2);
        user.use(hairScissors);
    }
}
