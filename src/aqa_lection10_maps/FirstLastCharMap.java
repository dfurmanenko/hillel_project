package aqa_lection10_maps;

import java.util.HashMap;
import java.util.Map;

public class FirstLastCharMap {

    public static Map<String, String> createMap(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {

            String firstChar = str.substring(0, 1);
            String lastChar = str.substring(str.length() - 1);

            result.put(firstChar, lastChar);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strings1 = {"code", "bug"};
        String[] strings2 = {"man", "moon", "main"};
        String[] strings3 = {"man", "moon", "good", "night"};

        System.out.println(createMap(strings1));
        System.out.println(createMap(strings2));
        System.out.println(createMap(strings3));
    }
}
