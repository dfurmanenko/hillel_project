package aqa_oop_task;
public class Main {
    public static void main(String[] args) {
        try {
            Man man1 = new Man("John", 30, PersonRole.ENGINEER);
            Woman woman1 = new Woman("Anna", 25, PersonRole.DOCTOR);

            man1.displayInformation();
            woman1.displayInformation();


            Man man2 = new Man("", -5, PersonRole.TEACHER);
        } catch (InvalidPersonDataException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
