02-Autoboxing in Wrapper Classes

1. What is Auto-boxing?
Auto-boxing is the automatic conversion of a primitive value into its corresponding wrapper class object.

Example:
- int -> Integer
- char -> Character
- boolean -> Boolean

Definition:
When Java sees a primitive value where an object is expected, it automatically wraps the value into a wrapper class.

2. Why is Auto-boxing Used in Java?
Auto-boxing is used because:
- It allows primitives to be used in places where objects are required.
- It makes code easier to read and write.
- It helps when working with collections such as ArrayList, List, and Set.
- It reduces the need for manual conversion.

3. Why is Auto-boxing Important?
Auto-boxing is important because:
- It improves developer productivity.
- It avoids repetitive code.
- It helps Java support object-oriented features smoothly.
- It makes generics and collections easier to use.

4. Auto-boxing Definition in Simple Words
Auto-boxing means:
Java automatically puts a primitive value inside its wrapper class object.

5. Example Program 1: Auto-boxing of int to Integer
Program Headline:
Understanding how int is automatically converted to Integer

Why this program is used:
This program shows the basic idea of auto-boxing using a simple integer value.

Program:
public class AutoBoxingExample1 {
    public static void main(String[] args) {
        int num = 50;                  // Step 1: primitive variable is created
        Integer obj = num;             // Step 2: auto-boxing converts int to Integer

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object value: " + obj);
    }
}

Line-by-line explanation:
Line 1: public class AutoBoxingExample1 {
        Declares a class named AutoBoxingExample1.

Line 2:     public static void main(String[] args) {
        Declares the main method, where the program starts.

Line 3:         int num = 50;
        Creates a primitive integer variable named num and assigns the value 50.

Line 4:         Integer obj = num;
        Java automatically converts the primitive int value into an Integer object.

Line 5:         System.out.println("Primitive value: " + num);
        Prints the original primitive value.

Line 6:         System.out.println("Wrapper object value: " + obj);
        Prints the wrapper object value.

Line 7:     }
        Ends the main method.

Line 8: }
        Ends the class.

Output:
Primitive value: 50
Wrapper object value: 50

Summary:
This program shows how Java automatically wraps an int value into an Integer object.

6. Example Program 2: Auto-boxing with ArrayList
Program Headline:
Using auto-boxing to store integers in a collection

Why this program is used:
This program shows why auto-boxing is useful in Java collections.

Program:
import java.util.ArrayList;

public class AutoBoxingExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Stored values: " + numbers);
    }
}

Line-by-line explanation:
Line 1: import java.util.ArrayList;
        Imports the ArrayList class from Java utility package.

Line 3: public class AutoBoxingExample2 {
        Declares a class.

Line 4:     public static void main(String[] args) {
        Declares the main method.

Line 5:         ArrayList<Integer> numbers = new ArrayList<>();
        Creates a list that stores Integer objects.

Line 6:         numbers.add(10);
        Adds 10 to the list. Java auto-boxes 10 into Integer.

Line 7:         numbers.add(20);
        Adds 20. Java converts it into Integer automatically.

Line 8:         numbers.add(30);
        Adds 30. Java converts it into Integer automatically.

Line 10:        System.out.println("Stored values: " + numbers);
        Prints the final list.

Output:
Stored values: [10, 20, 30]

Summary:
This program shows how auto-boxing allows primitive values to be stored directly in ArrayList.

7. Example Program 3: Auto-boxing with Boolean
Program Headline:
Auto-boxing a boolean value into Boolean

Why this program is used:
This program shows how boolean values are wrapped automatically.

Program:
public class AutoBoxingExample3 {
    public static void main(String[] args) {
        boolean flag = true;
        Boolean obj = flag;

        System.out.println("Primitive boolean: " + flag);
        System.out.println("Wrapper boolean: " + obj);
    }
}

Line-by-line explanation:
Line 1: public class AutoBoxingExample3 {
        Declares the class.

Line 2:     public static void main(String[] args) {
        Starts the program.

Line 3:         boolean flag = true;
        Creates a primitive boolean variable.

Line 4:         Boolean obj = flag;
        Auto-boxes the primitive boolean into Boolean.

Line 5:         System.out.println("Primitive boolean: " + flag);
        Prints the primitive value.

Line 6:         System.out.println("Wrapper boolean: " + obj);
        Prints the wrapper object value.

Output:
Primitive boolean: true
Wrapper boolean: true

Summary:
This program demonstrates auto-boxing for boolean values.

8. Example Program 4: Auto-boxing with Character
Program Headline:
Converting a char into Character automatically

Why this program is used:
This program shows how character values are handled with auto-boxing.

Program:
public class AutoBoxingExample4 {
    public static void main(String[] args) {
        char ch = 'A';
        Character obj = ch;

        System.out.println("Primitive char: " + ch);
        System.out.println("Wrapper char: " + obj);
    }
}

Line-by-line explanation:
Line 1: public class AutoBoxingExample4 {
        Declares the class.

Line 2:     public static void main(String[] args) {
        Starts the main method.

Line 3:         char ch = 'A';
        Creates a primitive character variable.

Line 4:         Character obj = ch;
        Auto-boxes the char into Character.

Line 5:         System.out.println("Primitive char: " + ch);
        Prints the primitive character.

Line 6:         System.out.println("Wrapper char: " + obj);
        Prints the wrapper object character.

Output:
Primitive char: A
Wrapper char: A

Summary:
This program shows auto-boxing for char values.

9. How Auto-boxing Helps Java
Auto-boxing helps Java because:
- It allows primitive data to be used in object-based APIs.
- It makes collections easier to use.
- It reduces manual conversions.
- It improves readability and development speed.

10. Auto-boxing vs Manual Boxing
Manual boxing means writing code like this:
Integer obj = Integer.valueOf(50);

Auto-boxing means writing this:
Integer obj = 50;

Auto-boxing is easier and cleaner.

11. Pseudocode for Auto-boxing
Start
    Create primitive value
    Assign it to wrapper variable
    Print primitive and wrapper values
End

12. Final Summary
Auto-boxing is a Java feature that automatically converts primitive data types into their corresponding wrapper objects.
It is very useful when using collections, generics, and object-based methods.
It makes code cleaner, easier to understand, and more efficient for developers.
