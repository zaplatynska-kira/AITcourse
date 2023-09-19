package homework_46;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SolutionTest {


    @Test
    void areBracketsCorrect() {
        Solution solution=new Solution();
        char[]bracketsCorrect= "{}([])".toCharArray();
        assertTrue(solution.areBracketsCorrect(bracketsCorrect));
    }

@Test
    void areBracketsNoCorrect() {
        Solution solution=new Solution();
        char[]bracketsNoCorrect= "{}([])(".toCharArray();
        assertFalse(solution.areBracketsCorrect(bracketsNoCorrect));
    }
}