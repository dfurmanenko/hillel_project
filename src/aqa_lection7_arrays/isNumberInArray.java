package aqa_lection7_arrays;

public class isNumberInArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
//        int target = 35;
        int target = 30;


        System.out.println(isNumberInArray(array, target) ? "Число " + target + " присутнє в масиві." : "Число " + target + " відсутнє в масиві.");
    }

    public static boolean isNumberInArray(int[] array, int number) {
        for (int value : array) {
            if (value == number) return true;
        }
        return false;
    }
}

