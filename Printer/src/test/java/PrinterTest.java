import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer1;
    @Before
    public void before() {
        printer1 = new Printer(123, 89);
    }
    @Test
    public void hasSheets(){
        assertEquals(123, printer1.getSheets());
    }
    @Test
    public void hasToner(){
        assertEquals(89, printer1.getToner());
    }
    @Test
    public void testAddSheets() {
        printer1.addSheets(20);
        assertEquals(143, printer1.getSheets());
    }
    @Test
    public void testAddToner() {
        printer1.addToner(10);
        assertEquals(99, printer1.getToner());
    }
    @Test
    public void testCanPrintOutWithinLimits() {
        printer1.print(7, 12);
        assertEquals(5, printer1.getToner());
    }
    @Test
    public void testCantPrintOutLimitExceeded() {
        printer1.print(8, 12);
        assertEquals(89, printer1.getToner());
    }
    @Test
    public void testAddPrinterPaper() {
        printer1.addSheets(123);
        assertEquals(246, printer1.getSheets());
    }

}
