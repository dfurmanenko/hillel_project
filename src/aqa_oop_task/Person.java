package aqa_oop_task;

class Person {

    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession);
    }

    public void changeProfession(String newProfession) {
        this.profession = newProfession;
    }

    public static void main(String[] args) {

        Person person1 = new Person("John", 30, "Engineer");
        Person person2 = new Person("Alice", 25, "Doctor");
        Person person3 = new Person("Bob", 40, "Teacher");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();


        person1.changeProfession("Manager");


        System.out.println("Updated Information:");
        person1.displayInfo();
    }
}
