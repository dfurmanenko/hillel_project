package aqa_lection9_collections;

import java.util.ArrayList;
import java.util.List;

public class Name {
    public static void main(String[] args) {
        List<String> fullName = new ArrayList<>();

        fullName.add("Дмитро");
        fullName.add("Фурманенко");
        fullName.add("Вадимович");

        for (String namePart : fullName) {
            System.out.println(namePart);
        }
    }
}
