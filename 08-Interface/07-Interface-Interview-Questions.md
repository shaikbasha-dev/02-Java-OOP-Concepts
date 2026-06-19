
07-Interface-Interview-Questions

1. What is an interface in Java?
Answer:
An interface in Java is a blueprint of a class. It defines a contract that classes must follow.
It contains abstract methods, default methods, static methods, and constants.
An interface is used to achieve abstraction and multiple inheritance of type.

2. Why do we use interfaces in Java?
Answer:
We use interfaces to:
- achieve abstraction,
- define a common contract,
- support multiple inheritance,
- reduce coupling,
- make code flexible and maintainable.

3. What is the difference between an interface and a class?
Answer:
A class can have both state and behavior, while an interface mainly defines behavior.
A class can be instantiated, but an interface cannot be instantiated directly.
A class can extend only one class, but can implement many interfaces.

4. Can an interface have variables?
Answer:
Yes. Variables in an interface are implicitly public, static, and final.
They are constants by default.

5. Can an interface have constructors?
Answer:
No. Interfaces cannot have constructors because they are not instantiated directly.

6. Can an interface have methods with bodies?
Answer:
Yes. Since Java 8, interfaces can have:
- default methods with bodies,
- static methods with bodies.
Before Java 8, methods in interfaces were abstract only.

7. What is the difference between abstract class and interface?
Answer:
An abstract class can have both abstract and concrete methods, and can have fields and constructors.
An interface is used mainly to define behavior and can be implemented by many classes.
A class can extend only one abstract class but can implement many interfaces.

8. Can a class implement multiple interfaces?
Answer:
Yes. A class can implement multiple interfaces.
This is one of the main benefits of interfaces.

9. Can one interface extend another interface?
Answer:
Yes. An interface can extend one or more interfaces.

10. Can an interface extend a class?
Answer:
No. An interface cannot extend a class.
An interface can only extend another interface.

11. Can an interface implement another interface?
Answer:
No. An interface cannot implement another interface.
It can extend another interface.

12. What is a marker interface?
Answer:
A marker interface is an interface without any methods.
Example: Serializable.
It is used to mark classes so that JVM or framework can identify special behavior.

13. What is a functional interface?
Answer:
A functional interface is an interface that has exactly one abstract method.
Example: Runnable.
It is used with lambda expressions.

14. What is the @FunctionalInterface annotation?
Answer:
It is used to indicate that an interface is intended to be a functional interface.
The compiler gives an error if more than one abstract method is present.

15. What is the difference between default and abstract methods in an interface?
Answer:
- Abstract methods have no body and must be implemented by the class.
- Default methods have a body and need not be overridden.

16. Can a default method be overridden?
Answer:
Yes. A class can override a default method if it wants different behavior.

17. Can a static method in an interface be overridden?
Answer:
No. Static methods cannot be overridden because they belong to the interface.

18. Can we declare private methods inside an interface?
Answer:
Yes. Since Java 9, interfaces can have private methods.
These are used to share common code between default methods.

19. What happens if a class implements two interfaces having the same default method?
Answer:
The class must override the conflicting default method explicitly.
Otherwise, the compiler will show an ambiguity error.

20. Why does Java not support multiple inheritance using classes?
Answer:
Java does not allow a class to extend more than one class because it can cause ambiguity and complexity.
Interfaces solve this problem by allowing multiple inheritance of type.

21. What is polymorphism in relation to interfaces?
Answer:
Polymorphism allows one interface reference to point to different implementations.
This is useful when the same method is called on different objects.

22. Can we create an object of an interface?
Answer:
No. An interface cannot be instantiated directly.
We can create an object of a class that implements the interface.

23. What is the role of implements keyword?
Answer:
The implements keyword is used by a class to indicate that it will provide implementations for the methods declared in the interface.

24. What is the role of extends keyword with interfaces?
Answer:
The extends keyword is used by an interface to inherit from another interface.

25. What is the difference between implements and extends?
Answer:
- extends is used for classes and interfaces to inherit behavior from a parent.
- implements is used by a class to implement an interface.

26. Give an example of an interface.
Answer:
interface Animal {
    void sound();
}

27. Give an example of a class implementing an interface.
Answer:
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

28. What is runtime polymorphism with interfaces?
Answer:
Runtime polymorphism happens when the actual object type is determined during program execution.
Example: Animal a = new Dog();

29. Can an interface be nested inside another interface or class?
Answer:
Yes. Interfaces can be nested inside classes and interfaces.

30. What is the use of Serializable interface?
Answer:
Serializable is used to mark a class so that its objects can be serialized and stored or transferred.

31. What is the use of Comparable interface?
Answer:
Comparable is used to define the natural ordering of objects.

32. What is the use of Runnable interface?
Answer:
Runnable is used to represent a task that can be executed by a thread.

33. What is the difference between Comparable and Comparator?
Answer:
Comparable compares the current object with another object.
Comparator compares two separate objects.

34. What is a lambda expression in relation to interfaces?
Answer:
A lambda expression is a short way to implement a functional interface.
Example: (a, b) -> a + b.

35. Can an interface contain private methods?
Answer:
Yes, from Java 9 onward.

36. What is the default access modifier for interface methods?
Answer:
The methods are public abstract by default if they are abstract methods.

37. What is the default access modifier for fields in an interface?
Answer:
They are public static final by default.

38. Can an interface have a main method?
Answer:
Yes. Since an interface can contain static methods, it can also have a main method.

39. Why are interfaces useful in large applications?
Answer:
They help in separating design from implementation, improving modularity, reusability, and testability.

40. What is the difference between interface and abstract class from a design perspective?
Answer:
Use interface when you want a contract.
Use abstract class when you want shared implementation.

41. Can interfaces help in testing?
Answer:
Yes. They allow mocking and dependency injection, making unit testing easier.

42. Can interfaces help in API design?
Answer:
Yes. They define clear contracts for APIs and reduce direct dependency on implementation details.

43. What is the purpose of the implements keyword in Java?
Answer:
It tells the compiler that the class will provide implementations for the methods declared in the interface.

44. What is the purpose of the extends keyword in interfaces?
Answer:
It allows one interface to inherit from another interface.

45. Can default methods in interfaces be inherited?
Answer:
Yes. Implementing classes can use the inherited default implementation unless they override it.

46. Can we use interfaces for loose coupling?
Answer:
Yes. Interfaces promote loose coupling because the caller depends on the contract, not the exact implementation.

47. What happens if a class does not implement all abstract methods of an interface?
Answer:
The class must be declared abstract.

48. What is the difference between a class implementing an interface and a subclass extending a class?
Answer:
Implementing an interface gives behavior contract.
Extending a class gives inheritance of implementation and state.

49. Can an interface have method overloading?
Answer:
Yes. Like normal methods, interface methods can be overloaded.

50. Can an interface have synchronized methods?
Answer:
No. Interface methods cannot be synchronized because synchronization is about implementation details.

51. What is a real-world example of interfaces?
Answer:
A payment system can have interfaces such as Payable, Refundable, and WalletService.
Different classes such as CreditCardPayment and PayPalPayment can implement them.

52. What is the main advantage of using interfaces in Java collections?
Answer:
The Java collection framework uses interfaces like List, Set, and Map to allow multiple implementations.

53. Why is List an interface?
Answer:
List defines the behavior of an ordered collection, while ArrayList and LinkedList provide different implementations.

54. Is it possible to use interface references with different implementations?
Answer:
Yes, this is a common use of polymorphism.

55. What is the difference between interface and inheritance?
Answer:
Interface defines behavior; inheritance shares implementation and state.

56. What should you prefer in large applications: interface or class?
Answer:
Prefer interface for contracts and abstraction; prefer class for actual implementations.

57. How does interface help in dependency injection?
Answer:
It allows classes to depend on abstractions rather than concrete classes, which makes code more flexible.

58. Why is interface important in Java interviews?
Answer:
Because interface is one of the most important concepts in object-oriented programming and is commonly asked in technical interviews.

59. What is the best short definition of interface?
Answer:
An interface is a contract that tells a class what methods it must provide.

60. What is the best short definition of abstraction?
Answer:
Abstraction means hiding implementation details and showing only essential behavior.

61. Extra tip for interview answers:
When answering interface questions, always mention abstraction, contracts, multiple inheritance of type, and polymorphism.

62. Final short summary:
Interfaces are used to define behavior, support abstraction, allow multiple inheritance of type, and help in designing flexible Java applications.
