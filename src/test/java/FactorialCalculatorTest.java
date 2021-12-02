import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    @Test
    void FCTest0() {
        assertEquals(1,FactorialCalculator.factorialCalculator(0));
    }
    @Test
    void FCTest1() {
    assertEquals(1,FactorialCalculator.factorialCalculator(1));
    }
    @Test
    void FCTest2() {
        assertEquals(2,FactorialCalculator.factorialCalculator(2));
    } @Test
    void FCTest3() {
        assertEquals(6,FactorialCalculator.factorialCalculator(3));
    } @Test
    void FCTest4() {
        assertEquals(24,FactorialCalculator.factorialCalculator(4));
    }
}