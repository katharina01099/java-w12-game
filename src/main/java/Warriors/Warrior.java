package Warriors;

public abstract class Warrior {


    String name;
    String weapon;
    String treasure;

    public Warrior(String name, String weapon, String treasure){
        this.name = name;
        this.weapon = weapon;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public String getWeapon(){
        return weapon;
    }

    public String getTreasure(){
        return treasure;
    }

}
