Interface:

The major use of an Interface is to provide a class the ability to achieve multiple inheritance in Java.
Hence in Java multiple inheritance can be achieved with the help of Interface.
Interface can also act like service requirement specification (SRS) & help us to achieve standardization of code.

Basic calculator program without using Interface concept:
class Calculator {
    public void add() {
        int a = 10;
        int b = 20;
        System.out.println("Addition Result: " + (a+b));
    }
    public void sub() {
        int a = 20;
        int b = 10;
        System.out.println("Substraction Result: " + (a-b));
    }
}

class Demo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add();
        c.sub();
    }
}

Here is the output of the Java program:

```text
Addition Result: 30
Substraction Result: 10

```

### Why this is the output:

* **Execution Starts at `main**`: The JVM begins execution in the `Demo` class inside the `main` method.
* **Object Creation**: `Calculator c = new Calculator();` creates a new instance of the `Calculator` class.
* **Method Calls**:
* `c.add();` calls the `add` method, which initializes $a = 10$ and $b = 20$, calculates $10 + 20$, and prints `Addition Result: 30`.
* `c.sub();` calls the `sub` method, which initializes $a = 20$ and $b = 10$, calculates $20 - 10$, and prints `Substraction Result: 10` (preserving the exact spelling used in your `System.out.println` statement).

Basic calculator program with using Interface concept:

import java.util.Scanner;

// This interface defines the common behavior for all calculator classes.
// Every calculator class must provide add() and sub() methods.
interface Calculator {
    void add();
    void sub();
}

// Calci1 uses direct initialization of values inside the method.
class Calci1 implements Calculator {
    // This method adds two fixed numbers and prints the result.
    public void add() {
        int a = 10;      // First fixed number
        int b = 20;      // Second fixed number
        int sum = a + b; // Calculate sum
        System.out.println("Sum: " + sum); // Print the result
    }

    // This method subtracts two fixed numbers and prints the result.
    public void sub() {
        int a = 10;      // First fixed number
        int b = 20;      // Second fixed number
        int sub = b - a; // Calculate subtraction
        System.out.println("Sub: " + sub); // Print the result
    }
}

// Calci2 uses declaration first and then assignment.
class Calci2 implements Calculator {
    // This method declares variables first and then assigns values.
    public void add() {
        int a;   // Declare first number
        int b;   // Declare second number
        a = 10;  // Assign first number
        b = 20;  // Assign second number
        int sum = a + b; // Calculate sum
        System.out.println("Sum: " + sum); // Print the result
    }

    // This method also declares variables first and then assigns values.
    public void sub() {
        int a;   // Declare first number
        int b;   // Declare second number
        a = 10;  // Assign first number
        b = 20;  // Assign second number
        int sub = b - a; // Calculate subtraction
        System.out.println("Sub: " + sub); // Print the result
    }
}

// Calci3 takes user input from the keyboard.
class Calci3 implements Calculator {
    // This method asks the user to enter two numbers and prints their sum.
    public void add() {
        Scanner sc = new Scanner(System.in); // Create scanner object
        System.out.print("Please enter first number: ");
        int a = sc.nextInt(); // Read first number from user
        System.out.println();
        System.out.print("Please enter second number: ");
        int b = sc.nextInt(); // Read second number from user
        System.out.println();
        int sum = a + b; // Calculate sum
        System.out.println("Sum: " + sum); // Print the result
    }

    // This method asks the user to enter two numbers and prints subtraction.
    public void sub() {
        Scanner sc = new Scanner(System.in); // Create scanner object
        System.out.print("Please enter first number: ");
        int a = sc.nextInt(); // Read first number from user
        System.out.println();
        System.out.print("Please enter second number: ");
        int b = sc.nextInt(); // Read second number from user
        System.out.println();
        int sub = a - b; // Calculate subtraction
        System.out.println("Substraction: " + sub); // Print the result
    }
}

// This is the main class that runs the program.
public class BasicCalculator {
    public static void main(String[] args) {
        // Step 1: Create object of Calci1 and call its methods.
        Calci1 c1 = new Calci1();
        c1.add();
        c1.sub();

        // Step 2: Create object of Calci2 and call its methods.
        Calci2 c2 = new Calci2();
        c2.add();
        c2.sub();

        // Step 3: Create object of Calci3 and call its methods.
        Calci3 c3 = new Calci3();
        c3.add();
        c3.sub();
    }
}

/*
PSEUDOCODE:
1. Start the program.
2. Define an interface named Calculator with add() and sub() methods.
3. Create class Calci1 that implements Calculator.
4. In Calci1.add(), store 10 and 20, calculate their sum, and display it.
5. In Calci1.sub(), store 10 and 20, calculate b - a, and display it.
6. Create class Calci2 that also implements Calculator.
7. In Calci2.add(), declare variables first, assign values, calculate sum, and display it.
8. In Calci2.sub(), declare variables first, assign values, calculate difference, and display it.
9. Create class Calci3 that reads values from user input.
10. In Calci3.add(), ask for two numbers, read them, calculate sum, and display it.
11. In Calci3.sub(), ask for two numbers, read them, calculate difference, and display it.
12. In the main class, create objects of all three classes.
13. Call add() and sub() methods for each object.
14. End the program.
*/

/*
SUMMARY:
This program demonstrates how to use an interface in Java.
It shows three different ways to perform addition and subtraction.
Calci1 uses direct values, Calci2 uses declared variables, and Calci3 takes input from the user.
The main method runs all examples one by one.
*/

Basic calculator program with using Two Interfaces:

import java.util.Scanner;

interface Calci1 {
    void add();
    void sub();
}

interface Calci2 {
    void mul();
    void sub();
}

class Calculator implements Calci1, Calci2 {
    public void add() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public void sub() {
        int a = 10;
        int b = 20;
        int sub = b - a;
        System.out.println("Sub: " + sub);
    }

    public void mul() {
        int a = 10;
        int b = 20;
        int mul = a * b;
        System.out.println("Mul: " + mul); // Fixed label
    }

    public void div() {
        int a = 10;
        int b = 20;
        int div = b / a;
        System.out.println("Div: " + div); // Fixed label
    }
}

public class App {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
    }
}

output:
Sum: 30
Sub: 10
Mul: 200
Div: 2
