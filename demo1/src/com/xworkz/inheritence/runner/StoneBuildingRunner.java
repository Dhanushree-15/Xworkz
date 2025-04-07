package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.stonebuilding.StoneBuilding;
import com.xworkz.inheritence.internal.stonebuilding.House;
import com.xworkz.inheritence.internal.stonebuilding.StoneBuildingUser;

public class StoneBuildingRunner {
    public static void main(String[] args) {
        StoneBuilding building = new StoneBuilding();
        building.shelter();
        building.structure();
        building.floors();
        building.foundation();
        building.rooms();

        System.out.println("-----------");

        StoneBuilding building2 = new House();
        building2.shelter();
        building2.structure();
        building2.floors();
        building2.foundation();
        building2.rooms();

        System.out.println("-----------");

        House house = new House();
        house.shelter();
        house.structure();
        house.floors();
        house.foundation();
        house.rooms();
        house.garden();

        System.out.println("-----------");

        StoneBuildingUser user = new StoneBuildingUser();
        user.use(building);
        user.use(building2);
        user.use(house);
    }
}
