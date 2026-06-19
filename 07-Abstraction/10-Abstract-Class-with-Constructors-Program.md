// # Program 3: Abstract Class with Constructors
/*
## Title
**Understanding Constructors in Abstract Classes**

## 1) Program Goal
This program demonstrates how constructors behave in abstract classes.
It shows that:
- an abstract class can have a constructor,
- the constructor is used to initialize fields,
- and when a subclass object is created, the parent constructor is called automatically using `super()`.

## 2) Definitions

### Constructor
A constructor is a special method used to initialize objects when they are created.

### Abstract Class Constructor
Even though an abstract class cannot be instantiated directly, it can still have a constructor.
This constructor is called when a subclass object is created.

### `super()`
`super()` is used to call the parent class constructor from the child class constructor.

## 3) Why this program is important
This program is important because many beginners think abstract classes cannot have constructors.
In reality, abstract classes can have constructors, and they are often used to initialize common data.

## 4) Why we use this program
We use this program to understand:
- how constructors in abstract classes work,
- how inheritance affects object creation,
- and why `super()` is important.

## 5) How this helps Java developers
This helps developers design classes in a professional way.
It teaches that common initialization logic can be written once in the abstract parent class and reused by all subclasses.

## 6) Real-world analogy
Think of a company system where every employee object must have a company ID and name.
Instead of copying that initialization logic into every subclass, the abstract base class can handle it once.

## 7) Complete Java Program
*/

package FIle7;

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    void display() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
        System.out.println("Dog constructor called");
    }
}

public class Program_3_Abstract_Class_with_Constructors {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        dog.display();
    }
}

/*
## 8) Line-by-line explanation

### Line 1
```java
package FIle7;
```
- Declares the package for the file.
- Helps organize related classes.

### Line 3
```java
abstract class Animal {
```
- Declares an abstract class named `Animal`.
- This class cannot be instantiated directly.

### Line 4
```java
    String name;
```
- Declares a field named `name`.
- This field stores the animal's name.

### Line 6
```java
    Animal(String name) {
```
- This is a constructor of the abstract class.
- It accepts a `String` value and initializes the field.

### Line 7
```java
        this.name = name;
```
- Assigns the value of the constructor parameter to the field.
- `this.name` refers to the current object’s field.

### Line 8
```java
        System.out.println("Animal constructor called");
```
- Prints a message when the abstract parent constructor runs.

### Line 11
```java
    void display() {
```
- Declares a normal method that prints the animal name.

### Line 12
```java
        System.out.println("Animal name: " + name);
```
- Prints the value of the `name` field.
- `+` concatenates the text and the variable value.

### Line 16
```java
class Dog extends Animal {
```
- Declares a subclass called `Dog`.
- `Dog` inherits from `Animal`.

### Line 17
```java
    Dog(String name) {
```
- Constructor of the `Dog` class.
- It accepts a name and will pass it to the parent constructor.

### Line 18
```java
        super(name);
```
- Calls the parent class constructor.
- This ensures the abstract parent initializes its field properly.

### Line 19
```java
        System.out.println("Dog constructor called");
```
- Prints a message indicating that the child constructor has executed.

### Line 24
```java
public class Program_3_Abstract_Class_with_Constructors {
```
- Declares the public class that contains the `main` method.

### Line 25
```java
    public static void main(String[] args) {
```
- Starts the main method.
- This is the program's entry point.

### Line 26
```java
        Dog dog = new Dog("Tommy");
```
- Creates a `Dog` object.
- The string `"Tommy"` is passed to the constructor.
- Java first runs the parent constructor and then the child constructor.

### Line 27
```java
        dog.display();
```
- Calls the `display()` method on the `Dog` object.
- This prints the animal name.

## 9) Pseudocode

```text
BEGIN
    Create abstract class Animal
        Declare field name
        Create constructor Animal(name)
            Set name
            Print "Animal constructor called"
        END

        Create method display()
            Print name
        END
    END

    Create class Dog extends Animal
        Create constructor Dog(name)
            Call super(name)
            Print "Dog constructor called"
        END
    END

    In main method
        Create Dog object with name "Tommy"
        Call display()
    END
END
```

## 10) Step-by-step working
1. The program starts in `main()`.
2. A new `Dog` object is created.
3. Java first calls the `Animal` constructor.
4. The `Animal` constructor initializes the `name` field.
5. Then the `Dog` constructor runs.
6. Finally, `display()` prints the name.

## 11) Output

```text
Animal constructor called
Dog constructor called
Animal name: Tommy
```

## 12) Why the output appears this way
The output appears in this order because:
- the parent constructor runs before the child constructor,
- Java always initializes the parent part of the object first,
- and then the child-specific part.

## 13) Important concept learned
This program teaches that abstract classes can still be responsible for initialization.
It also shows the importance of constructor chaining through `super()`.

## 14) Advantages of this design
- Keeps common initialization code in one place.
- Makes object creation more organized.
- Helps maintain a clean inheritance hierarchy.
- Ensures the parent object is initialized before the child object is used.

## 15) Summary
This program clearly shows that abstract classes are not just empty templates.
They can contain constructors, fields, and shared methods that help all subclasses work correctly.

## 16) One-line takeaway
**An abstract class can initialize shared data through its constructor, and subclasses use `super()` to invoke it.**
*/
