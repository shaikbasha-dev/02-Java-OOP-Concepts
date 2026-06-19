Hybrid Inheritance in Java

Definition
Hybrid inheritance is a combination of two or more types of inheritance.
In Java, hybrid inheritance is usually achieved using classes and interfaces together.

Why this concept is used
- It helps in combining the benefits of different inheritance models.
- It allows flexible design of real-world systems.
- It reduces code duplication.
- It supports modular and reusable code.

How this helps Java programming
- Makes design more flexible.
- Helps in combining multiple behaviors in one program.
- Supports abstraction and object-oriented modeling.
- Makes code easier to extend.

Important theory
- A class can extend only one class.
- A class can implement multiple interfaces.
- Hybrid inheritance is commonly implemented using a mix of class inheritance and interface inheritance.
- This is one of the reasons Java avoids direct multiple class inheritance.

Example idea
- Animal is a base class.
- Bird extends Animal.
- Bird implements CanFly.
- Sparrow extends Bird.

Program 1: Hybrid Inheritance Example

Code:

interface CanFly {
    void fly();
}

class Animal {
    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Bird extends Animal implements CanFly {
    public void fly() {
        System.out.println("Bird flies");
    }
}

class Sparrow extends Bird {
    public void sing() {
        System.out.println("Sparrow sings");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.eat();
        s.fly();
        s.sing();
    }
}

Line-by-line explanation with comments

interface CanFly {                      // Line 1: Declares interface CanFly
    void fly();                          // Line 2: Declares abstract fly() method
}                                       // Line 3: Ends interface CanFly

class Animal {                          // Line 4: Declares base class Animal
    public void eat() {                  // Line 5: Declares eat() method
        System.out.println("Animal eats food"); // Line 6: Prints message
    }                                    // Line 7: Ends eat() method
}                                        // Line 8: Ends Animal class

class Bird extends Animal implements CanFly { // Line 9: Bird inherits Animal and implements CanFly
    public void fly() {                  // Line 10: Defines fly() method
        System.out.println("Bird flies"); // Line 11: Prints fly message
    }                                    // Line 12: Ends fly() method
}                                        // Line 13: Ends Bird class

class Sparrow extends Bird {            // Line 14: Sparrow inherits Bird
    public void sing() {                 // Line 15: Defines sing() method
        System.out.println("Sparrow sings"); // Line 16: Prints sing message
    }                                    // Line 17: Ends sing() method
}                                        // Line 18: Ends Sparrow class

public class HybridInheritanceDemo {    // Line 19: Main class declaration
    public static void main(String[] args) { // Line 20: Main method starts execution
        Sparrow s = new Sparrow();       // Line 21: Creates Sparrow object
        s.eat();                         // Line 22: Calls eat() from Animal
        s.fly();                         // Line 23: Calls fly() from Bird via interface implementation
        s.sing();                        // Line 24: Calls sing() from Sparrow
    }                                    // Line 25: Ends main method
}                                        // Line 26: Ends class

Why this program is used
This program is used to show that inheritance can be combined in a smart way.
It demonstrates how one class can inherit from another class and also use behavior from an interface.

How this program helps in Java learning
- Shows how hybrid inheritance is modeled in Java.
- Explains the use of both class inheritance and interface inheritance.
- Helps students understand flexible OOP design.

Pseudocode
START
    CREATE interface CanFly
    DECLARE fly()

    CREATE class Animal
    DEFINE eat()

    CREATE class Bird extends Animal implements CanFly
    DEFINE fly()

    CREATE class Sparrow extends Bird
    DEFINE sing()

    CREATE main method
    CREATE object of Sparrow
    CALL eat()
    CALL fly()
    CALL sing()
END

Output
Animal eats food
Bird flies
Sparrow sings

Summary
Hybrid inheritance combines different types of inheritance.
In Java, this is usually done by combining class inheritance with interface inheritance.
This example shows how a Sparrow object can use methods from Animal, Bird, and the CanFly interface.

Important note
Java does not support multiple inheritance directly through classes, but hybrid inheritance is still possible using interfaces.

Diagram explanation

Animal
   |
   | extends
   v
Bird
   |
   | extends
   v
Sparrow

Bird also implements
CanFly

Visual structure
Animal
  |
  +----> Bird ---- implements ----> CanFly
              |
              +----> Sparrow

Simple flow diagram
Start
  |
  v
Create Sparrow object
  |
  v
Call eat() from Animal
  |
  v
Call fly() from Bird / CanFly
  |
  v
Call sing() from Sparrow
  |
  v
End

One-line definition
Hybrid inheritance is a combination of different inheritance types, often achieved with classes and interfaces together.
