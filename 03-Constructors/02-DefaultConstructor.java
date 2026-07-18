// Demonstrates the use of a default constructor to initialize object data.

class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Displays student information
    public void display() {
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class DefaultConstructor {

    public static void main(String[] args) {

        // Create a Student object using the default constructor
        Student student = new Student();

        // Display student details
        student.display();
    }
}
