package aqa_lection9_collections;


import java.util.HashSet;
        import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(3);
        numbers.add(14);
        numbers.add(15);
        numbers.add(92);
        numbers.add(6);
        numbers.add(15);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
