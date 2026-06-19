Polymorphism Flowcharts in Java

1. Definition
A flowchart is a visual representation of the steps followed by a program.
For polymorphism, it helps show how Java selects the correct method behavior.

2. Flowchart for compile-time polymorphism

Start
  |
  v
User calls a method
  |
  v
Java checks method signature
  |
  v
Java chooses the correct overloaded method
  |
  v
Program executes chosen method
  |
  v
End

3. Flowchart for runtime polymorphism

Start
  |
  v
Create parent reference variable
  |
  v
Assign object of subclass
  |
  v
Call overridden method using parent reference
  |
  v
Java checks actual object type at runtime
  |
  v
Java executes subclass overridden method
  |
  v
End

4. Flowchart for method overloading

Start
  |
  v
Call add() method
  |
  v
Check number of arguments
  |
  v
If 2 integers -> execute add(int, int)
  |
  v
If 2 doubles -> execute add(double, double)
  |
  v
If 3 integers -> execute add(int, int, int)
  |
  v
End

5. Flowchart for method overriding

Start
  |
  v
Parent class defines method
  |
  v
Child class writes same method again
  |
  v
Child method overrides parent method
  |
  v
Object of child class is created
  |
  v
Method call is made
  |
  v
Child version runs
  |
  v
End

6. Flowchart for dynamic method dispatch

Start
  |
  v
Declare Animal reference
  |
  v
Assign Animal object
  |
  v
Call sound()
  |
  v
Animal version runs
  |
  v
Assign Dog object
  |
  v
Call sound()
  |
  v
Dog version runs
  |
  v
Assign Cat object
  |
  v
Call sound()
  |
  v
Cat version runs
  |
  v
End

7. Example code used for flowchart understanding

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

public class PolymorphismFlowchartDemo {
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

8. Output of the example
Animal makes a sound
Dog barks
Cat meows

9. Explanation of output
- Animal object calls Animal.sound()
- Dog object calls Dog.sound()
- Cat object calls Cat.sound()

10. Why flowcharts are useful
- Make logic easier to understand
- Help in learning OOP concepts faster
- Useful while revising for exams and interviews

11. Summary
Flowcharts help visualize how Java decides which polymorphic behavior to execute.
They make compile-time and runtime polymorphism easier to understand.

12. Short final note
A flowchart turns a difficult programming concept into a simple step-by-step process.
