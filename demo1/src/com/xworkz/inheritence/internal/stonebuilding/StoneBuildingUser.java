package com.xworkz.inheritence.internal.stonebuilding;

public class StoneBuildingUser {
    public void use(StoneBuilding building) {
        building.shelter();
        building.structure();
        building.floors();
        building.foundation();
        building.rooms();

        if (building instanceof House) {
            System.out.println("building is instance of House");
            House house = (House) building;
            house.garden();
        }
    }
}
