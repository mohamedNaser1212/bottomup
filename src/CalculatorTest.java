import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);

        // Assert the result is as expected
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 2);

        // Assert the result is as expected
        assertEquals(3, result);
    }
}
