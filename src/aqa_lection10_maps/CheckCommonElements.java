package aqa_lection10_maps;

import java.util.LinkedHashSet;

public class CheckCommonElements {

    public static boolean hasCommonElement(LinkedHashSet<Integer> setA, LinkedHashSet<Integer> setB) {
        for (Integer element : setA) {
            if (setB.contains(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedHashSet<Integer> setA = new LinkedHashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        LinkedHashSet<Integer> setB = new LinkedHashSet<>();
        setB.add(3);
        setB.add(5);
        setB.add(6);

        boolean result = hasCommonElement(setA, setB);
        System.out.println("Has common element: " + result);
    }
}

