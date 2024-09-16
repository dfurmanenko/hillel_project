package aqa_oop_task;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класу Man і Woman
        Man man1 = new Man("John", 30, PersonRole.ENGINEER);
        Woman woman1 = new Woman("Anna", 25, PersonRole.DOCTOR);

        // Виведення інформації
        man1.displayInformation();
        woman1.displayInformation();

        // Зміна професії
        man1.changeProfession(PersonRole.TEACHER);
        man1.displayInformation();  // Виведення оновленої інформації
    }
}
