package aqa_oop_task;


public abstract class Person implements Displayable {
    private String name;
    private int age;
    private PersonRole role;


    public Person(String name, int age, PersonRole role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonRole getRole() {
        return role;
    }

    public void setRole(PersonRole role) {
        this.role = role;
    }

    public abstract void changeProfession(PersonRole newRole);

    public void displayInformation(String prefix) {
        System.out.println(prefix + " Name: " + name + ", Age: " + age + ", Role: " + role);
    }


    @Override
    public abstract void displayInformation(); // Реалізація в дочірніх класах
}
