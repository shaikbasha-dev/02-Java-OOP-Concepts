01-Wrapper-Classes

1. Introduction to Wrapper Classes
Wrapper classes in Java are classes that wrap (or surround) primitive data types.
A primitive type like int, char, or boolean stores only a value, but a wrapper class stores that value as an object.

Example:
- int -> Integer
- char -> Character
- double -> Double

2. Definition of Wrapper Classes
A wrapper class is a predefined class in Java that provides an object version of a primitive type.
Each primitive has a matching wrapper class.

Primitive to Wrapper:
- byte    -> Byte
- short   -> Short
- int     -> Integer
- long    -> Long
- float   -> Float
- double  -> Double
- char    -> Character
- boolean -> Boolean

3. Why Wrapper Classes are Used in Java
Wrapper classes are used because:
- Java collections such as ArrayList and HashMap store objects, not primitives.
- Some methods and APIs need objects instead of primitive values.
- Wrapper classes provide useful built-in methods for conversion and comparison.
- They help in object-oriented programming where data is often handled as objects.

4. Primitive vs Wrapper Class
Primitive:
- Stores only a value
- Example: int x = 10;
- Faster and uses less memory

Wrapper:
- Stores a value as an object
- Example: Integer x = 10;
- Provides methods like toString(), parseInt(), equals(), etc.

5. Auto-boxing and Un-boxing
Auto-boxing:
Java automatically converts a primitive into its wrapper object.
Example:
Integer obj = 10;

Un-boxing:
Java automatically converts a wrapper object back into a primitive.
Example:
int num = obj;

6. Simple Introduction Program
Example:
public class WrapperExample {
    public static void main(String[] args) {
        int a = 100;
        Integer obj = a;   // Auto-boxing

        System.out.println("Primitive value: " + a);
        System.out.println("Wrapper value: " + obj);

        int b = obj;       // Un-boxing
        System.out.println("After un-boxing: " + b);
    }
}

Output:
Primitive value: 100
Wrapper value: 100
After un-boxing: 100

7. Another Example with Collections
Example:
import java.util.ArrayList;

public class WrapperCollectionExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
    }
}

Output:
[10, 20, 30]

8. Common Methods of Wrapper Classes
Some useful methods are:
- valueOf()
- parseInt()
- parseDouble()
- toString()
- intValue()
- doubleValue()
- compareTo()
- equals()

9. Example of parseInt()
Example:
int num = Integer.parseInt("50");
System.out.println(num);

Output:
50

10. Example of toString()
Example:
Integer x = 75;
String s = x.toString();
System.out.println(s);

Output:
75

11. Character and Boolean Wrapper Classes
Character:
- Wrapper class for char
- Example: Character ch = 'A';

Boolean:
- Wrapper class for boolean
- Example: Boolean flag = true;

12. Important Points
- Wrapper classes are immutable.
- They provide object versions of primitives.
- They are used in generics and collections.
- Auto-boxing and un-boxing make code simpler.

13. Summary
Wrapper classes are important in Java because they allow primitive values to be used as objects.
They are useful for collections, APIs, and built-in methods.
With auto-boxing and un-boxing, Java makes it easy to work with both primitives and objects.

14. Final Short Summary
Wrapper classes convert primitive data into objects.
They are mainly used in Java collections and object-based programming.
They make Java more flexible and easier to work with.

