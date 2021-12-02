import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void shouldCalculateTwo() {
        assertEquals(108, Main.addition(9, 99));
        assertTrue(Main.addition(9, 99)>100);
        assertTrue(Main.addition(51, 2)<50);
    }



}