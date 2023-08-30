package lesson_32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberTest {

    /*test cases
    1. массив пустой
    2. в массиве один элемент
    3. в массиве два элемента
    4. в массиве из нескольких  элементов, максимальный первый находится в середине
    5. в массиве из нескольких  элементов, максимальный последний

     */
    private MaxNumber m = new MaxNumber();

    @Test
    public void zeroElt_test() {
        int[] actual = {};
        assertEquals(-1, m.findMax(actual));
    }

    @Test
    public void oneElt_test() {
        int[] actual = {2};
        assertEquals(2, m.findMax(actual));

    }

    @Test
    public void twoElt_test() {
        int[] actual = {2, 2};
        assertEquals(2, m.findMax(actual));
    }

    @Test
    public void severalElt_middle_test() {
        int[] actual = {2, 4, 7, 9, 3, 1, 5};
        assertEquals(9, m.findMax(actual));
    }
@Test
    public void severalElt_end_test() {
        int[] actual = {2, 4, 7, 9, 3, 1, 5, 13};
        assertEquals(13, m.findMax(actual));
    }
}