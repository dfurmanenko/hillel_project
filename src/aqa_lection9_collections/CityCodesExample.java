package aqa_lection9_collections;

import java.util.HashMap;
import java.util.Map;

public class CityCodesExample {
    public static void main(String[] args) {

        Map<String, String> cityCodes = new HashMap<>();


        cityCodes.put("Київ", "044");
        cityCodes.put("Харків", "057");
        cityCodes.put("Одеса", "048");
        cityCodes.put("Львів", "032");
        cityCodes.put("Дніпро", "056");


        for (Map.Entry<String, String> entry : cityCodes.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
