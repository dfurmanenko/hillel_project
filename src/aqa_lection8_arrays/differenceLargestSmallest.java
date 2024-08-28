package aqa_lection8_arrays;


public class differenceLargestSmallest {
    public static int differenceLargestSmallest(int[] nums) {

        int min = nums[0];
        int max = nums[0];


        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }


        return max - min;
    }

    public static void main(String[] args) {
        int[] array1 = {10, 3, 5, 6};
        int[] array2 = {7, 2, 10, 9};
        int[] array3 = {2, 10, 7, 2};

        System.out.println(differenceLargestSmallest(array1));
        System.out.println(differenceLargestSmallest(array2));
        System.out.println(differenceLargestSmallest(array3));
    }
}

