// # Program 4: Abstract Class with Final and Static Members
/*
## Title
**Understanding Static and Final Methods in Abstract Classes**

## 1) Program Goal
This program demonstrates how an abstract class can contain:
- a `static` method,
- a `final` method,
- and an abstract method that must be implemented by subclasses.

The goal is to show that abstraction and method behavior rules can work together in one design.

## 2) Definitions

### Static Method
A `static` method belongs to the class, not to any object.
It can be called using the class name.

### Final Method
A `final` method cannot be overridden by a subclass.
It guarantees the behavior stays fixed.

### Abstract Method
An abstract method has no body and must be implemented by subclasses.

## 3) Why this program is important
This program is important because it clarifies a common confusion:

- abstract methods are meant to be implemented,
- final methods are meant to stay unchanged,
- and static methods are shared across the class.

## 4) Why we use this program
We use this program to show that abstract classes can contain different kinds of methods, and each one plays a different role.

## 5) How this helps Java developers
This helps developers understand how to choose the correct method type when designing a hierarchy.
It teaches strong object-oriented design decisions.

## 6) Real-world analogy
Imagine a banking system:
- `calculateInterest()` may vary by account type, so it can be abstract,
- `displayBankName()` may always remain the same, so it can be final,
- and `getBankCode()` may be shared by the class, so it can be static.

## 7) Complete Java Program
*/


abstract class Bank {
    static String bankName = "ABC Bank";

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    final void showRules() {
        System.out.println("Every account must follow bank rules.");
    }

    abstract void interestRate();
}

class SavingsAccount extends Bank {
    @Override
    void interestRate() {
        System.out.println("Savings account interest rate is 4%.");
    }
}

public class Program_4_Abstract_Class_with_Final_and_Static {
    public static void main(String[] args) {
        Bank.showBankName();

        Bank account = new SavingsAccount();
        account.showRules();
        account.interestRate();
    }
}

/*
## 8) Line-by-line explanation

### Line 1
```java
package FIle7;
```
- Declares the package name.

### Line 3
```java
abstract class Bank {
```
- Declares an abstract class called `Bank`.
- It cannot be instantiated directly.

### Line 4
```java
    static String bankName = "ABC Bank";
```
- Declares a static variable.
- It belongs to the class and is shared by all objects.

### Line 6
```java
    static void showBankName() {
```
- Declares a static method.
- It can be called without creating an object.

### Line 7
```java
        System.out.println("Bank Name: " + bankName);
```
- Prints the value of the static variable.

### Line 10
```java
    final void showRules() {
```
- Declares a `final` method.
- This method cannot be overridden by subclasses.

### Line 11
```java
        System.out.println("Every account must follow bank rules.");
```
- Prints a message that must remain fixed.

### Line 14
```java
    abstract void interestRate();
```
- Declares an abstract method.
- Subclasses must provide implementation.

### Line 17
```java
class SavingsAccount extends Bank {
```
- Declares a subclass of `Bank`.

### Line 18
```java
    @Override
```
- Indicates that the method below overrides the parent method.

### Line 19
```java
    void interestRate() {
```
- Implements the abstract method.

### Line 20
```java
        System.out.println("Savings account interest rate is 4%.");
```
- Prints the specific rate for savings accounts.

### Line 26
```java
        Bank.showBankName();
```
- Calls the static method using the class name.

### Line 28
```java
        Bank account = new SavingsAccount();
```
- Creates a `SavingsAccount` object using a `Bank` reference.

### Line 29
```java
        account.showRules();
```
- Calls the final method.
- The behavior will not change in the subclass.

### Line 30
```java
        account.interestRate();
```
- Calls the overridden abstract method implementation.

## 9) Pseudocode

```text
BEGIN
    Create abstract class Bank
        Declare static variable bankName
        Create static method showBankName()
            Print bankName
        END

        Create final method showRules()
            Print fixed bank rule message
        END

        Create abstract method interestRate()
    END

    Create class SavingsAccount extends Bank
        Implement interestRate()
            Print savings interest rate
        END
    END

    In main method
        Call Bank.showBankName()
        Create Bank reference to SavingsAccount object
        Call showRules()
        Call interestRate()
    END
END
```

## 10) Step-by-step working
1. The program starts at `main()`.
2. `Bank.showBankName()` runs because it is static.
3. A `SavingsAccount` object is created.
4. `showRules()` runs using the inherited final method.
5. `interestRate()` runs using the subclass-specific implementation.

## 11) Output

```text
Bank Name: ABC Bank
Every account must follow bank rules.
Savings account interest rate is 4%.
```

## 12) Why the output appears this way
The output is produced because:
- the static method is called using the class name,
- the final method is inherited and cannot be changed,
- and the abstract method uses the subclass implementation.

## 13) Important concept learned
This program teaches that different method types serve different purposes:
- `static` for shared class behavior,
- `final` for fixed behavior,
- and `abstract` for required subclass behavior.

## 14) Advantages of this design
- Keeps shared logic in one place.
- Prevents unwanted overriding.
- Forces subclasses to implement important behavior.
- Makes the class hierarchy clearer and more professional.

## 15) Summary
This example shows how abstraction works alongside other Java keywords.
It teaches that each keyword has a clear responsibility in building a good object-oriented design.

## 16) One-line takeaway
**Static methods are shared, final methods are protected from change, and abstract methods must be implemented by subclasses.**
*/
