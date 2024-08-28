package aqa_lection8_arrays;

public class countEvenInts {
    public static void main(String[] args) {
        int[] numbers1 = {2, 1, 2, 3, 4};
        int[] numbers2 = {2, 2, 0};
        int[] numbers3 = {1, 3, 5};

        System.out.println(countEvenInts(numbers1));
        System.out.println(countEvenInts(numbers2));
        System.out.println(countEvenInts(numbers3));
    }

    public static int countEvenInts(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
