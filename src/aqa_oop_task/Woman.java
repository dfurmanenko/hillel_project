package aqa_oop_task;


public class Woman extends Person {
    public static final String GENDER = "Female";

    public Woman(String name, int age, PersonRole role) throws InvalidPersonDataException {
        super(name, age, role);
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Role: " + getRole() + ", Gender: " + GENDER);
    }
}
