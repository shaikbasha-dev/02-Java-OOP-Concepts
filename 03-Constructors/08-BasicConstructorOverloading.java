// Demonstrates constructor overloading using both a no-argument
// constructor and a parameterized constructor.

class Student {

    String name;
    int age;

    // No-argument constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

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

public class BasicConstructorOverloading {

    public static void main(String[] args) {

        // Create an object using the no-argument constructor
        Student firstStudent = new Student();

        // Create an object using the parameterized constructor
        Student secondStudent = new Student("Alice", 20);

        // Display details of the first student
        firstStudent.display();

        System.out.println();

        // Display details of the second student
        secondStudent.display();
    }
}
