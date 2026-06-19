Polymorphism Diagrams in Java

1. Definition
Polymorphism means one thing can take many forms.
In Java, it allows the same method call to behave differently depending on the object.

2. Types of polymorphism
A. Compile-time polymorphism
- Achieved by method overloading
- Decision is made at compile time

B. Runtime polymorphism
- Achieved by method overriding
- Decision is made at runtime

3. Simple diagram for polymorphism

Object / Reference Concept

Animal reference can point to:
- Animal object
- Dog object
- Cat object

Diagram:
Animal a;
   |
   | can refer to
   v
Animal object
   |
   | or
   v
Dog object
   |
   | or
   v
Cat object

4. Runtime polymorphism diagram

Parent class: Animal
Child classes: Dog, Cat

Animal
  |
  +----> Dog
  |
  +----> Cat

If we write:
Animal a = new Dog();
then the call:
a.sound();
will execute Dog's sound() method.

5. Flow diagram for runtime polymorphism
Start
  |
  v
Create Animal reference
  |
  v
Assign object of subclass
  |
  v
Call overridden method
  |
  v
Java checks actual object type
  |
  v
Executes subclass version
  |
  v
End

6. Diagram for method overloading

Same method name, different parameters

add(10, 20)
   |
   +--> add(int a, int b)

add(10.5, 20.5)
   |
   +--> add(double a, double b)

add(10, 20, 30)
   |
   +--> add(int a, int b, int c)

7. Diagram for method overriding

Parent class method:
Animal.sound()

Child class override:
Dog.sound()
Cat.sound()

Animal
  |
  +--> sound()   (parent behavior)

Dog
  |
  +--> sound()   (overridden behavior)

Cat
  |
  +--> sound()   (overridden behavior)

8. Example code for visual understanding

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

public class PolymorphismDemo {
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

9. Output of the example
Animal makes a sound
Dog barks
Cat meows

10. Explanation of output
- First call uses Animal object -> Animal version runs
- Second call uses Dog object -> Dog version runs
- Third call uses Cat object -> Cat version runs

11. Why this diagram is useful
- Helps students visualize inheritance relationships
- Makes runtime behavior easy to understand
- Useful for notes, presentations, and GitHub repositories

12. Summary
Polymorphism diagrams help show how one reference can point to different objects and how Java chooses the correct behavior at runtime.

13. Short note
A diagram is the easiest way to understand how polymorphism works in Java.
