package Magicians;

public abstract class Magician {

    String name;
    String magicalCreature;

    public Magician(String name, String magicalCreature) {
        this.name = name;
        this.magicalCreature = magicalCreature;
    }


    public String getName(){
        return name;
    }

    public String getMagicalCreature(){
        return magicalCreature;
    }


}
