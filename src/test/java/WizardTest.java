import Magicians.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Gandalf", "Unicorn");
    }

    @Test
    public void hasName(){
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasMagicalCreature(){
        assertEquals("Unicorn", wizard.getMagicalCreature());
    }
}
