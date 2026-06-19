05-valueOf()

1. Definition of valueOf()
valueOf() is a static method used to convert a primitive value or a string into its corresponding wrapper class object.

Example:
- Integer.valueOf(10) returns an Integer object
- Boolean.valueOf("true") returns a Boolean object
- Double.valueOf("3.14") returns a Double object

Syntax:
Integer.valueOf(int i)
Integer.valueOf(String s)

2. Why valueOf() is Used in Java
valueOf() is used because:
- it converts primitive values into objects,
- it is commonly used in collections and generics,
- it helps when an API expects wrapper objects,
- it is cleaner than manually creating wrapper objects.

3. Why This Method is Important
This method is important because:
- it improves code readability,
- it helps in object-based programming,
- it supports auto-boxing and wrapper usage,
- it is commonly used in Java applications.

4. Simple Definition in Easy Words
valueOf() means:
"Take a value and create its wrapper object."

5. Example Program 1: Using Integer.valueOf()
Program Headline:
Converting an int into an Integer object using valueOf()

Why this program is used:
This program shows the basic use of valueOf() with integer values.

Program:
public class ValueOfExample1 {
    public static void main(String[] args) {
        int num = 25;                          // Step 1: create primitive int
        Integer obj = Integer.valueOf(num);    // Step 2: convert int to Integer object

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object: " + obj);
    }
}

Line-by-line explanation:
Line 1: public class ValueOfExample1 {
        Declares a class named ValueOfExample1.

Line 2:     public static void main(String[] args) {
        Declares the main method where execution starts.

Line 3:         int num = 25;
        Creates a primitive integer variable.

Line 4:         Integer obj = Integer.valueOf(num);
        Converts the primitive int into an Integer object using valueOf().

Line 5:         System.out.println("Primitive value: " + num);
        Prints the primitive value.

Line 6:         System.out.println("Wrapper object: " + obj);
        Prints the wrapper object value.

Line 7:     }
        Ends the main method.

Line 8: }
        Ends the class.

Output:
Primitive value: 25
Wrapper object: 25

Summary:
This program shows how valueOf() converts a primitive int into an Integer object.

6. Example Program 2: Using String with valueOf()
Program Headline:
Converting a string value into a wrapper object using valueOf()

Why this program is used:
This program demonstrates that valueOf() can also accept a string input.

Program:
public class ValueOfExample2 {
    public static void main(String[] args) {
        String text = "100";                     // Step 1: store a numeric string
        Integer obj = Integer.valueOf(text);     // Step 2: convert string to Integer object

        System.out.println("String value: " + text);
        System.out.println("Integer object: " + obj);
    }
}

Line-by-line explanation:
Line 1: public class ValueOfExample2 {
        Declares the class.

Line 2:     public static void main(String[] args) {
        Declares the main method.

Line 3:         String text = "100";
        Stores the number as text.

Line 4:         Integer obj = Integer.valueOf(text);
        Converts the string into a wrapper object.

Line 5:         System.out.println("String value: " + text);
        Prints the original string.

Line 6:         System.out.println("Integer object: " + obj);
        Prints the converted wrapper object.

Output:
String value: 100
Integer object: 100

Summary:
This program demonstrates how String values can be converted into wrapper objects using valueOf().

7. Example Program 3: Using valueOf() for Boolean
Program Headline:
Using valueOf() to convert a string into a Boolean object

Why this program is used:
This program shows how valueOf() works for boolean values.

Program:
public class ValueOfExample3 {
    public static void main(String[] args) {
        String text = "true";                    // Step 1: store boolean text
        Boolean result = Boolean.valueOf(text);  // Step 2: convert string to Boolean object

        System.out.println("Text value: " + text);
        System.out.println("Boolean object: " + result);
    }
}

Line-by-line explanation:
Line 1: public class ValueOfExample3 {
        Declares the class.

Line 2:     public static void main(String[] args) {
        Starts the main method.

Line 3:         String text = "true";
        Stores the text representation of a boolean.

Line 4:         Boolean result = Boolean.valueOf(text);
        Converts the string into a Boolean wrapper object.

Line 5:         System.out.println("Text value: " + text);
        Prints the original text.

Line 6:         System.out.println("Boolean object: " + result);
        Prints the Boolean object.

Output:
Text value: true
Boolean object: true

Summary:
This program shows how valueOf() converts strings into Boolean wrapper objects.

8. Example Program 4: Using valueOf() with Double
Program Headline:
Converting a decimal string into a Double object

Why this program is used:
This program shows how valueOf() works for decimal values.

Program:
public class ValueOfExample4 {
    public static void main(String[] args) {
        String text = "12.5";                     // Step 1: store decimal text
        Double number = Double.valueOf(text);     // Step 2: convert string to Double object

        System.out.println("Text value: " + text);
        System.out.println("Double object: " + number);
    }
}

Line-by-line explanation:
Line 1: public class ValueOfExample4 {
        Declares the class.

Line 2:     public static void main(String[] args) {
        Starts the main method.

Line 3:         String text = "12.5";
        Stores the decimal number as text.

Line 4:         Double number = Double.valueOf(text);
        Converts the string into a Double wrapper object.

Line 5:         System.out.println("Text value: " + text);
        Prints the text value.

Line 6:         System.out.println("Double object: " + number);
        Prints the Double object.

Output:
Text value: 12.5
Double object: 12.5

Summary:
This program shows how valueOf() converts decimal strings into Double objects.

9. Difference Between valueOf() and parseInt()
valueOf() returns a wrapper object.
parseInt() returns a primitive int.

Example:
- Integer.valueOf("10") returns Integer object
- Integer.parseInt("10") returns primitive int

10. How valueOf() Helps Java
valueOf() helps Java because:
- it makes conversion easier,
- it lets developers work with objects when needed,
- it is useful in collections and APIs,
- it reduces manual wrapping code.

11. Pseudocode for valueOf()
Start
    Take a primitive value or string
    Call valueOf()
    Get wrapper object
    Print the result
End

12. Final Summary
valueOf() is a very useful Java method that converts values into wrapper objects.
It helps developers when they need object-based representation of primitive values.
It is especially helpful in collections, APIs, and Java programs that use wrappers frequently.
