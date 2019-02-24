package Rooms;

import java.util.ArrayList;

public class DarkRoom extends Room {

   private String treasure;

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
