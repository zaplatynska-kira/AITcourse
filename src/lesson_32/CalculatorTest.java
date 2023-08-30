package lesson_32;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should be correct")
    void testMyltiplay() {
        assertEquals(20, calculator.myltiplay(4, 5));
    }

    @Test
    @DisplayName("Check correct of 0 ")
    void testMyltiplayZero() {
        assertEquals(5,0);
        assertEquals(5,0);
    }
}