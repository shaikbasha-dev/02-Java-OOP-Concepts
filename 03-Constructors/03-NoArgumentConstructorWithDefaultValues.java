// Demonstrates a no-argument constructor that initializes object data with default values.

class Person {

    String name;
    int id;

    // No-argument constructor
    Person() {
        name = "Anonymous";
        id = 101;
    }

    // Displays person information
    public void display() {
        System.out.println("Person Details");
        System.out.println("--------------");
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

public class NoArgumentConstructorWithDefaultValues {

    public static void main(String[] args) {

        // Create a Person object using the no-argument constructor
        Person person = new Person();

        // Display person details
        person.display();
    }
}
