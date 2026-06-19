01_Introduction_to_Abstraction.txt

Introduction to Abstraction in Java

Definition:
Abstraction means hiding the implementation details and showing only the important features.
In Java, abstraction helps us focus on what an object does, not how it does it.

Why abstraction is needed:
- It reduces complexity.
- It helps in designing clean object-oriented programs.
- It allows us to define common behavior in a base class.
- It improves code reusability and maintainability.

Important note:
An abstract class is used when a class represents a general idea rather than a specific real-world object.
For example, Animal is a general concept, but Dog or Cat is a specific object.

Abstract classes:
We musst declare a class as abstract when it doesnot represent a physical entity present in the real world.
To declare a class as abstract we must use the 'abstract keyword'.
Objects are programming represents of real world entities & all the information to create an object must be present inside a class.
Since abstract classes do not represent the real world entities, we can initiate an abstract class. In other words we cannot create the object of abstract classes.
Such classes which are not abstract are known as concrete classes.

Example 1: Abstract hierarchy

abstract class Animal {
}

abstract class Herbivorous extends Animal {
}

abstract class Carnivorous extends Animal {
}

abstract class Omnivorous extends Animal {
}

class Cow extends Herbivorous {
}

class Goat extends Herbivorous {
}

class Tiger extends Carnivorous {
}

class Lion extends Carnivorous {
}

class Dog extends Omnivorous {
}

class Cat extends Omnivorous {
}

class App {
    public static void main(String[] args) {
        // Invalid: cannot create object of abstract class
        // Animal a = new Animal();
        // Herbivorous h = new Herbivorous();
        // Carnivorous c = new Carnivorous();
        // Omnivorous o = new Omnivorous();

        // Valid: reference variables can be created
        Animal a;
        Herbivorous h;
        Carnivorous c;
        Omnivorous o;

        System.out.println("Reference variables are allowed.");
    }
}

Note:
1. We cannot create objects of abstract classes directly.
2. But we can create reference variables of abstract class types.
3. Those references can point to objects of concrete subclasses.
4. This helps achieve polymorphism.

Example 2: SecurityForce without abstraction

class SecurityForce {
    public void attack() {
        System.out.println("Security Force is attacking!");
    }

    public void defend() {
        System.out.println("Security Force is defending!");
    }
}

class Army extends SecurityForce {
    @Override
    public void attack() {
        System.out.println("Army is launching a ground attack!");
    }

    @Override
    public void defend() {
        System.out.println("Army is fortifying defenses!");
    }
}

class Navy extends SecurityForce {
    @Override
    public void attack() {
        System.out.println("Navy is launching a naval attack!");
    }

    @Override
    public void defend() {
        System.out.println("Navy is securing the coastline!");
    }
}

class AirForce extends SecurityForce {
    @Override
    public void attack() {
        System.out.println("Air Force is launching an aerial attack!");
    }

    @Override
    public void defend() {
        System.out.println("Air Force is securing the skies!");
    }
}

class WarApp {
    public static void main(String[] args) {
        SecurityForce sf;
        Army army = new Army();
        Navy navy = new Navy();
        AirForce airForce = new AirForce();

        protect(army);
        protect(navy);
        protect(airForce);
    }

    public static void protect(SecurityForce sf) {
        sf.attack();
        sf.defend();
    }
}

Explanation:
1. The methods attack() and defend() are overridden in the child classes.
2. A parent reference type (SecurityForce) is used to call the overridden methods.
3. This achieves polymorphism.
4. However, the parent class still contains methods that may not be useful for every child type.
5. If we remove those methods from the parent class, the child classes will not have a common contract.
6. In such situations, abstract methods are useful.

Example 3: Using abstraction properly

abstract class SecurityForce {
    public abstract void attack();
    public abstract void defend();
}

class Army extends SecurityForce {
    @Override
    public void attack() {
        System.out.println("Army is launching a ground attack!");
    }

    @Override
    public void defend() {
        System.out.println("Army is fortifying defenses!");
    }
}

class Navy extends SecurityForce {
    @Override
    public void attack() {
        System.out.println("Navy is launching a naval attack!");
    }

    @Override
    public void defend() {
        System.out.println("Navy is securing the coastline!");
    }
}

class AirForce extends SecurityForce {
    @Override
    public void attack() {
        System.out.println("Air Force is launching an aerial attack!");
    }

    @Override
    public void defend() {
        System.out.println("Air Force is securing the skies!");
    }
}

class WarApp2 {
    public static void main(String[] args) {
        SecurityForce sf;
        Army army = new Army();
        Navy navy = new Navy();
        AirForce airForce = new AirForce();

        protect(army);
        protect(navy);
        protect(airForce);
    }

    public static void protect(SecurityForce sf) {
        sf.attack();
        sf.defend();
    }
}

Note:
If a class inheriting from abstract class, it has two options
a. Either it should override all the abstract methods.
b. The class itself should declare as abstract.


Important note about abstraction:
An abstract class can contain everything that a normal Java class can contain,
including constructors, static methods, static variables, static blocks,
instance methods, instance variables, and instance blocks.
The only difference is that an abstract class cannot be instantiated.

Example 4: Abstract class with multiple members

public abstract class Demo {
    int a;
    int b;
    static int x;
    static int y;

    static {
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance block executed");
    }

    public static void fun() {
        System.out.println("Static method executed");
    }

    public void fun1() {
        System.out.println("Non-static method executed");
    }

    public abstract void fun2();

    public Demo() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}

Summary:
- Abstraction hides implementation details.
- Abstract classes cannot be instantiated directly.
- Abstract methods have no body.
- Subclasses must implement abstract methods or become abstract themselves.
- The abstract keyword is used to declare abstract classes and abstract methods.
