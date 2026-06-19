03-Unboxing in Wrapper Classes

1. What is Un-boxing?
Un-boxing is the automatic conversion of a wrapper class object back into its corresponding primitive value.

Definition:
If Java has a wrapper object and a primitive is needed, Java automatically converts the object into a primitive.

Example:
- Integer -> int
- Character -> char
- Boolean -> boolean

2. Why is Un-boxing Used in Java?
Un-boxing is used because:
- It allows wrapper objects to be used in arithmetic and logical operations.
- It helps when a method expects a primitive value.
- It makes code easier to read and write.
- It allows Java to smoothly work between objects and primitives.

3. Why is Un-boxing Important?
Un-boxing is important because:
- It reduces manual conversion work.
- It helps in collections and APIs that store objects.
- It supports object-oriented programming while keeping primitive performance.
- It makes Java code cleaner and more flexible.

4. Un-boxing Definition in Simple Words
Un-boxing means:
Java automatically takes the value from a wrapper object and converts it into a primitive.

5. Example Program 1: Un-boxing an Integer Object to int
Program Headline:
Understanding how an Integer object is converted back to int

Why this program is used:
This program shows the basic idea of un-boxing with a simple integer example.

Program:
public class UnboxingExample1 {
    public static void main(String[] args) {
        Integer obj = 100;        // Step 1: wrapper object is created
        int num = obj;            // Step 2: un-boxing converts Integer to int

        System.out.println("Wrapper object: " + obj);
        System.out.println("Primitive value: " + num);
    }
}

Line-by-line explanation:
Line 1: public class UnboxingExample1 {
        Declares a class named UnboxingExample1.

Line 2:     public static void main(String[] args) {
        Declares the main method where program execution begins.

Line 3:         Integer obj = 100;
        Creates a wrapper object of type Integer and stores the value 100.

Line 4:         int num = obj;
        Java automatically converts the Integer object into a primitive int.

Line 5:         System.out.println("Wrapper object: " + obj);
        Prints the wrapper object value.

Line 6:         System.out.println("Primitive value: " + num);
        Prints the primitive value after un-boxing.

Line 7:     }
        Ends the main method.

Line 8: }
        Ends the class.

Output:
Wrapper object: 100
Primitive value: 100

Summary:
This program shows how Java automatically converts an Integer object back into an int.

6. Example Program 2: Un-boxing in Arithmetic Operation
Program Headline:
Using un-boxing in mathematical calculations

Why this program is used:
This program shows that once a wrapper object is un-boxed, it can be used like a normal primitive in calculations.

Program:
public class UnboxingExample2 {
    public static void main(String[] args) {
        Integer a = 10;          // Wrapper object
        Integer b = 20;          // Wrapper object
        int sum = a + b;         // Un-boxing happens automatically

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Sum: " + sum);
    }
}

Line-by-line explanation:
Line 1: public class UnboxingExample2 {
        Declares the class.

Line 2:     public static void main(String[] args) {
        Declares the main method.

Line 3:         Integer a = 10;
        Creates an Integer wrapper object with value 10.

Line 4:         Integer b = 20;
        Creates another Integer wrapper object with value 20.

Line 5:         int sum = a + b;
        Java un-boxes both objects and performs arithmetic.

Line 6:         System.out.println("Value of a: " + a);
        Prints the first wrapper value.

Line 7:         System.out.println("Value of b: " + b);
        Prints the second wrapper value.

Line 8:         System.out.println("Sum: " + sum);
        Prints the result of addition.

Output:
Value of a: 10
Value of b: 20
Sum: 30

Summary:
This program shows that wrapper objects can be used in arithmetic operations through automatic un-boxing.

7. Example Program 3: Un-boxing a Boolean Object
Program Headline:
Converting Boolean object back to boolean

Why this program is used:
This program demonstrates un-boxing with boolean values.

Program:
public class UnboxingExample3 {
    public static void main(String[] args) {
        Boolean flagObj = true;   // Wrapper object
        boolean flag = flagObj;   // Un-boxing happens automatically

        System.out.println("Wrapper value: " + flagObj);
        System.out.println("Primitive value: " + flag);
    }
}

Line-by-line explanation:
Line 1: public class UnboxingExample3 {
        Declares the class.

Line 2:     public static void main(String[] args) {
        Starts the program.

Line 3:         Boolean flagObj = true;
        Creates a Boolean wrapper object.

Line 4:         boolean flag = flagObj;
        Converts the Boolean object to primitive boolean.

Line 5:         System.out.println("Wrapper value: " + flagObj);
        Prints wrapper value.

Line 6:         System.out.println("Primitive value: " + flag);
        Prints primitive value.

Output:
Wrapper value: true
Primitive value: true

Summary:
This program shows how Java converts a Boolean object back into a boolean.

8. Example Program 4: Un-boxing with Character
Program Headline:
Converting Character object back to char

Why this program is used:
This program shows un-boxing with character values.

Program:
public class UnboxingExample4 {
    public static void main(String[] args) {
        Character chObj = 'B';    // Wrapper object
        char ch = chObj;          // Un-boxing happens automatically

        System.out.println("Wrapper value: " + chObj);
        System.out.println("Primitive value: " + ch);
    }
}

Line-by-line explanation:
Line 1: public class UnboxingExample4 {
        Declares the class.

Line 2:     public static void main(String[] args) {
        Starts the main method.

Line 3:         Character chObj = 'B';
        Creates a wrapper object for the character B.

Line 4:         char ch = chObj;
        Converts the Character object to primitive char.

Line 5:         System.out.println("Wrapper value: " + chObj);
        Prints the wrapper object value.

Line 6:         System.out.println("Primitive value: " + ch);
        Prints the primitive character.

Output:
Wrapper value: B
Primitive value: B

Summary:
This program demonstrates how Java un-boxes a Character object into a char.

9. How Un-boxing Helps Java
Un-boxing helps Java because:
- It allows wrapper objects to be used in expressions and conditions.
- It makes collections more useful while still allowing arithmetic operations.
- It reduces the need for developers to manually convert objects.
- It improves readability and productivity.

10. Difference Between Auto-boxing and Un-boxing
Auto-boxing:
Primitive -> Wrapper object
Example: int -> Integer

Un-boxing:
Wrapper object -> Primitive
Example: Integer -> int

11. Pseudocode for Un-boxing
Start
    Create wrapper object
    Convert wrapper object to primitive automatically
    Print both values
End

12. Final Summary
Un-boxing is the automatic process of converting a wrapper object back into a primitive value.
It is important because it allows Java to use object-based data in primitive operations without manual conversion.
It helps make Java code cleaner, easier to read, and more efficient.
