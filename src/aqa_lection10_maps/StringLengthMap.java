package aqa_lection10_maps;

import java.util.HashMap;
import java.util.Map;

public class StringLengthMap {

    public static Map<String, Integer> getLengthOfStrings(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {
            result.put(str, str.length());
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strings1 = {"a", "bb", "a", "bb"};
        String[] strings2 = {"this", "and", "that", "and"};
        String[] strings3 = {"code", "code", "code", "bug"};

        System.out.println(getLengthOfStrings(strings1));
        System.out.println(getLengthOfStrings(strings2));
        System.out.println(getLengthOfStrings(strings3));
    }
}
