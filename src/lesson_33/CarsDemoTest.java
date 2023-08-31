package lesson_33;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CarsDemoTest {

        Car car1 = new Car("Volvo", 2020, 30000);
        Car car2 = new Car("Toyota", 1990, 5000);
        Car car3 = new Car("Audi", 2023, 150000);
        Car car4 = new Car("Lada", 1980, 1);

        @Test
        public void sorted() {
            Car[] actual = {car1, car2, car3, car4};
            Car[] expected = {car4, car2, car1, car3};

            Arrays.sort(actual);
            assertArrayEquals(expected, actual);//assertArrayEquals
        }

        @Test
        void testCompareTo() {
            assertTrue(car1.compareTo(car2) < 0);
        }

        @Test
        void testCompareToFalse() {
            assertFalse(car1.compareTo(car2) < 0);
        }

    }
