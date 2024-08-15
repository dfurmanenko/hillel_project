package aqa_lection5_warmup;

public class grade {

    public static String getGrade(int grade) {
        switch (grade) {
            case 5: return "Відмінно";
            case 4: return "Добре";
            case 3: return "Задовільно";
            case 2: return "Незадовільно";
            case 1: return "Погано";
            default: return "Неправильна оцінка";
        }
    }

    public static void main(String[] args) {
        System.out.println("getGrade(5) → \"" + getGrade(5) + "\"");
        System.out.println("getGrade(1) → \"" + getGrade(1) + "\"");
        System.out.println("getGrade(-3) → \"" + getGrade(-3) + "\"");
    }
}