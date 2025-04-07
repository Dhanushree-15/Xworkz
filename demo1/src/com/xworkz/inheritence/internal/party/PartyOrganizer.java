package com.xworkz.inheritence.internal.party;

public class PartyOrganizer {
    public void manage(Party party) {
        party.invite();
        party.food();
        party.music();
        party.dance();
        party.decorate();

        if (party instanceof BirthdayParty) {
            System.out.println("party is instance of BirthdayParty");
            BirthdayParty bp = (BirthdayParty) party;
            bp.games();
        }
    }
}
