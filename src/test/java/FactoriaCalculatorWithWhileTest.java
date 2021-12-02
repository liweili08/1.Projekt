import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoriaCalculatorWithWhileTest {
    @Test
    void withWhileTest0() {
        assertEquals(1, FactoriaCalculatorWithWhile.factorialCalculatorWithWhile(0));
    }
    @Test
    void withWhileTest1() {
        assertEquals(1, FactoriaCalculatorWithWhile.factorialCalculatorWithWhile(1));
    }
    @Test
    void withWhileTest2() {
        assertEquals(2, FactoriaCalculatorWithWhile.factorialCalculatorWithWhile(2));
    }
    @Test
    void withWhileTest3() {
        assertEquals(6, FactoriaCalculatorWithWhile.factorialCalculatorWithWhile(3));
    }
}