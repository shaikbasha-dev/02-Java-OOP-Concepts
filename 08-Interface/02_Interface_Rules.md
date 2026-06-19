
02-Interface-Rules

1. What is an Interface in Java?
An interface in Java is a blueprint of a class. It tells the class what methods it must have, but not exactly how those methods should work.
It is mainly used to achieve abstraction and to support multiple inheritance of behavior.

Why interfaces are important:
- They define a contract.
- They help achieve abstraction.
- They support loose coupling.
- They allow a class to follow multiple rules.
- They improve code readability and maintainability.

2. Rules of Interface in Java
1. Use the keyword interface to declare an interface.
2. Methods in an interface are public and abstract by default.
3. Fields in an interface are public, static, and final by default.
4. A class must implement all methods declared by the interface.
5. A class can implement more than one interface.
6. One interface can extend another interface.
7. An interface cannot be instantiated directly.
8. Interfaces help in standardizing behavior across multiple classes.
9. Interfaces are used for runtime polymorphism.
10. Interfaces are widely used in large applications.

3. Why do we use Interface in Java?
We use interfaces to create reusable and flexible software.
They allow multiple classes to follow the same rules while writing different implementations.
This is useful in real-world applications where many classes share similar behavior.

Advantages of using interfaces:
- Promotes abstraction
- Helps achieve multiple inheritance through interfaces
- Makes code easy to extend
- Reduces code duplication
- Separates design from implementation

4. Program 1: Basic Calculator Using Interface
Headline: Demonstrating how an interface defines a contract for calculator classes.

Why this program is used:
This program teaches the basic purpose of interfaces.
It shows how different classes can follow the same rule set and still implement them differently.
It also helps us understand how Java supports multiple inheritance using interfaces.

Program Code:
import java.util.Scanner;

interface Calculator {
    void add();
    void sub();
}

class Calci1 implements Calculator {
    public void add() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public void sub() {
        int a = 10;
        int b = 20;
        int sub = b - a;
        System.out.println("Sub: " + sub);
    }
}

class Calci2 implements Calculator {
    public void add() {
        int a;
        int b;
        a = 10;
        b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public void sub() {
        int a;
        int b;
        a = 10;
        b = 20;
        int sub = b - a;
        System.out.println("Sub: " + sub);
    }
}

class Calci3 implements Calculator {
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Please enter second number: ");
        int b = sc.nextInt();
        System.out.println();
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Please enter second number: ");
        int b = sc.nextInt();
        System.out.println();
        int sub = a - b;
        System.out.println("Substraction: " + sub);
    }
}

public class BasicCalculator {
    public static void main(String[] args) {
        Calci1 c1 = new Calci1();
        c1.add();
        c1.sub();

        Calci2 c2 = new Calci2();
        c2.add();
        c2.sub();

        Calci3 c3 = new Calci3();
        c3.add();
        c3.sub();
    }
}

Detailed line-by-line explanation:
1. import java.util.Scanner; -> imports the Scanner class to take input from the user.
2. interface Calculator { -> creates a contract that all calculator classes must follow.
3. void add(); -> declares an abstract method for addition.
4. void sub(); -> declares an abstract method for subtraction.
5. } -> ends the interface.
6. class Calci1 implements Calculator { -> class Calci1 follows the Calculator contract.
7. public void add() { -> defines the add method.
8. int a = 10; -> stores first fixed value.
9. int b = 20; -> stores second fixed value.
10. int sum = a + b; -> computes sum.
11. System.out.println("Sum: " + sum); -> prints the sum.
12. }
13. public void sub() { -> defines subtraction method.
14. int a = 10; -> stores first fixed value.
15. int b = 20; -> stores second fixed value.
16. int sub = b - a; -> computes subtraction.
17. System.out.println("Sub: " + sub); -> prints subtraction result.
18. }
19. }
20. class Calci2 implements Calculator { -> second class follows same contract.
21. public void add() { -> defines addition method.
22. int a; -> declares variable a.
23. int b; -> declares variable b.
24. a = 10; -> assigns 10 to a.
25. b = 20; -> assigns 20 to b.
26. int sum = a + b; -> computes the sum.
27. System.out.println("Sum: " + sum); -> displays result.
28. }
29. public void sub() { -> defines subtraction method.
30. int a; -> declares variable a.
31. int b; -> declares variable b.
32. a = 10; -> assigns 10 to a.
33. b = 20; -> assigns 20 to b.
34. int sub = b - a; -> computes subtraction.
35. System.out.println("Sub: " + sub); -> displays result.
36. }
37. }
38. class Calci3 implements Calculator { -> third class also follows same contract.
39. public void add() { -> defines the user-input addition method.
40. Scanner sc = new Scanner(System.in); -> creates input object.
41. System.out.print("Please enter first number: "); -> asks user for first number.
42. int a = sc.nextInt(); -> reads first number.
43. System.out.println(); -> moves to next line.
44. System.out.print("Please enter second number: "); -> asks user for second number.
45. int b = sc.nextInt(); -> reads second number.
46. System.out.println(); -> moves to next line.
47. int sum = a + b; -> computes sum.
48. System.out.println("Sum: " + sum); -> prints output.
49. }
50. public void sub() { -> defines subtraction method with user input.
51. Scanner sc = new Scanner(System.in); -> creates input object.
52. System.out.print("Please enter first number: "); -> asks user for first number.
53. int a = sc.nextInt(); -> reads first number.
54. System.out.println(); -> moves to next line.
55. System.out.print("Please enter second number: "); -> asks user for second number.
56. int b = sc.nextInt(); -> reads second number.
57. System.out.println(); -> moves to next line.
58. int sub = a - b; -> computes subtraction.
59. System.out.println("Substraction: " + sub); -> prints output.
60. }
61. }
62. public class BasicCalculator { -> declares the class containing main method.
63. public static void main(String[] args) { -> program entry point.
64. Calci1 c1 = new Calci1(); -> creates object of Calci1.
65. c1.add(); -> calls add method.
66. c1.sub(); -> calls sub method.
67. Calci2 c2 = new Calci2(); -> creates object of Calci2.
68. c2.add(); -> calls add method.
69. c2.sub(); -> calls sub method.
70. Calci3 c3 = new Calci3(); -> creates object of Calci3.
71. c3.add(); -> calls add method.
72. c3.sub(); -> calls sub method.
73. }
74. }

Method definitions:
- add(): performs addition.
- sub(): performs subtraction.
- main(): starts the execution of the program.

Pseudocode:
1. Start the program.
2. Define interface Calculator.
3. Declare add() and sub().
4. Create classes Calci1, Calci2, and Calci3 that implement the interface.
5. Implement add() and sub() in all classes.
6. In main(), create objects.
7. Call the methods.
8. End the program.

Output of Program 1:
If fixed values are used, output is:
Sum: 30
Sub: 10
Sum: 30
Sub: 10

If values are entered by the user, output depends on the input.

Summary of Program 1:
This program shows how interfaces define a standard behavior for many classes.
It teaches abstraction, consistency, and code reusability.

5. Program 2: Using Two Interfaces in One Class
Headline: Demonstrating how one class can implement multiple interfaces.

Why this program is used:
This program explains a very important Java feature.
A single class can implement multiple interfaces, which is useful when the class must follow multiple contracts.

Program Code:
import java.util.Scanner;

interface Calci1 {
    void add();
    void sub();
}

interface Calci2 {
    void mul();
    void sub();
}

class Calculator implements Calci1, Calci2 {
    public void add() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public void sub() {
        int a = 10;
        int b = 20;
        int sub = b - a;
        System.out.println("Sub: " + sub);
    }

    public void mul() {
        int a = 10;
        int b = 20;
        int mul = a * b;
        System.out.println("Mul: " + mul);
    }

    public void div() {
        int a = 10;
        int b = 20;
        int div = b / a;
        System.out.println("Div: " + div);
    }
}

public class App {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
    }
}

Detailed explanation:
- interface Calci1 defines add() and sub().
- interface Calci2 defines mul() and sub().
- class Calculator implements both interfaces.
- It defines add(), sub(), mul(), and div().
- main() creates one object and calls all operations.

Pseudocode:
1. Create two interfaces.
2. Declare methods in each interface.
3. Create class Calculator implementing both interfaces.
4. Implement all methods.
5. Create one object in main.
6. Call methods.
7. Display results.

Output:
Sum: 30
Sub: 10
Mul: 200
Div: 2

Summary:
This program proves that one class can satisfy multiple interfaces.
It is useful in designing flexible and scalable applications.

6. Final Conclusion
Interfaces are very important in Java because they help developers write clean, reusable, and maintainable code.
They allow abstraction, support multiple inheritance of type, and improve design quality.
A strong understanding of interfaces is essential for becoming a professional Java developer.
