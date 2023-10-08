package homework_58;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Transformer1Test {
    private Transformer1 transformer1;
    private String input;

    @BeforeEach
    public void setUp() {
        transformer1 = new Transformer1();
        input = "aaa BBBB deF vbghR bbb";
    }

    @Test
    public void testTransformStringWithUpperCase() {
        WordsTransformer wordsTransformer = new WordsTransformerUpperCase();
        String result = transformer1.transformString1(input, wordsTransformer);
        assertEquals("AAA BBBB DEF vbghR BBB", result);
    }

    @Test
    public void testTransformStringWithStar() {
        WordsTransformer wordsTransformer = new WordTransformerStar();
        String result1 = transformer1.transformString1(input, wordsTransformer);
        assertEquals("aaa BBBB deF ***** bbb", result1);
    }

    @Test
    public void testTransformStringWithLowerCase() {
        WordsTransformer wordsTransformer = new WordsTransformerLowerCase();
        String result2 = transformer1.transformString1(input, wordsTransformer);
        assertEquals("aaa bbbb deF vbghR bbb", result2);
    }


}