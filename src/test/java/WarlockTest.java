import Magicians.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Irene", "Dragon");
    }

    @Test
    public void hasName(){
        assertEquals("Irene", warlock.getName());
    }

}
