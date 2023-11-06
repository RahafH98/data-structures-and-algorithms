package hashmap.repeated.word;

import java.util.HashSet;
import java.util.StringTokenizer;

public class RepeatedWordFinder {

    private static String[] splitWords(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, " ,.!?;:()[]{}");
        String[] words = new String[tokenizer.countTokens()];

        int index = 0;
        while (tokenizer.hasMoreTokens()) {
            words[index] = tokenizer.nextToken().toLowerCase(); // Convert to lowercase for case-insensitivity
            index++;
        }

        return words;
    }

    public static String findFirstRepeatedWord(String text) {
        String[] words = splitWords(text);
        HashSet<String> seenWords = new HashSet<>();

        for (String word : words) {
            if (seenWords.contains(word)) {
                return word;
            } else {
                seenWords.add(word);
            }
        }

        return null;
    }
}