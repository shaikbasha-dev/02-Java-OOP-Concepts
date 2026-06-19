Dynamic Method Dispatch in Java

1. Definition
Dynamic method dispatch is a mechanism in Java where the method to be called is decided at runtime, not at compile time.
It is achieved using method overriding and reference variables of the parent type.

2. Why this concept is used
- It helps achieve runtime polymorphism.
- It allows one reference variable to point to different objects.
- It makes code flexible and reusable.
- It helps in writing cleaner object-oriented programs.

3. How this helps Java programming
- Reduces code duplication.
- Allows different objects to respond differently to the same method call.
- Makes programs easier to extend.
- Supports real-world modeling in OOP.

4. Main idea
A parent reference variable can store an object of any subclass.
When a method is called using that reference, Java decides which overridden version to execute at runtime.

5. Example program

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

6. Line-by-line explanation with comments

class Animal {                          // Line 1: Declares the parent class Animal
    void sound() {                      // Line 2: Defines the sound() method in Animal
        System.out.println("Animal makes a sound"); // Line 3: Prints base behavior
    }                                    // Line 4: Ends sound() method
}                                        // Line 5: Ends Animal class

class Dog extends Animal {              // Line 6: Dog inherits Animal
    @Override                           // Line 7: Indicates overriding of sound()
    void sound() {                      // Line 8: Defines Dog-specific sound()
        System.out.println("Dog barks"); // Line 9: Prints dog message
    }                                    // Line 10: Ends sound() method
}                                        // Line 11: Ends Dog class

class Cat extends Animal {              // Line 12: Cat inherits Animal
    @Override                           // Line 13: Indicates overriding of sound()
    void sound() {                      // Line 14: Defines Cat-specific sound()
        System.out.println("Cat meows"); // Line 15: Prints cat message
    }                                    // Line 16: Ends sound() method
}                                        // Line 17: Ends Cat class

public class DynamicMethodDispatchDemo { // Line 18: Declares the main class
    public static void main(String[] args) { // Line 19: Entry point of the program
        Animal a;                       // Line 20: Declares a reference variable of type Animal

        a = new Animal();               // Line 21: Stores an Animal object in a
        a.sound();                      // Line 22: Calls Animal's sound()

        a = new Dog();                  // Line 23: Stores a Dog object in a
        a.sound();                      // Line 24: Calls Dog's overridden sound()

        a = new Cat();                  // Line 25: Stores a Cat object in a
        a.sound();                      // Line 26: Calls Cat's overridden sound()
    }                                    // Line 27: Ends main method
}                                        // Line 28: Ends class

7. Definition of each method
- Animal.sound(): base method
- Dog.sound(): overridden method for Dog
- Cat.sound(): overridden method for Cat
- main(): runs the program

8. Why this program is used
This program explains how Java chooses the correct method at runtime.
It is the best example of dynamic method dispatch.

9. How this program helps Java learning
- Shows runtime polymorphism clearly
- Makes inheritance and overriding easier to understand
- Improves understanding of object behavior

10. Pseudocode
START
    CREATE class Animal
    DEFINE sound()

    CREATE class Dog extends Animal
    OVERRIDE sound()

    CREATE class Cat extends Animal
    OVERRIDE sound()

    CREATE main method
    DECLARE Animal reference a

    a = new Animal()
    CALL a.sound()

    a = new Dog()
    CALL a.sound()

    a = new Cat()
    CALL a.sound()
END

11. Output
Animal makes a sound
Dog barks
Cat meows

12. Summary
Dynamic method dispatch is the runtime selection of the correct overridden method.
It is possible because the reference variable type is parent class, but the actual object type is subclass.

13. Important note
The method that runs depends on the actual object created, not just the reference type.

14. Short one-line definition
Dynamic method dispatch is runtime polymorphism where Java decides which overridden method to execute based on the actual object type.
