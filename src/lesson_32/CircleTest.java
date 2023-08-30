package lesson_32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
//given ______when_________then
    //  givenRadius_whenFindArea_thenReturnArea

    @Test
    public void givenRadius1_whenFindArea_thenReturnArea3_14() {
        double actualAria = Circle.findArea(1d);
        double expectedArea = Math.PI;
        assertEquals(expectedArea, actualAria);// что ожидаем

    }
@Test
    public void givenAandB_whenCompare_thenReturnBoolean() {
        assertTrue(Circle.compareNumbers(5, 3));
    }

    @Test
    public  void  givenTreeAndZero_whenCompare_thenReturnTru(){
        assertTrue(Circle.compareNumbers(0,3));
    }
    @Test
    public  void givenThreeLessThanZero_whenResultFalse_thenReturnTrue(){
        assertFalse(3<0);
        assertFalse(Circle.compareNumbers(0,3));
    }
}