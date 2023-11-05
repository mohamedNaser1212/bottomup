import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class SubtractionTest {
    @Test
    public void testSubtract() {
        Subtraction subtraction = new Subtraction();
        int result = subtraction.subtract(5, 3);
        assertEquals(2, result);
    }
}