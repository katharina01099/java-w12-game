import Warriors.Barbarian;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Bunny", "Golden Hammer", "gold");
    }

    @Test
    public void hasName(){
        assertEquals("Bunny", barbarian.getName());
    }

    @Test
    public void hasWeapon(){
        assertEquals("Golden Hammer", barbarian.getWeapon());
    }

    @Test
    public void hasDeadlyScream(){
        assertEquals("Rrrrrrrooooooaaaaarrrrr", barbarian.canScreamDeadly());
    }

    @Test
    public void hasTreasure(){
        assertEquals("I got gold", barbarian.getTreasure());
    }
}
