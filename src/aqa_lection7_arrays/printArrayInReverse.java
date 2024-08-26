package aqa_lection7_arrays;

public class printArrayInReverse {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 400, 40, 100};
        printArrayInReverse(numbers);
    }

    public static void printArrayInReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
