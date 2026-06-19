Multilevel Inheritance in Java

Definition
Multilevel inheritance means a class inherits from another class, and that class inherits from another class.
In simple words, a chain of inheritance is created.

Why this concept is used
- It helps in reusing code step by step.
- It creates a clear hierarchy of classes.
- It reduces repetition in code.
- It makes large programs easier to manage.

How this helps Java programming
- Promotes code reuse across multiple levels.
- Makes the relationship between classes easier to understand.
- Helps in building structured and maintainable applications.
- Makes it easier to extend features in future programs.

Important theory
- Base class: the first class in the chain.
- Intermediate class: a class that inherits from the base class and is also inherited by another class.
- Derived class: the last class in the chain.
- Keyword used: extends
- In multilevel inheritance, one class can inherit from a class that already inherits from another class.

Example idea
- Animal is the parent class.
- Dog inherits from Animal.
- Puppy inherits from Dog.

Program 1: Multilevel Inheritance Example

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

class Puppy extends Dog {
    public void play() {
        System.out.println("Puppy plays");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
    }
}

Line-by-line explanation with comments

class Animal {                           // Line 1: Creates the base class Animal
    public void eat() {                  // Line 2: Creates eat() method
        System.out.println("Animal eats food"); // Line 3: Prints message
    }                                    // Line 4: Ends eat() method
}                                        // Line 5: Ends Animal class

class Dog extends Animal {               // Line 6: Dog inherits from Animal
    public void bark() {                 // Line 7: Creates bark() method in Dog
        System.out.println("Dog barks"); // Line 8: Prints bark message
    }                                    // Line 9: Ends bark() method
}                                        // Line 10: Ends Dog class

class Puppy extends Dog {                // Line 11: Puppy inherits from Dog
    public void play() {                 // Line 12: Creates play() method in Puppy
        System.out.println("Puppy plays"); // Line 13: Prints play message
    }                                    // Line 14: Ends play() method
}                                        // Line 15: Ends Puppy class

public class MultilevelInheritanceDemo { // Line 16: Main class declaration
    public static void main(String[] args) { // Line 17: Main method starts execution
        Puppy p = new Puppy();           // Line 18: Creates object of Puppy
        p.eat();                         // Line 19: Calls eat() from Animal
        p.bark();                        // Line 20: Calls bark() from Dog
        p.play();                        // Line 21: Calls play() from Puppy
    }                                    // Line 22: Ends main method
}                                        // Line 23: Ends class

Why this program is used
This program is used to show how one class can inherit features from another class, and that class can again pass features to another class.
It helps in understanding the chain of inheritance.

How this program helps in Java learning
- Shows how inheritance forms a chain.
- Demonstrates how methods pass through multiple levels.
- Helps in understanding Java class hierarchy.

Pseudocode
START
    CREATE class Animal
    DEFINE eat()

    CREATE class Dog extends Animal
    DEFINE bark()

    CREATE class Puppy extends Dog
    DEFINE play()

    CREATE main method
    CREATE object of Puppy
    CALL eat()
    CALL bark()
    CALL play()
END

Output
Animal eats food
Dog barks
Puppy plays

Summary
Multilevel inheritance is a type of inheritance where a class inherits from a class that already inherits from another class.
In this example, Puppy inherits from Dog, and Dog inherits from Animal.

Important note
This is called multilevel inheritance because the inheritance chain has more than one level.

Diagram explanation

Animal (Base Class)
    |
    | extends
    v
Dog (Intermediate Class)
    |
    | extends
    v
Puppy (Derived Class)

Animal has:
- eat()

Dog has:
- bark()
- also can use eat() from Animal

Puppy has:
- play()
- also can use bark() and eat()

Visual structure
Animal
  |
  +----> Dog
            |
            +----> Puppy

Simple flow diagram
Start
  |
  v
Create Puppy object
  |
  v
Call eat() from Animal
  |
  v
Call bark() from Dog
  |
  v
Call play() from Puppy
  |
  v
End

One-line definition
Multilevel inheritance is when a class inherits properties from a class that itself inherits from another class.
