package aqa_oop_task;

public class Man extends Person {
    // Статичне, фіналізоване поле
    public static final String GENDER = "Male";

    public Man(String name, int age, PersonRole role) {
        super(name, age, role);
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Gender: " + GENDER);
    }
}