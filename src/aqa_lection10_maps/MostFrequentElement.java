package aqa_lection10_maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentElement {

    public static int findMostFrequent(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int mostFrequent = numbers.get(0);
        int maxCount = 0;

        for (int number : numbers) {
            int count = frequencyMap.getOrDefault(number, 0) + 1;
            frequencyMap.put(number, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = number;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 2, 2, 1, 2, 3, 3, 3);
        System.out.println("Most frequent element: " + findMostFrequent(numbers));
    }
}
