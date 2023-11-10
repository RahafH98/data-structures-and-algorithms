package hashmap.left.join;

import java.util.HashMap;
import java.util.Map;

public class LeftJoin {

    public static Map<String, String[]> leftJoin(HashMap<String, String> synonyms, HashMap<String, String> antonyms) {
        Map<String, String[]> result = new HashMap<>();

        for (Map.Entry<String, String> entry : synonyms.entrySet()) {
            String key = entry.getKey();
            String synonym = entry.getValue();
            String antonym = antonyms.getOrDefault(key, null);

            result.put(key, new String[]{synonym, antonym});
        }

        return result;
    }
}

