package aqa_lection8_arrays;

public class SumWithoutUnlucky13 {
    public static int sumWithoutUnlucky13(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {1, 1};
        int[] array3 = {1, 2, 2, 1, 13};
        int[] emptyArray = {};

        System.out.println(sumWithoutUnlucky13(array1));
        System.out.println(sumWithoutUnlucky13(array2));
        System.out.println(sumWithoutUnlucky13(array3));
        System.out.println(sumWithoutUnlucky13(emptyArray));
    }
}
