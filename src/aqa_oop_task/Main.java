package aqa_oop_task;
public class Main {
    public static void main(String[] args) {

        Man man1 = new Man("John", 30, PersonRole.ENGINEER);
        Woman woman1 = new Woman("Anna", 25, PersonRole.DOCTOR);


        man1.displayInformation();
        woman1.displayInformation();


        man1.displayInformation("Info: ");
        woman1.displayInformation("Details: ");


        man1.changeProfession(PersonRole.TEACHER);
        man1.displayInformation();
    }
}
