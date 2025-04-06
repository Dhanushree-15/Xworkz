package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.stonebuilding.StoneBuilding;
import com.xworkz.inheritence.internal.stonebuilding.House;

public class BuildingRunner {
    public static void main(String[] args) {
        StoneBuilding building1 = new StoneBuilding();
        building1.shelter();
        building1.structure();
        building1.floors();
        building1.foundation();
        building1.rooms();

        System.out.println("-------------------");
        StoneBuilding building = new House();
        building.shelter();
        building.structure();
        building.floors();
        building.foundation();
        building.rooms();

        System.out.println("-------------------");
        House house = new House();
        house.shelter();
        house.structure();
        house.floors();
        house.foundation();
        house.rooms();
    }
}
