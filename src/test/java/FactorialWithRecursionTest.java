import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialWithRecursionTest {
    @Test
    void withRecursionTest0() {
        assertEquals(1, FactorialWithRecursion.factorialWithRecursion(0));
    }
    @Test
    void withRecursionTest1() {
        assertEquals(1, FactorialWithRecursion.factorialWithRecursion(1));
    }
    @Test
    void withRecursionTest2() {
        assertEquals(2, FactorialWithRecursion.factorialWithRecursion(2));
    }
    @Test
    void withRecursionTest3() {
        assertEquals(6, FactorialWithRecursion.factorialWithRecursion(3));
    }
    @Test
    void withRecursionTest4() {
        assertEquals(24, FactorialWithRecursion.factorialWithRecursion(4));
    }
}