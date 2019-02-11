import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;
    @Before
    public void before() {
        bottle = new WaterBottle();
    }

    @Test
    public void canEmpty(){
        bottle.empty();
        assertEquals("The bottle is empty!", bottle.getVolume());
    }
    @Test
    public void canFill() {
        bottle.empty();
        bottle.fill();
        assertEquals("There are 100 litres left.", bottle.getVolume());
    }
    @Test
    public void canDrink() {
        bottle.drink();
        bottle.drink();
        assertEquals("There are 80 litres left.", bottle.getVolume());
    }


}
