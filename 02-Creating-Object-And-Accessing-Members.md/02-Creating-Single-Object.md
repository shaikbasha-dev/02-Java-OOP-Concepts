
# Definition

This program shows how to create an object of a class, store values in its variables,
print those values, and call its methods.

Java Program with comments on each step


// Main class of the program
public class StudentApp {

    // Main method where program execution begins
    public static void main(String[] args) {

        // Step 1: Create an object of the Student class
        Student s = new Student();

        // Step 2: Assign a value to the name field
        s.name = "Apple";

        // Step 3: Display the name on the screen
        System.out.println("Name: " + s.name);

        // Step 4: Assign a value to the age field
        s.age = 18;

        // Step 5: Display the age on the screen
        System.out.println("Age: " + s.age);

        // Step 6: Assign a value to the gender field
        s.gender = "Male";

        // Step 7: Display the gender on the screen
        System.out.println("Gender: " + s.gender);

        // Step 8: Call the coming() method
        s.coming();

        // Step 9: Call the eat() method
        s.eat();

        // Step 10: Call the go() method
        s.go();
    }
}

// Student class with variables and methods
class Student {

    // Step 11: Declare the name variable
    String name;

    // Step 12: Declare the age variable
    int age;

    // Step 13: Declare the gender variable
    String gender;

    // Step 14: Method to show the student is coming to school
    public void comming() {
        System.out.println("Student is coming to school");
    }

    // Step 15: Method to show the student is eating food
    public void eat() {
        System.out.println("Student is eating food");
    }

    // Step 16: Method to show the student is going home
    public void go() {
        System.out.println("Student is going home");
    }
}

## Output:
Name: Apple
Age: 18
Gender: Male
Student is coming to school
Student is eating food
Student is going home

## Explanation

- `Student s = new Student();` creates a new object.
- `s.name`, `s.age`, and `s.gender` store the student's details.
- `System.out.println(...)` prints the values.
- The methods `comming()`, `eat()`, and `go()` display messages.

## Pseudocode

START
    create object s of Student
    set s.name = "Apple"
    print s.name
    set s.age = 18
    print s.age
    set s.gender = "Male"
    print s.gender
    call s.comming()
    call s.eat()
    call s.go()
END

## Code Explanation

- `public class StudentApp` is the main class.
- `main()` is the starting point of the program.
- `Student` is a user-defined class.
- Fields (`name`, `age`, `gender`) store data.
- Methods define actions.

## Important Points

- A class is a blueprint.
- An object is an instance of a class.
- `String` is used for text values.
- `int` is used for integer values.
- The method name `comming()` is spelled as written in the code.

## Summary

This program demonstrates object creation, data storage, printing values,
and calling methods in Java.


```
