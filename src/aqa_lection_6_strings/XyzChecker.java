package aqa_lection_6_strings;

public class XyzChecker {
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }

    public static boolean xyzThere(String str) {
        return str.contains("xyz") && !str.contains(".xyz");
    }
}
