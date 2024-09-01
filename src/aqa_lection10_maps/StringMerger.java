package aqa_lection10_maps;

import java.util.HashMap;
import java.util.Map;

public class StringMerger {

    public static Map<String, String> mergeStringsByFirstChar(String[] strings) {

        Map<String, String> resultMap = new HashMap<>();

        for (String str : strings) {
            if (str != null && !str.isEmpty()) {

                String firstChar = String.valueOf(str.charAt(0));


                if (resultMap.containsKey(firstChar)) {

                    resultMap.put(firstChar, resultMap.get(firstChar) + str);
                } else {

                    resultMap.put(firstChar, str);
                }
            }
        }

        return resultMap;
    }

    public static void main(String[] args) {
        String[] strings1 = {"salt", "tea", "soda", "toast"};
        String[] strings2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[] strings3 = {};

        System.out.println(mergeStringsByFirstChar(strings1));
        System.out.println(mergeStringsByFirstChar(strings2));
        System.out.println(mergeStringsByFirstChar(strings3));
    }
}
