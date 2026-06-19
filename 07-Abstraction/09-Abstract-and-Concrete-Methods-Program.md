// # Program 2: Abstract and Concrete Methods
/*
## Title
**Abstract Class with Both Abstract and Concrete Methods**

## 1) Program Goal
This program demonstrates that an abstract class is not limited to only abstract methods.
It can also contain normal methods that already have a body.

This helps us understand that abstraction can combine:
- a required contract (abstract methods), and
- shared reusable behavior (concrete methods).

## 2) Definitions

### Abstract Method
An abstract method is declared without a body and must be implemented by subclasses.

### Concrete Method
A concrete method is a normal method that already has a complete body.
It can be inherited and reused by subclasses.

### Abstract Class
An abstract class can contain both abstract and concrete methods.
It may also contain fields, constructors, and other normal class members.

## 3) Why this program is important
This program is important because it teaches a very practical point:

> An abstract class can define both the rules that must be followed and the common logic that all subclasses can share.

This is one of the key reasons abstraction is powerful in real-world Java applications.

## 4) Why we use this program
We use this program because it shows the difference between:
- what every subclass must implement, and
- what all subclasses can inherit as common behavior.

This helps beginners understand that abstraction is not just about making methods incomplete.
It is also about organizing code in a smart way.

## 5) How this helps Java developers
This helps Java developers build cleaner systems where:
- common functionality is written once,
- subclasses only override what is different,
- and the overall design becomes easier to extend.

## 6) Real-world analogy
Imagine a vehicle company.
All vehicles must have a `start()` mechanism, but the exact implementation may differ for a car, bike, or truck.
At the same time, every vehicle may also share a common method like `displayBrand()`.

The abstract class defines both:
- the required actions, and
- the reusable shared logic.

## 7) Complete Java Program
*/

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

public class Program_2_Abstract_and_Concrete_Methods {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
    }
}

/*
## 8) Line-by-line explanation

### Line 1
```java
abstract class Vehicle {
```
- `abstract` tells Java that this class cannot be instantiated directly.
- `Vehicle` is the parent abstract class.

### Line 2
```java
    abstract void start();
```
- `start()` is declared as abstract.
- It has no body because every vehicle type may start differently.
- This means subclasses must implement it.

### Line 4
```java
    void stop() {
```
- `stop()` is a concrete method.
- It already has a body.
- Every subclass can inherit this method without rewriting it.

### Line 5
```java
        System.out.println("Vehicle stopped");
```
- This prints a message to the console.
- It defines the common stopping behavior.

### Line 8
```java
class Car extends Vehicle {
```
- `Car` is a subclass.
- It inherits from `Vehicle`.
- Because `Vehicle` has an abstract method, `Car` must implement it.

### Line 9
```java
    @Override
```
- This tells Java that the method below is overriding a parent method.
- It also helps prevent accidental mistakes.

### Line 10
```java
    void start() {
```
- This provides the implementation for the abstract `start()` method.

### Line 11
```java
        System.out.println("Car started");
```
- This prints the specific behavior of a car.

### Line 16
```java
        Vehicle vehicle = new Car();
```
- A `Vehicle` reference is created.
- It points to a `Car` object.
- This shows polymorphism and abstraction together.

### Line 17
```java
        vehicle.start();
```
- Calls the `start()` method.
- Since the actual object is a `Car`, the child version runs.

### Line 18
```java
        vehicle.stop();
```
- Calls the inherited `stop()` method.
- This method is already implemented in the abstract class.

## 9) Pseudocode

```text
BEGIN
    Create abstract class Vehicle
        Declare abstract method start()
        Declare concrete method stop()
            Print "Vehicle stopped"
    END

    Create class Car extends Vehicle
        Implement start()
            Print "Car started"
    END

    In main method
        Create Vehicle reference pointing to Car object
        Call start()
        Call stop()
    END
END
```

## 10) Step-by-step working
1. The program starts in `main()`.
2. A `Vehicle` reference is assigned to a `Car` object.
3. `vehicle.start()` calls the `Car` implementation.
4. `vehicle.stop()` calls the shared implementation defined in `Vehicle`.

## 11) Output

```text
Car started
Vehicle stopped
```

## 12) Why the output appears this way
The output is produced because:
- `start()` is abstract in the parent class and implemented in the child class,
- `stop()` is already defined in the abstract class,
- and Java uses the actual object type to decide which method to run.

## 13) Important concept learned
This program teaches that abstract classes can provide:
- mandatory behavior that subclasses must implement, and
- reusable behavior that subclasses can inherit directly.

## 14) Advantages of this design
- Reduces duplication of code.
- Keeps common logic in one place.
- Forces subclasses to implement important behavior.
- Improves code organization.
- Makes future extensions easier.

## 15) Summary
This example shows that abstraction is not just about hiding details.
It is also about designing a class hierarchy where some methods are required and some methods are shared.

## 16) One-line takeaway
**An abstract class can define both rules and reusable logic for its subclasses.**
*/

