import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before() {
        instrument = new Instrument("Wood", "Black", FamilyType.STRING, InstrumentType.GUITAR);
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", instrument.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("Black", instrument.getColour());
    }

    @Test
    public void getFamily() {
        assertEquals(FamilyType.STRING, instrument.getFamily());
    }

    @Test
    public void getInstrument() {
        assertEquals(InstrumentType.GUITAR, instrument.getInstrument());
    }
}