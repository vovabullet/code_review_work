import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void dif() {
        assertEquals(0, calculator.dif(2, 2));
    }

    @Test
    void div() {
        assertEquals(1, calculator.div(2, 2));
    }

    @Test
    void times() {
        assertEquals(9, calculator.times(3, 3));
    }

    @Test
    void solver() {
        assertEquals(10, calculator.solver(4, 2));
    }
}