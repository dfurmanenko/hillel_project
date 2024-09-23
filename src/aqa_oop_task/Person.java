package aqa_oop_task;


public abstract class Person implements Displayable {
    private String name;
    private int age;
    private PersonRole role;


    public Person(String name, int age, PersonRole role) throws InvalidPersonDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidPersonDataException("Ім'я не може бути порожнім.");
        }
        if (age < 0) {
            throw new InvalidPersonDataException("Вік не може бути негативним.");
        }
        this.name = name;
        this.age = age;
        this.role = role;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidPersonDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidPersonDataException("Ім'я не може бути порожнім.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidPersonDataException {
        if (age < 0) {
            throw new InvalidPersonDataException("Вік не може бути негативним.");
        }
        this.age = age;
    }

    public PersonRole getRole() {
        return role;
    }

    public void setRole(PersonRole role) {
        this.role = role;
    }

    public abstract void displayInformation();
}
