package aqa_lection10_maps;

import java.util.HashMap;
import java.util.Map;

public class BuildResultString {

    public static String buildResultString(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            map.put(str, map.getOrDefault(str, 0) + 1);

            if (map.get(str) % 2 == 0 && map.get(str) == 2) {
                result.append(str);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(buildResultString(new String[]{"a", "b", "a"}));
        System.out.println(buildResultString(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(buildResultString(new String[]{"a", "", "a"}));
        System.out.println(buildResultString(new String[]{"a", "b", "c"}));
        System.out.println(buildResultString(new String[]{}));
        System.out.println(buildResultString(null));
    }
}
