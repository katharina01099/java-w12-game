package Rooms;

public abstract class Room {

    String name;

    public Room(String name){
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}
