import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SundriesTest {

    Sundries sundry;

    @Before
    public void before() {
        sundry = new Sundries("Music Sheets", 5, 10);
    }

    @Test
    public void getName() {
        assertEquals("Music Sheets", sundry.getName());
    }

    @Test
    public void getCostPrice() {
        assertEquals(5, sundry.getCostPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(10, sundry.getSellPrice());
    }

}