package aqa_lection5_warmup;

public class SumUpToN {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(calculateSumUpToN(n));
    }

    public static String calculateSumUpToN(int n) {
        if (n <= 0) {
            return "Хибні вхідні параметри";
        }

        String result = "";
        for (int i = 1; i <= n; i++) {
            result += i;
            if (i < n) {
                result += " ";
            }
        }
        return result;
    }
}
