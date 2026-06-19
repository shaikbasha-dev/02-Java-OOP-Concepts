# Encapsulation in Java

Encapsulation-Introduction:

# Defination:
Encapsulation: Encapsulation is a paradigm / concept / piller of providing secutiry to the important data members present in a class.
Encapsulation can be defined as binding together data members & member functions.

### Why Encapsulation is important
- It protects important data
- It prevents unwanted access from outside the class
- It allows controlled reading and updating of data
- It improves security, maintainability, and code quality

### How Encapsulation helps Java
- Keeps data safe
- Avoids accidental data changes
- Lets the class decide how data should be accessed
- Makes code more professional and reliable

Examples of Encapsulation are:

# Scenario 1: No Security (Direct Access Available)

## Headline
Demonstrating Why Encapsulation Is Needed

## Why this program is used
This program is used to show what happens when important data is exposed directly and can be accessed from anywhere.

## How this helps Java
This helps learners understand:
- why direct access to sensitive data is dangerous
- why private members are needed
- why controlled access is important

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares a class named Bank
    int amt = 5000;                    // Line 2: Declares a public-like variable with value 5000
}

class Hero {                           // Line 3: Declares a class named Hero
    public static void main(String[] args) {   // Line 4: Declares the main method
        Bank b = new Bank();                    // Line 5: Creates an object of Bank
        System.out.println(b.amt);             // Line 6: Prints the value of amt directly
    }                                           // Line 7: Ends the main method
}

class Villian {                        // Line 8: Declares a class named Villian
    public static void main(String[] args) {   // Line 9: Declares the main method
        Bank b = new Bank();                    // Line 10: Creates an object of Bank
        System.out.println(b.amt);             // Line 11: Prints the value of amt directly
    }                                           // Line 12: Ends the main method
}
```

## Explanation of every line
1. `class Bank {`  
   This creates a class named `Bank`.

2. `int amt = 5000;`  
   This declares a variable `amt` and sets its value to `5000`.

3. `}`  
   This closes the `Bank` class.

4. `class Hero {`  
   This creates another class named `Hero`.

5. `public static void main(String[] args) {`  
   This declares the main method where program execution starts.

6. `Bank b = new Bank();`  
   This creates an object of the `Bank` class.

7. `System.out.println(b.amt);`  
   This prints the value of `amt` directly from outside the class.

8. `}`  
   This closes the main method of `Hero`.

9. `}`  
   This closes the `Hero` class.

10. `class Villian {`  
   This creates another class named `Villian`.

11. `public static void main(String[] args) {`  
   This declares another main method.

12. `Bank b = new Bank();`  
   This creates a new object of `Bank`.

13. `System.out.println(b.amt);`  
   This again prints the value of `amt` directly.

14. `}`  
   This closes the main method of `Villian`.

15. `}`  
   This closes the `Villian` class.

## Output (expected conceptual output)
```text
5000
5000
```

## Pseudocode
```text
START
    CREATE class Bank
    DECLARE amt = 5000

    CREATE class Hero
    CREATE object b of Bank
    PRINT b.amt

    CREATE class Villian
    CREATE object b of Bank
    PRINT b.amt
END
```

## Summary
This scenario shows that if data is not protected, anyone can read or change it.  
That is why encapsulation is needed.

---

# Scenario 2: Over Security (No Access Available)

## Headline
Demonstrating the Problem of Making Data Completely Inaccessible

## Why this program is used
This program is used to show that making a variable `private` prevents both safe and unsafe access.

## How this helps Java
This helps learners understand:
- why `private` is useful for data hiding
- why complete restriction is also a problem
- why we need controlled access

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares a class named Bank
    private int amt = 5000;            // Line 2: Declares amt as private
}

class Hero {                           // Line 3: Declares a class named Hero
    public static void main(String[] args) {   // Line 4: Declares main method
        Bank b = new Bank();                    // Line 5: Creates object of Bank
        System.out.println(b.amt);             // Line 6: Tries to print private variable
    }                                           // Line 7: Ends main method
}

class Villian {                        // Line 8: Declares a class named Villian
    public static void main(String[] args) {   // Line 9: Declares main method
        Bank b = new Bank();                    // Line 10: Creates object of Bank
        System.out.println(b.amt);             // Line 11: Tries to print private variable
    }                                           // Line 12: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the `Bank` class.

2. `private int amt = 5000;`  
   Declares `amt` as private, so it cannot be accessed directly from outside the class.

3. `}`  
   Closes the `Bank` class.

4. `class Hero {`  
   Starts the `Hero` class.

5. `public static void main(String[] args) {`  
   Declares the main method.

6. `Bank b = new Bank();`  
   Creates a `Bank` object.

7. `System.out.println(b.amt);`  
   Tries to access private data from outside the class.

8. `}`  
   Closes the main method.

9. `}`  
   Closes the `Hero` class.

10. `class Villian {`  
   Starts the `Villian` class.

11. `public static void main(String[] args) {`  
   Declares the main method.

12. `Bank b = new Bank();`  
   Creates another object of `Bank`.

13. `System.out.println(b.amt);`  
   Again tries to access private data.

14. `}`  
   Closes the main method.

15. `}`  
   Closes the `Villian` class.

## Output (expected compile-time error)
```text
error: amt has private access in Bank
```

## Pseudocode
```text
START
    CREATE class Bank
    DECLARE private amt = 5000

    CREATE class Hero
    CREATE object b
    TRY TO PRINT b.amt

    CREATE class Villian
    CREATE object b
    TRY TO PRINT b.amt
END
```

## Summary
This scenario shows that making data private is good for security, but it also blocks legitimate access.  
So we need a controlled way to read or update data.

---

# Scenario 3: Using Encapsulation Properly

## Headline
Applying Encapsulation Using Setter and Getter Methods

## Why this program is used
This program is used to show how private data can be accessed safely using public methods.

## How this helps Java
This helps learners understand:
- how private data is protected
- how setter methods control updates
- how getter methods allow safe reading
- how validation can be done before changing data

## Code with comments on every line
```java
package learning;                       // Line 1: Declares the package name

class Bank {                            // Line 2: Declares class Bank
    private int amt = 5000;             // Line 3: Declares private amount variable
    private int pin = 1234;             // Line 4: Declares private pin variable

    public void setAmt(int pass, int amount) {   // Line 5: Declares public setter method
        if(pass == pin) {                         // Line 6: Checks if password is correct
            amt = amount;                         // Line 7: Updates amount if password is correct
        }                                         // Line 8: Ends if block
        else {                                    // Line 9: Starts else block
            System.out.println("Invalid pin");   // Line 10: Prints error message
        }                                         // Line 11: Ends else block
    }                                             // Line 12: Ends setter method

    public int getAmt(int pass) {                 // Line 13: Declares public getter method
        if(pass == pin) {                         // Line 14: Checks if password is correct
            return amt;                           // Line 15: Returns amount if correct
        }                                         // Line 16: Ends if block
        else {                                    // Line 17: Starts else block
            System.out.println("Invalid Pin");    // Line 18: Prints error message
            return 0;                             // Line 19: Returns 0 if wrong pin
        }                                         // Line 20: Ends else block
    }                                             // Line 21: Ends getter method
}

public class Hero {                       // Line 22: Declares public class Hero
    public static void main(String[] arge) {   // Line 23: Declares main method
        Bank b = new Bank();                    // Line 24: Creates object of Bank
        int pass = 1234;                        // Line 25: Stores correct pin
        int amount = 5000;                      // Line 26: Stores amount to set
        b.setAmt(pass, amount);                 // Line 27: Calls setter to update value
        System.out.println("The balance is: " + b.getAmt(pass));   // Line 28: Prints balance
    }                                                               // Line 29: Ends main method
}

class Villian {                           // Line 30: Declares class Villian
    public static void main(String[] arge) {   // Line 31: Declares main method
        Bank b = new Bank();                    // Line 32: Creates object of Bank
        int pass = 1243;                        // Line 33: Stores wrong pin
        int amount = 5000;                      // Line 34: Stores amount
        b.setAmt(pass, amount);                 // Line 35: Calls setter with wrong pin
        System.out.println("The balance is: " + b.getAmt(pass));   // Line 36: Prints result
    }                                                               // Line 37: Ends main method
}
```

## Explanation of every line
1. `package learning;`  
   Declares the package name for the code.

2. `class Bank {`  
   Starts the `Bank` class.

3. `private int amt = 5000;`  
   Declares `amt` as private so it cannot be accessed directly.

4. `private int pin = 1234;`  
   Declares another private variable `pin`.

5. `public void setAmt(int pass, int amount) {`  
   Declares a public method to set the amount.

6. `if(pass == pin) {`  
   Checks whether the entered password is correct.

7. `amt = amount;`  
   Updates the amount if the password is correct.

8. `}`  
   Ends the if block.

9. `else {`  
   Runs if password is wrong.

10. `System.out.println("Invalid pin");`  
   Prints an error message.

11. `}`  
   Ends the else block.

12. `}`  
   Ends the setter method.

13. `public int getAmt(int pass) {`  
   Declares a public method to read the amount.

14. `if(pass == pin) {`  
   Checks if password is correct.

15. `return amt;`  
   Returns the amount if password matches.

16. `}`  
   Ends the if block.

17. `else {`  
   Runs if password is wrong.

18. `System.out.println("Invalid Pin");`  
   Prints an error message.

19. `return 0;`  
   Returns 0 if the password is invalid.

20. `}`  
   Ends else block.

21. `}`  
   Ends getter method.

22. `public class Hero {`  
   Declares the public class.

23. `public static void main(String[] arge) {`  
   Declares the main method.

24. `Bank b = new Bank();`  
   Creates object `b`.

25. `int pass = 1234;`  
   Stores the correct password.

26. `int amount = 5000;`  
   Stores the amount to be set.

27. `b.setAmt(pass, amount);`  
   Calls the setter method to update the amount.

28. `System.out.println("The balance is: " + b.getAmt(pass));`  
   Prints the balance using the getter method.

29. `}`  
   Ends the main method.

30. `}`  
   Closes the Hero class.

31. `class Villian {`  
   Starts the Villian class.

32. `public static void main(String[] arge) {`  
   Declares another main method.

33. `Bank b = new Bank();`  
   Creates another `Bank` object.

34. `int pass = 1243;`  
   Stores a wrong password.

35. `int amount = 5000;`  
   Stores the amount.

36. `b.setAmt(pass, amount);`  
   Tries to update amount using wrong password.

37. `System.out.println("The balance is: " + b.getAmt(pass));`  
   Prints balance or error message based on password.

38. `}`  
   Ends the main method.

39. `}`  
   Closes the Villian class.

## Output (expected)
### For Hero
```text
The balance is: 5000
```

### For Villian
```text
Invalid pin
The balance is: 0
```

## Pseudocode
```text
START
    CREATE class Bank
    DECLARE private amt
    DECLARE private pin

    DEFINE setAmt(pass, amount)
        IF pass == pin
            SET amt = amount
        ELSE
            PRINT "Invalid pin"

    DEFINE getAmt(pass)
        IF pass == pin
            RETURN amt
        ELSE
            PRINT "Invalid Pin"
            RETURN 0

    CREATE class Hero
    CREATE object b
    SET pass = 1234
    SET amount = 5000
    CALL b.setAmt(pass, amount)
    PRINT b.getAmt(pass)

    CREATE class Villian
    CREATE object b
    SET pass = 1243
    SET amount = 5000
    CALL b.setAmt(pass, amount)
    PRINT b.getAmt(pass)
END
```

## Summary
This is the correct use of encapsulation.  
The private data is protected, but allowed access is controlled through public methods.

---

# Final Professional Summary

## Definition
Encapsulation is the process of **binding data and methods together** and protecting data from direct unauthorized access.

## Why it matters
- improves security
- prevents misuse of data
- allows controlled access
- makes code more maintainable

## Core idea
> Encapsulation = data hiding + controlled access

---

# One-Line Final Revision Note

```text
Encapsulation is the concept of protecting data by combining it with methods and allowing controlled access through public functions.
```

---
