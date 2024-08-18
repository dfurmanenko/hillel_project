package aqa_lection_6_strings;

public class XyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        int len = str.length();
        if (len < 3) return false;

        int start1 = (len - 3) / 2;
        int start2 = start1 + 1;

        return str.substring(start1, start1 + 3).equals("xyz") ||
                str.substring(start2, start2 + 3).equals("xyz");
    }
}

