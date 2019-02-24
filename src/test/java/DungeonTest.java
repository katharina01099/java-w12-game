import Rooms.Dungeon;
import org.junit.Before;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;

    @Before
    public void before(){
        dungeon = new Dungeon("Bloodthirst");
    }

    @Test
    public void hasName(){
        assertEquals("Bloodthirst", dungeon.getName());
    }




}
