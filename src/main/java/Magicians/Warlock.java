package Magicians;

public class Warlock extends Magician implements ICastspellable {

    public Warlock (String name, String magicalCreatures){
        super(name, magicalCreatures);
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public String getMagicalCreature(){
        return super.getMagicalCreature();
    }


    @Override
    public String castSpell() {
        return "Freeze";
    }
}
