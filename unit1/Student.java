package unit1;
public class Student {

    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Niharika";
        s1.age = 19;

        s1.display();
        s1.study();
    }
}