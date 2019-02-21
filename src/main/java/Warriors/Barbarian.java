package Warriors;

public class Barbarian extends Warrior {

    public Barbarian(String name, String weapon) {
        super(name, weapon);
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

}
