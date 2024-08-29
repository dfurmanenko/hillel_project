package aqa_lection8_arrays;

public class StringEndsWith {
    public static boolean endsWith(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }

    public static void main(String[] args) {
        System.out.println(endsWith("AbC", "HiaBc"));
        System.out.println(endsWith("abc", "abXabc"));
        System.out.println(endsWith("Hiabc", "abc"));
        System.out.println(endsWith("asd123", "abasdc"));
    }
}
