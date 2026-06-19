Super Keyword in Java

Definition
The super keyword is used in Java to refer to the parent class.
It is mainly used to access parent class members, call parent class constructors, and solve naming conflicts.

Why this concept is used
- It helps in accessing parent class data and methods.
- It is used to call the parent constructor.
- It helps when child and parent classes have same variable or method names.
- It makes inheritance behavior clearer and easier to understand.

How this helps Java programming
- Allows reuse of parent class logic.
- Makes constructor chaining easier.
- Helps avoid confusion between child and parent members.
- Supports clean and organized inheritance code.

Important theory
- super is used to access the immediate parent class.
- super() calls the parent constructor.
- super.variable accesses parent variable.
- super.method() calls parent method.
- super can be used only inside a child class.

Example idea
- Animal is the parent class.
- Dog is the child class.
- Dog uses super to call Animal's constructor and access Animal's members.

Program 1: Super Keyword Example

Code:

class Animal {
    String color = "Brown";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog constructor called");
    }

    void display() {
        System.out.println("Color from parent: " + super.color);
        super.eat();
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}

Line-by-line explanation with comments

class Animal {                           // Line 1: Declares parent class Animal
    String color = "Brown";              // Line 2: Declares color variable in Animal

    Animal() {                           // Line 3: Constructor of Animal
        System.out.println("Animal constructor called"); // Line 4: Prints constructor message
    }                                    // Line 5: Ends Animal constructor

    void eat() {                         // Line 6: Declares eat() in Animal
        System.out.println("Animal eats food"); // Line 7: Prints animal behavior
    }                                    // Line 8: Ends eat() method
}                                        // Line 9: Ends Animal class

class Dog extends Animal {               // Line 10: Dog inherits Animal
    Dog() {                              // Line 11: Constructor of Dog
        super();                         // Line 12: Calls parent constructor first
        System.out.println("Dog constructor called"); // Line 13: Prints dog constructor message
    }                                    // Line 14: Ends Dog constructor

    void display() {                     // Line 15: Declares display() in Dog
        System.out.println("Color from parent: " + super.color); // Line 16: Accesses parent's color
        super.eat();                     // Line 17: Calls parent's eat() method
    }                                    // Line 18: Ends display() method
}                                        // Line 19: Ends Dog class

public class SuperKeywordDemo {         // Line 20: Main class declaration
    public static void main(String[] args) { // Line 21: Main method starts execution
        Dog d = new Dog();               // Line 22: Creates Dog object
        d.display();                     // Line 23: Calls display() method
    }                                    // Line 24: Ends main method
}                                        // Line 25: Ends class

Why this program is used
This program is used to show how the super keyword is used to access the parent class members and call the parent constructor.
It helps in understanding inheritance clearly.

How this program helps in Java learning
- Explains how to call parent constructors.
- Shows how to access parent variables and methods.
- Helps reduce confusion in child class code.
- Builds strong understanding of inheritance.

Pseudocode
START
    CREATE class Animal
    DECLARE color
    DEFINE constructor
    DEFINE eat()

    CREATE class Dog extends Animal
    DEFINE constructor
    CALL super()
    PRINT constructor message
    DEFINE display()
    PRINT parent color using super.color
    CALL super.eat()

    CREATE main method
    CREATE Dog object
    CALL display()
END

Output
Animal constructor called
Dog constructor called
Color from parent: Brown
Animal eats food

Summary
The super keyword is used to refer to the parent class.
It allows a child class to call the parent constructor and access parent members.
The process of calling the parent constructor from child class constructor to access parent members with help of super() method is known as Constructor chaining.
In this example, super is used to access the Animal class data and methods.

Important note
super() must be the first statement in a child constructor if used.

Diagram explanation

Animal (Parent)
   |
   | super
   v
Dog (Child)

Animal has:
- color
- eat()

Dog uses:
- super() to call Animal constructor
- super.color to access parent variable
- super.eat() to call parent method

Visual structure
Animal
  |
  +----> Dog

Simple flow diagram
Start
  |
  v
Create Dog object
  |
  v
Call Animal constructor using super()
  |
  v
Call Dog constructor
  |
  v
Use super.color and super.eat()
  |
  v
End

One-line definition
The super keyword is used to refer to the parent class and access its members or constructors.
