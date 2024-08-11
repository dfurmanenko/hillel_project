package aqa_lection4;

public class PowerCalculator {
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int result = power(a, b);
        System.out.println(a + " піднесене до степеня " + b + " дорівнює: " + result);
    }
}
