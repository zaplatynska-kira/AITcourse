package homework_44;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramFinderTest {

    @Test
    public void findAnagrams() {
        AnagramFinder anagramFinder = new AnagramFinder();
        List<String> input = Arrays.asList("john", "ann", "bill", "nan", "nna", "llbi", "ohnj");
        List<String> result1 = anagramFinder.findAnagrams("ann", input);
        assertTrue(result1.contains("nan"));
    }


    @Test
        public void findNoAnagrams(){
        AnagramFinder anagramFinder1 = new AnagramFinder();
        List<String> input1 = Arrays.asList("john", "ann", "bill", "nan", "nna", "llbi", "ohnj");
        List<String> result2 = anagramFinder1.findAnagrams("ann", input1);
        assertFalse(result2.contains("bill"));
    }

}
