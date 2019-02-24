import Warriors.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Henry the strong", "Black Sword", "diamonds");
    }

    @Test
    public void hasName(){
        assertEquals("Henry the strong", knight.getName());
    }
}
