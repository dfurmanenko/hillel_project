package aqa_oop_task;


public class Woman extends Person {
    public static final String GENDER = "Female";

    public Woman(String name, int age, PersonRole role) {
        super(name, age, role);
    }

    @Override
    public void changeProfession(PersonRole newRole) {
        setRole(newRole);
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Role: " + getRole());
        System.out.println("Gender: " + GENDER);
    }

    public void displayInformation(String prefix) {
        super.displayInformation(prefix);
        System.out.println(prefix + " Gender: " + GENDER);
    }
}

