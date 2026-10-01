package unit1;
//A constructor is a special member of a class that is used to initialize objects.
public class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void study() {
        System.out.println(name + " is studying");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Niharika", 19);
        s1.display();
        s1.study();
    }
    
}
