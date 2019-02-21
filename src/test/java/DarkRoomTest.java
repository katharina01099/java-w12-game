import Rooms.DarkRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DarkRoomTest {

    DarkRoom darkRoom;

    @Before
    public void before(){
        darkRoom = new DarkRoom("Black Ghost");
    }

    @Test
    public void hasName(){
        assertEquals("Black Ghost", darkRoom.getName());
    }
}
