package aqa_lection10_maps;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {

            if (wordCount.containsKey(word)) {

                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String[] words1 = {"a", "b", "a", "c", "b"};
        String[] words2 = {"c", "b", "a"};
        String[] words3 = {"c", "c", "c", "c"};

        System.out.println(countWords(words1));
        System.out.println(countWords(words2));
        System.out.println(countWords(words3));
    }
}
