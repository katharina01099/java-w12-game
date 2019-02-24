package Rooms;

public class DarkRoom extends Room {

    String treasure;

    public DarkRoom(String name, String treasure){
        super(name);
        this.treasure = treasure;
    }

    public String getName(){
        return super.getName();
    }

    public String getTreasure(){
        return this.treasure;
    }
}
