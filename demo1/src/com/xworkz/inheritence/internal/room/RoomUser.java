package com.xworkz.inheritence.internal.room;

public class RoomUser {
    public void use(Room room) {
        room.enter();
        room.decorate();
        room.clean();
        room.ventilate();
        room.lightUp();

        if (room instanceof Bedroom) {
            System.out.println("room is instance of Bedroom");
            Bedroom bedroom = (Bedroom) room;
            bedroom.sleep();
        }
    }
}
