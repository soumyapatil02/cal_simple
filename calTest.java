import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class calTest {

    @Test
    void testAddition() {
        assertEquals(15.0, cal.calculate(10, 5, '+'));
    }

    @Test
    void testSubtraction() {
        assertEquals(5.0, cal.calculate(10, 5, '-'));
    }

    @Test
    void testMultiplication() {
        assertEquals(50.0, cal.calculate(10, 5, '*'));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, cal.calculate(10, 5, '/'));
    }

    @Test
    void testDivisionByZero() {
        Exception ex = assertThrows(
            IllegalArgumentException.class,
            () -> cal.calculate(10, 0, '/')
        );
        assertEquals("Division by zero", ex.getMessage());
    }
}
