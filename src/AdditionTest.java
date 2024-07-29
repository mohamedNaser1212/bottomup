import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class AdditionTest {
    @Test
    public void testAdd() {
        Addition addition = new Addition();
        int reslt = addition.add(5, 3);
        assertEquals(8, reslt);
    }
}
