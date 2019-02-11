import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;
    @Before
    public void before() {
        calc = new Calculator();
    }
    @Test
    public void canAdd(){
        assertEquals(9, calc.add(4,5));
    }
    @Test
    public void canSubtract() {
        assertEquals(23, calc.subtract(27, 4));
    }
    @Test
    public void canMultiply(){
        assertEquals(77, calc.multiply(7,11));
    }
    @Test
    public void canDivide() {
        assertEquals(15.00, calc.divide(60, 4), 0.01);
    }
    @Test
    public void canDivideByZero() {
        assertEquals(0.00, calc.divide(16, 0), 0.01);
    }
}
