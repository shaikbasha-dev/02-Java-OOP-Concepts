Dynamic Method Dispatch in Java

Definition
Dynamic method dispatch is the process in which the call to an overridden method is resolved at runtime instead of compile time.
This is an important part of Java runtime polymorphism.

Why this concept is used
- It allows one reference type to call different overridden methods.
- It helps in implementing runtime polymorphism.
- It makes code more flexible and reusable.
- It allows the program to decide behavior based on the actual object created.

How this helps Java programming
- Makes method calls more flexible.
- Helps in writing cleaner object-oriented programs.
- Supports the idea that the actual object type matters at runtime.
- Improves the power of inheritance and overriding together.

Important theory
- The reference type is declared as the parent class.
- The object created can be of the parent or any child class.
- Java decides which method to run at runtime.
- This is called runtime polymorphism.

Example idea
- Animal is the parent class.
- Dog and Cat override the sound() method.
- A variable of type Animal can point to any object of Animal, Dog, or Cat.

Program 1: Dynamic Method Dispatch Example

Code:

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        Animal a;

        a = new Animal();
        a.sound();

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}

Line-by-line explanation with comments

class Animal {                           // Line 1: Declares parent class Animal
    void sound() {                        // Line 2: Declares sound() method in Animal
        System.out.println("Animal makes a sound"); // Line 3: Prints animal message
    }                                    // Line 4: Ends sound() method
}                                        // Line 5: Ends Animal class

class Dog extends Animal {               // Line 6: Dog inherits Animal
    @Override                            // Line 7: Indicates overriding
    void sound() {                        // Line 8: Declares overridden sound() in Dog
        System.out.println("Dog barks"); // Line 9: Prints dog-specific message
    }                                    // Line 10: Ends sound() method
}                                        // Line 11: Ends Dog class

class Cat extends Animal {               // Line 12: Cat inherits Animal
    @Override                            // Line 13: Indicates overriding
    void sound() {                        // Line 14: Declares overridden sound() in Cat
        System.out.println("Cat meows"); // Line 15: Prints cat-specific message
    }                                    // Line 16: Ends sound() method
}                                        // Line 17: Ends Cat class

public class DynamicMethodDispatchDemo { // Line 18: Main class declaration
    public static void main(String[] args) { // Line 19: Main method starts execution
        Animal a;                         // Line 20: Declares reference variable of type Animal

        a = new Animal();                 // Line 21: Assigns Animal object to reference
        a.sound();                        // Line 22: Calls Animal's sound()

        a = new Dog();                    // Line 23: Assigns Dog object to same reference
        a.sound();                        // Line 24: Calls Dog's overridden sound()

        a = new Cat();                    // Line 25: Assigns Cat object to same reference
        a.sound();                        // Line 26: Calls Cat's overridden sound()
    }                                    // Line 27: Ends main method
}                                        // Line 28: Ends class

Why this program is used
This program is used to show how the same reference variable can call different overridden methods depending on the actual object stored in it.
It helps students understand dynamic method dispatch clearly.

How this program helps in Java learning
- Shows runtime behavior based on the actual object.
- Explains why overriding is powerful.
- Helps in understanding polymorphism.
- Makes inheritance concepts easier to apply in real programs.

Pseudocode
START
    CREATE class Animal
    DEFINE sound()

    CREATE class Dog extends Animal
    OVERRIDE sound()

    CREATE class Cat extends Animal
    OVERRIDE sound()

    CREATE main method
    DECLARE Animal reference a

    SET a = new Animal()
    CALL a.sound()

    SET a = new Dog()
    CALL a.sound()

    SET a = new Cat()
    CALL a.sound()
END

Output
Animal makes a sound
Dog barks
Cat meows

Summary
Dynamic method dispatch allows Java to decide which overridden method to run at runtime.
Even though the reference type is Animal, the actual object decides which sound() method is executed.

Important note
The reference type is fixed, but the actual object type decides the behavior at runtime.

Diagram explanation

Animal reference
      |
      +----> new Animal()   -> Animal.sound()
      +----> new Dog()      -> Dog.sound()
      +----> new Cat()      -> Cat.sound()

Visual structure
Animal
  |
  +----> Dog
  |
  +----> Cat

Simple flow diagram
Start
  |
  v
Declare Animal reference a
  |
  v
Assign Animal object
  |
  v
Call sound() -> Animal version
  |
  v
Assign Dog object
  |
  v
Call sound() -> Dog version
  |
  v
Assign Cat object
  |
  v
Call sound() -> Cat version
  |
  v
End

One-line definition
Dynamic method dispatch is the runtime resolution of overridden method calls based on the actual object type.
