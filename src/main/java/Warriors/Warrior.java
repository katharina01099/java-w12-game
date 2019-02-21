package Warriors;

public abstract class Warrior {

    protected String getWeapon;
    String name;
    String weapon;

    public Warrior(String name, String weapon){
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public String getWeapon(){
        return weapon;
    }
}
