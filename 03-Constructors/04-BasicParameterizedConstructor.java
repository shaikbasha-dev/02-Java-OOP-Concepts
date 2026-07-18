// Demonstrates the use of a parameterized constructor to initialize object data.

class Student {

    String name;
    int age;

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Displays student information
    public void display() {
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class BasicParameterizedConstructor {

    public static void main(String[] args) {

        // Create a Student object using the parameterized constructor
        Student student = new Student("Alice", 20);

        // Display student details
        student.display();
    }
}
