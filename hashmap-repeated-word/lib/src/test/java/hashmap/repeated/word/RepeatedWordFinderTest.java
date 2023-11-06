package hashmap.repeated.word;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RepeatedWordFinderTest {
    @Test
    public void testPunctuation() {
        String text = "This is a test. This is only a test!";
        String expected = "this";

        String repeatedWord = RepeatedWordFinder.findFirstRepeatedWord(text);
        assertEquals(expected, repeatedWord);
    }

    @Test
    public void testNoRepeatedWords() {
        String text = "This is a simple test with no repeated words.";
        String expected = null;

        String repeatedWord = RepeatedWordFinder.findFirstRepeatedWord(text);
        assertEquals(expected, repeatedWord);
    }

    @Test
    public void testMixedCase() {
        String text = "This is a test. this is only a test!";
        String expected = "this";

        String repeatedWord = RepeatedWordFinder.findFirstRepeatedWord(text);
        assertEquals(expected, repeatedWord);
    }

    @Test
    public void testWithPunctuation() {
        String text = "The quick brown fox jumps over the lazy dog. It's a sunny day!";
        String expected = "the";

        String repeatedWord = RepeatedWordFinder.findFirstRepeatedWord(text);
        assertEquals(expected, repeatedWord);
    }

}
