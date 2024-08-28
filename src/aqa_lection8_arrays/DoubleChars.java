package aqa_lection8_arrays;

public class DoubleChars {
    public static String doubleChars(String str) {
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result += c;
            result += c;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(doubleChars("The"));
        System.out.println(doubleChars("AAbb"));
        System.out.println(doubleChars("Hi-There123"));
    }
}
