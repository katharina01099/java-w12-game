package Warriors;

import java.util.ArrayList;

public class Barbarian extends Warrior {

    public Barbarian(String name, String weapon, String treasure) {
        super(name, weapon, treasure);
    }

    @Override
    public String getWeapon(){
        return super.getWeapon();
    }

    @Override
    public String getName(){
        return super.getName();
    }

    public String canScreamDeadly(){
        return "Rrrrrrrooooooaaaaarrrrr";
    }

    public String collectTreasure(String treasure){
        return "I got: " + super.getTreasure();
    }

}
