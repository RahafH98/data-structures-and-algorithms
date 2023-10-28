package hashtable;

import java.util.ArrayList;
import java.util.List;

public class Hashtable<K, V> {
    private static final int TABLE_SIZE = 100;
    private List<Entry<K, V>>[] table;

    public Hashtable() {
        table = new List[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new ArrayList<>();
        }
    }

    public void set(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }

        int index = hash(key);
        List<Entry<K, V>> bucket = table[index];
        Entry<K, V> entry = findEntry(key, bucket);

        if (entry != null) {
            entry.setValue(value);
        } else {
            bucket.add(new Entry<>(key, value));
        }
    }

    public V get(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }

        int index = hash(key);
        List<Entry<K, V>> bucket = table[index];
        Entry<K, V> entry = findEntry(key, bucket);

        return entry != null ? entry.getValue() : null;
    }

    public boolean has(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null.");
        }

        int index = hash(key);
        List<Entry<K, V>> bucket = table[index];
        Entry<K, V> entry = findEntry(key, bucket);

        return entry != null;
    }

    public List<K> keys() {
        List<K> keys = new ArrayList<>();
        for (List<Entry<K, V>> bucket : table) {
            for (Entry<K, V> entry : bucket) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public int hash(K key) {
        return Math.abs(key.hashCode()) % TABLE_SIZE;
    }

    private Entry<K, V> findEntry(K key, List<Entry<K, V>> bucket) {
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry;
            }
        }
        return null;
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }

        void setValue(V value) {
            this.value = value;
        }
    }
}

