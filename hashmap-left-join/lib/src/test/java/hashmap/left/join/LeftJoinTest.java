package hashmap.left.join;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LeftJoinTest {

    @Test
    void testLeftJoinWithValues() {
        HashMap<String, String> synonyms = new HashMap<>();
        synonyms.put("happy", "joyful");
        synonyms.put("sad", "unhappy");

        HashMap<String, String> antonyms = new HashMap<>();
        antonyms.put("happy", "sad");

        Map<String, String[]> result = LeftJoin.leftJoin(synonyms, antonyms);

        assertArrayEquals(new String[]{"joyful", "sad"}, result.get("happy"));
        assertArrayEquals(new String[]{"unhappy", null}, result.get("sad"));
    }

    @Test
    void testLeftJoinWithNoAntonyms() {
        // Arrange
        HashMap<String, String> synonyms = new HashMap<>();
        synonyms.put("happy", "joyful");

        HashMap<String, String> antonyms = new HashMap<>();

        // Act
        Map<String, String[]> result = LeftJoin.leftJoin(synonyms, antonyms);

        assertArrayEquals(new String[]{"joyful", null}, result.get("happy"));
    }

    @Test
    void testLeftJoinWithEmptySynonyms() {
        HashMap<String, String> synonyms = new HashMap<>();

        HashMap<String, String> antonyms = new HashMap<>();
        antonyms.put("happy", "sad");

        Map<String, String[]> result = LeftJoin.leftJoin(synonyms, antonyms);

        assertTrue(result.isEmpty());
    }
}
