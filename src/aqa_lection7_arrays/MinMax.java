package aqa_lection7_arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {10, 20, -5, 30, 50, 0};
        int max = findMax(numbers);
        int min = findMin(numbers);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Мінімальне значення: " + min);
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
