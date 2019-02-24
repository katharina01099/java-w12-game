import Warriors.Dwarve;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DwarveTest {

    Dwarve dwarve;

    @Before
    public void before(){
        dwarve = new Dwarve("Holger", "Schleuder", "magic stones");
    }

    @Test
    public void hasName(){
        assertEquals("Holger", dwarve.getName());
    }

    @Test
    public void hasWeapon(){
        assertEquals("Schleuder", dwarve.getWeapon());
    }

    @Test
    public void canThrowFireball(){
        assertEquals("kzssccchhhh", dwarve.throwFireball());
    }

}
