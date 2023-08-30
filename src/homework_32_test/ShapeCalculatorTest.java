package homework_32_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    @Test
    void testTotalSquare() {
        Shape[] shapes = new Shape[]{
                new Circle(4),
                new Rectangle(10, 10),
        };
        ShapeCalculator m = new ShapeCalculator();
        double actual =m.totalSquare(shapes);
        double expected = 150;
        assertEquals(expected,actual);
    }
}
