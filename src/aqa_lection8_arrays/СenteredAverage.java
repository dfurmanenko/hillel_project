package aqa_lection8_arrays;

public class СenteredAverage {
    public static int centeredAverage(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return (sum - min - max) / (nums.length - 2);
    }

    public static void main(String[] args) {
        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }
}

