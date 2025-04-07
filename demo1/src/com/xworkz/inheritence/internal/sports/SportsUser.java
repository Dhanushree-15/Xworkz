package com.xworkz.inheritence.internal.sports;

public class SportsUser {
    public void use(Sports sport) {
        sport.play();
        sport.rules();
        sport.competition();
        sport.team();
        sport.training();

        if (sport instanceof Football) {
            System.out.println("sport is instance of Football");
            Football football = (Football) sport;
            football.worldCup();
        }
    }
}
