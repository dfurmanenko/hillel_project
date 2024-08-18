package aqa_lection_6_strings;


public class RepeatEnd {
    public static String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        return end.repeat(n);
    }

    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }
}
