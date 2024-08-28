package aqa_lection8_arrays;

public class CountCode {
    public static int countCode(String str) {
        int count = 0;


        for (int i = 0; i <= str.length() - 4; i++) {
            String substring = str.substring(i, i + 4);
            if (substring.startsWith("co") && substring.endsWith("e")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
    }
}
