
03-Abstract-Methods-in-Interface

1. What is an Abstract Method in an Interface?
An abstract method is a method declared in an interface without a body.
It tells the implementing class what method it must provide, but the interface does not define how it works.

Key idea:
- Abstract methods are declared using a method signature only.
- They end with a semicolon (;).
- The implementing class must provide the body.
- They are used to define behavior that different classes may implement differently.

2. Why are Abstract Methods Used in Interfaces?
Abstract methods are used when we want to define a common action for multiple classes, but each class should implement that action differently.
For example, every vehicle may have a start() method, but the implementation differs for car, bike, and bus.

Benefits:
- Enforces a standard contract
- Encourages abstraction
- Supports polymorphism
- Helps in code maintainability
- Avoids duplicate method declarations

3. Important Rules of Abstract Methods in Interfaces
1. An interface method without a body is abstract by default.
2. Every method in an interface is public by default.
3. A class implementing the interface must define all abstract methods.
4. A class can implement multiple interfaces.
5. Interfaces are used to define capabilities, not data storage.
6. Abstract methods help in standardizing behavior.

4. Program 1: Interface with Abstract Methods
Headline: Demonstrating how abstract methods force classes to provide their own implementation.

Why this program is used:
This program explains how interfaces define rules for a class.
It helps us understand that the interface says what must happen, while the class decides how it happens.

Program Code:
interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats meat");
    }

    public void sleep() {
        System.out.println("Dog sleeps in a kennel");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats fish");
    }

    public void sleep() {
        System.out.println("Cat sleeps on the sofa");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.eat();
        a1.sleep();

        Animal a2 = new Cat();
        a2.eat();
        a2.sleep();
    }
}

Detailed line-by-line explanation:
1. interface Animal { -> defines an interface named Animal.
2. void eat(); -> declares abstract method eat().
3. void sleep(); -> declares abstract method sleep().
4. } -> closes the interface.
5. class Dog implements Animal { -> Dog implements Animal.
6. public void eat() { -> defines how Dog eats.
7. System.out.println("Dog eats meat"); -> prints Dog's eating behavior.
8. }
9. public void sleep() { -> defines how Dog sleeps.
10. System.out.println("Dog sleeps in a kennel"); -> prints Dog's sleeping behavior.
11. }
12. }
13. class Cat implements Animal { -> Cat implements Animal.
14. public void eat() { -> defines how Cat eats.
15. System.out.println("Cat eats fish"); -> prints Cat's eating behavior.
16. }
17. public void sleep() { -> defines how Cat sleeps.
18. System.out.println("Cat sleeps on the sofa"); -> prints Cat's sleeping behavior.
19. }
20. }
21. public class Main { -> main class.
22. public static void main(String[] args) { -> program starts here.
23. Animal a1 = new Dog(); -> creates Dog object using Animal reference.
24. a1.eat(); -> calls Dog's eat() method.
25. a1.sleep(); -> calls Dog's sleep() method.
26. Animal a2 = new Cat(); -> creates Cat object using Animal reference.
27. a2.eat(); -> calls Cat's eat() method.
28. a2.sleep(); -> calls Cat's sleep() method.
29. }
30. }

Method definitions:
- eat(): defines the eating behavior.
- sleep(): defines the sleeping behavior.
- main(): starts the execution.

Pseudocode:
1. Create an interface Animal with eat() and sleep().
2. Create class Dog that implements Animal.
3. Define Dog's eat() and sleep().
4. Create class Cat that implements Animal.
5. Define Cat's eat() and sleep().
6. In main, create Dog and Cat objects.
7. Call eat() and sleep() on both objects.
8. End the program.

Output:
Dog eats meat
Dog sleeps in a kennel
Cat eats fish
Cat sleeps on the sofa

Summary:
This program shows that abstract methods in an interface define a common behavior contract.
Each class can implement the methods differently.

5. Program 2: Interface with Multiple Abstract Methods
Headline: Demonstrating how an interface can contain many abstract methods for different actions.

Why this program is used:
This example shows how a single interface can define several action contracts.
It is helpful when multiple classes share the same set of responsibilities.

Program Code:
interface Vehicle {
    void start();
    void stop();
    void fuel();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }

    public void fuel() {
        System.out.println("Car needs petrol");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting");
    }

    public void stop() {
        System.out.println("Bike is stopping");
    }

    public void fuel() {
        System.out.println("Bike needs petrol");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();
        v1.fuel();

        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();
        v2.fuel();
    }
}

Detailed explanation:
- Vehicle is an interface with three abstract methods.
- Car and Bike implement all methods.
- Each class provides its own behavior.
- The main method shows runtime polymorphism.

Pseudocode:
1. Create interface Vehicle with start(), stop(), and fuel().
2. Create class Car implementing Vehicle.
3. Create class Bike implementing Vehicle.
4. In main, create Car and Bike objects.
5. Call start(), stop(), and fuel() for each object.
6. End the program.

Output:
Car is starting
Car is stopping
Car needs petrol
Bike is starting
Bike is stopping
Bike needs petrol

Summary:
This program shows that one interface can define multiple abstract methods.
It helps make code consistent across different classes.

6. Final Conclusion
Abstract methods in interfaces are important because they define a contract without fixing the implementation.
They allow Java programs to become more flexible, reusable, and easier to maintain.
Understanding this concept is essential for writing professional object-oriented Java programs.
