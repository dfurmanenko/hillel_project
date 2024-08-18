package aqa_lection_6_strings;

public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    public static String mixString(String a, String b) {
        String result = "";
        int maxLength = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) result += a.charAt(i);
            if (i < b.length()) result += b.charAt(i);
        }

        return result;
    }
}
