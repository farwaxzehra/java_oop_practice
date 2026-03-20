class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void displayRole() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    @Override
    void displayRole() {
        System.out.println("I am a Student: " + getName());
    }
}

class Teacher extends Person {
    @Override
    void displayRole() {
        System.out.println("I am a Teacher: " + getName());
    }
}

public class personExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Aly");

        Teacher t1 = new Teacher();
        t1.setName("Elena");

        s1.displayRole();
        t1.displayRole();
    }
}