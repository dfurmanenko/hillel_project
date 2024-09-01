package aqa_lection9_collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(14);
        numbers.add(15);
        numbers.add(92);
        numbers.add(6);


        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
