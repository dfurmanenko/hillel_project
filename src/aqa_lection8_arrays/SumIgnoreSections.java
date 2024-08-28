package aqa_lection8_arrays;

public class SumIgnoreSections {
    public static int sumIgnoreSections(int[] nums) {
        int sum = 0;
        boolean ignoreSection = false;

        for (int num : nums) {
            if (num == 6) {
                ignoreSection = true;
            }

            if (!ignoreSection) {
                sum += num;
            }

            if (ignoreSection && num == 7) {
                ignoreSection = false;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumIgnoreSections(new int[]{1, 2, 2}));
        System.out.println(sumIgnoreSections(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(sumIgnoreSections(new int[]{1, 1, 6, 7, 2}));
    }
}
