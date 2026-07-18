// Demonstrates creating a single object and accessing its data members and methods.

public class CreatingSingleObject {

    public static void main(String[] args) {

        // Create a Student object
        Student student = new Student();

        // Assign values to data members
        student.name = "Apple";
        student.age = 18;
        student.gender = "Male";

        // Display student information
        System.out.println("Name   : " + student.name);
        System.out.println("Age    : " + student.age);
        System.out.println("Gender : " + student.gender);

        // Invoke student behaviors
        student.coming();
        student.eat();
        student.go();
    }
}

// Represents a student with basic attributes and behaviors.
class Student {

    String name;
    int age;
    String gender;

    public void coming() {
        System.out.println("Student is coming to school.");
    }

    public void eat() {
        System.out.println("Student is eating food.");
    }

    public void go() {
        System.out.println("Student is going home.");
    }
}
