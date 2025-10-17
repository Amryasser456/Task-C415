
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(8, calc.add(5, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calc.multiply(5, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2.5, calc.divide(5, 2));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }
}
