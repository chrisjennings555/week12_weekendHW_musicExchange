import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    ISell guitar;
    ArrayList stock;

    @Before
    public void before(){
        shop = new Shop(stock);
        guitar = new Instrument("Wood", "Red", FamilyType.STRING, InstrumentType.GUITAR, 10, 20);

    }

    @Test
    public void getStockCount() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void addItemToStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void findIndexOfItem() {
        shop.addItemToStock(guitar);
        assertEquals(0, shop.findIndexOfItem(guitar));
    }

    @Test
    public void removeItemFromStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStockCount());
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(10, shop.calculateMarkupOfItem(guitar));
    }
}