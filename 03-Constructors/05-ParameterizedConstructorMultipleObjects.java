// Demonstrates creating multiple objects using a parameterized constructor.

class Person {

    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Displays person information
    public void display() {
        System.out.println("Person Details");
        System.out.println("--------------");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class ParameterizedConstructorMultipleObjects {

    public static void main(String[] args) {

        // Create the first Person object
        Person firstPerson = new Person("Rahul", 21);

        // Create the second Person object
        Person secondPerson = new Person("Meera", 19);

        // Display first person's details
        firstPerson.display();

        System.out.println();

        // Display second person's details
        secondPerson.display();
    }
}
