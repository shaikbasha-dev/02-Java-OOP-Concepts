Single Inheritance in Java

Definition
Single inheritance means that one class can inherit from only one parent class.
In Java, a child class can extend exactly one superclass.

Why this concept is used
- It helps in reusing code from a parent class.
- It reduces duplicate code.
- It makes programs easier to understand and maintain.
- It represents real-world relationships in a clear way.

How this helps Java programming
- Avoids writing the same logic again and again.
- Keeps the code organized.
- Helps in building a structured class hierarchy.
- Makes future updates easier because changes in the parent class affect all child classes.

Important theory
- Parent class or Superclass: the class being inherited from.
- Child class or Subclass: the class that inherits from another class.
- Keyword used: extends
- In single inheritance, one child class can have only one parent.

Example idea
- Animal is the parent class.
- Dog is the child class.
- Dog inherits features from Animal.

Program 1: Single Inheritance Example

Code:

class Animal {
    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

Line-by-line explanation with comments

class Animal {                           // Line 1: Creates the parent class named Animal
    public void eat() {                  // Line 2: Creates a method eat() in Animal
        System.out.println("Animal eats food"); // Line 3: Prints message when eat() is called
    }                                    // Line 4: Ends the eat() method
}                                        // Line 5: Ends the Animal class

class Dog extends Animal {               // Line 6: Creates Dog class and makes it inherit Animal
    public void bark() {                 // Line 7: Creates bark() method in Dog
        System.out.println("Dog barks"); // Line 8: Prints message when bark() is called
    }                                    // Line 9: Ends bark() method
}                                        // Line 10: Ends Dog class

public class SingleInheritanceDemo {     // Line 11: Declares the main class
    public static void main(String[] args) { // Line 12: Main method starts program execution
        Dog d = new Dog();               // Line 13: Creates an object of Dog
        d.eat();                         // Line 14: Calls inherited eat() method from Animal
        d.bark();                        // Line 15: Calls bark() method from Dog
    }                                    // Line 16: Ends main method
}                                        // Line 17: Ends SingleInheritanceDemo class

Why this program is used
This program is used to show that one child class can inherit the features of one parent class.
It helps in understanding how `extends` works in Java.

How this program helps in Java learning
- Shows the idea of parent-child relationships.
- Demonstrates code reuse.
- Helps understand object-oriented programming clearly.

Pseudocode
START
    CREATE class Animal
    DEFINE eat()

    CREATE class Dog extends Animal
    DEFINE bark()

    CREATE main class
    CREATE object of Dog
    CALL eat()
    CALL bark()
END

Output
Animal eats food
Dog barks

Summary
Single inheritance allows one class to inherit from only one parent class.
It helps reduce repetition and improve code reuse.
In this example, Dog inherits from Animal and uses both inherited and its own methods.

Important note
This is called single inheritance because Dog has only one direct parent, which is Animal.

Diagram explanation

Parent Class: Animal
    |
    | extends
    v
Child Class: Dog

Animal has:
- eat()

Dog has:
- bark()
- can also use eat() from Animal

Visual structure
Animal
  |
  |---> Dog

Simple flow diagram
Start
  |
  v
Create object of Dog
  |
  v
Call eat() from Animal
  |
  v
Call bark() from Dog
  |
  v
End

One-line definition
Single inheritance is when one class inherits the properties and behaviors of only one parent class.
