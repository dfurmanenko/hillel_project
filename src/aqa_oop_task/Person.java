package aqa_oop_task;

public class Person implements Displayable {
    private String name;
    private int age;
    private PersonRole role;

    // Конструктор
    public Person(String name, int age, PersonRole role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    // Гетери та сетери
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

    // Метод для зміни професії
    public void changeProfession(PersonRole newRole) {
        this.role = newRole;
    }

    // Реалізація методу інтерфейсу для виведення інформації
    @Override
    public void displayInformation() {
        System.out.println("Name: " + name + ", Age: " + age + ", Role: " + role);
    }
}