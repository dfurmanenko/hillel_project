package aqa_lection5_warmup;

public class AgeChecker {
    public static String checkAge(int age) {
        if (age >= 18) {
            return "Ви доросла особа";
        } else {
            return "Ви не є дорослою особою";
        }
    }

    public static void main(String[] args) {

        System.out.println("checkAge(18) → " + checkAge(18));
        System.out.println("checkAge(0) → " + checkAge(0));
        System.out.println("checkAge(99) → " + checkAge(99));
    }
}