package Magicians;


public class Wizard extends Magician {


    public Wizard(String name, String magicalCreature){
       super(name, magicalCreature);
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public String getMagicalCreature(){
        return super.getMagicalCreature();
    }
}
