package hashtable;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashtableTest {
    @Test
    void testSetAndGet() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("name", 30);
        assertEquals(30, hashtable.get("name"));
    }

    @Test
    void testGetNonExistentKey() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        assertNull(hashtable.get("age"));
    }

    @Test
    void testHasKey() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("name", 30);
        assertTrue(hashtable.has("name"));
        assertFalse(hashtable.has("age"));
    }

    @Test
    void testKeys() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("name", 30);
        hashtable.set("age", 40);
        hashtable.set("city", 50);
        assertEquals(3, hashtable.keys().size());
        assertTrue(hashtable.keys().contains("name"));
        assertTrue(hashtable.keys().contains("age"));
        assertTrue(hashtable.keys().contains("city"));
    }

    @Test
    void testCollision() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.set("name", 30);
        hashtable.set("eman", 40); // Collision with "name"
        assertEquals(30, hashtable.get("name"));
        assertEquals(40, hashtable.get("eman"));
    }

    @Test
    void testHashInRange() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        int hash = hashtable.hash("name");
        assertTrue(hash >= 0 && hash < 100);
    }

    @Test
    void testNullKey() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        assertThrows(IllegalArgumentException.class, () -> hashtable.set(null, 42));
        assertThrows(IllegalArgumentException.class, () -> hashtable.get(null));
        assertThrows(IllegalArgumentException.class, () -> hashtable.has(null));
    }
}
