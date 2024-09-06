package aqa_oop_task;

class Person {
    // Поля класу
    private String name;
    private int age;
    private String profession;

    // Конструктор класу
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Гетери
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    // Сетери
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    // Метод для виведення інформації про особу
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession);
    }

    // Метод для зміни професії
    public void changeProfession(String newProfession) {
        this.profession = newProfession;
    }

    public static void main(String[] args) {
        // Створення об'єктів класу Person
        Person person1 = new Person("John", 30, "Engineer");
        Person person2 = new Person("Alice", 25, "Doctor");
        Person person3 = new Person("Bob", 40, "Teacher");

        // Виведення інформації про осіб
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        // Зміна професії для однієї особи
        person1.changeProfession("Manager");

        // Виведення оновленої інформації про особу
        System.out.println("Updated Information:");
        person1.displayInfo();
    }
}
