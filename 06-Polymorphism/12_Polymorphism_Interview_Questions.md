Polymorphism Interview Questions in Java

This file contains a complete set of interview questions and answers related to polymorphism in Java.

1. What is polymorphism in Java?
Polymorphism means one thing can take many forms.
In Java, it allows the same operation or method call to behave differently depending on the object.

2. What are the two types of polymorphism in Java?
The two types are:
- Compile-time polymorphism
- Runtime polymorphism

3. What is compile-time polymorphism?
Compile-time polymorphism is achieved by method overloading.
The compiler decides which method to call during compilation.

4. What is runtime polymorphism?
Runtime polymorphism is achieved by method overriding.
The actual method to execute is decided at runtime.

5. What is method overloading?
Method overloading is when multiple methods in the same class have the same name but different parameter lists.

6. What is method overriding?
Method overriding is when a subclass provides a new implementation of a method that already exists in the parent class.

7. What is the difference between method overloading and method overriding?
Overloading:
- same method name
- different parameters
- same class
- compile-time polymorphism

Overriding:
- same method name
- same parameters
- parent-child relationship
- runtime polymorphism

8. What is dynamic method dispatch?
Dynamic method dispatch is the mechanism by which Java decides which overridden method to call at runtime using a parent reference.

9. Can a parent reference variable refer to a child object?
Yes, a parent reference can point to a child object.

10. What happens if we call an overridden method using a parent reference?
The actual object type determines which overridden version runs.

11. Can we achieve polymorphism without inheritance?
Polymorphism is most commonly achieved with inheritance and interfaces, but inheritance is the main concept behind runtime polymorphism.

12. How is polymorphism related to inheritance?
Inheritance provides the parent-child relationship needed for overriding, which supports runtime polymorphism.

13. Can we overload constructors?
Yes, constructors can be overloaded.

14. What is the difference between constructor overloading and method overloading?
Constructor overloading is used to create objects in different ways, while method overloading is used to define multiple behaviors with the same method name.

15. Can we override static methods?
No, static methods cannot be overridden in the usual way.

16. Can we override private methods?
No, private methods are not visible to subclasses, so they cannot be overridden.

17. Can we override final methods?
No, final methods cannot be overridden.

18. Can we override final classes?
No, final classes cannot be inherited, so they cannot be overridden.

19. What is the role of the @Override annotation?
It informs the compiler that the method is intended to override a parent method.
It helps avoid mistakes.

20. What is the importance of method signature in overriding?
The method signature must match for overriding to work correctly.

21. Can we change the return type while overriding?
Yes, but only if the new return type is a subtype of the original return type (covariant return type).

22. Can we change the access modifier while overriding?
The child method cannot be more restrictive than the parent method.

23. Can an overridden method throw a broader exception?
No, the child method cannot throw a broader checked exception than the parent method.

24. What is covariant return type?
It is a feature where an overridden method can return a subclass of the parent method's return type.

25. What is the difference between compile-time and runtime polymorphism?
Compile-time polymorphism is resolved during compilation, while runtime polymorphism is resolved during program execution.

26. Which type of polymorphism is associated with method overloading?
Compile-time polymorphism.

27. Which type of polymorphism is associated with method overriding?
Runtime polymorphism.

28. Why is runtime polymorphism called runtime polymorphism?
Because the actual method to call is determined while the program is running.

29. Why is compile-time polymorphism called compile-time polymorphism?
Because Java determines the correct method at compile time.

30. What is the benefit of polymorphism in Java?
It improves flexibility, readability, reusability, and maintainability of code.

31. How does polymorphism help in code reusability?
It allows one common interface or method name to be used with different objects.

32. How does polymorphism help in extensibility?
You can add new subclasses without changing the existing code that uses the parent type.

33. What is the real-world example of polymorphism?
A single action like "make sound" can be implemented differently by a dog, cat, and cow.

34. Can we use polymorphism with interfaces?
Yes, interfaces are a very common way to implement polymorphism.

35. What is the difference between inheritance and polymorphism?
Inheritance is about class relationships, while polymorphism is about behavior flexibility.

36. What is a common mistake while overriding methods?
Changing the parameter list or using the wrong return type.

37. Can we overload a method by changing only its return type?
No, changing only the return type is not enough.

38. Can we overload a method by changing only the access modifier?
No, access modifier alone does not create overloading.

39. Can a subclass overload inherited methods?
Yes, a subclass can define another method with the same name but different parameters.

40. Can a subclass override inherited methods?
Yes, if the method is not final, private, or static.

41. What is the significance of method signature in overloading?
The method signature includes the method name and parameter list.

42. What is the difference between method signature and method declaration?
Method signature includes name and parameters.
Method declaration includes return type, access modifier, name, and parameters.

43. How does Java decide which overloaded method to call?
It checks the method name and argument types at compile time.

44. How does Java decide which overridden method to call?
It checks the actual object type at runtime.

45. What is the output of the following code?

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}

Output:
Dog barks

46. What is the output of the following code?

class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("B");
    }
}

public class Test2 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}

Output:
B

47. Can we use polymorphism with abstract classes?
Yes, abstract classes are often used to implement polymorphism.

48. What is the difference between abstraction and polymorphism?
Abstraction hides implementation details, while polymorphism allows one interface to behave in different ways.

49. What is the role of interfaces in polymorphism?
Interfaces define a common contract, and different classes can implement it in different ways.

50. Why do interviewers ask about polymorphism?
Because polymorphism is one of the most important concepts in OOP and is frequently used in real applications.

51. What is the difference between object type and reference type?
Reference type is the type declared for the variable, while object type is the actual object created in memory.

52. Why is object type important in runtime polymorphism?
Because Java decides which overridden method to call based on the actual object type.

53. Can we call a subclass-specific method using a parent reference?
No, not directly unless you cast the object to the subclass type.

54. What is downcasting?
Downcasting means converting a parent reference to a subclass type.

55. Can downcasting cause runtime errors?
Yes, if the object is not actually of that subclass type, ClassCastException can occur.

56. What is upcasting?
Upcasting means assigning a child object to a parent reference.

57. What is the difference between upcasting and downcasting?
Upcasting moves from subclass to superclass.
Downcasting moves from superclass to subclass.

58. What is the purpose of upcasting in polymorphism?
It allows a common parent reference to be used for different child objects.

59. What is the purpose of downcasting?
It is used when you need subclass-specific behavior.

60. Why does method overriding support polymorphism?
Because the same method call can behave differently for different subclasses.

61. What is the relation between polymorphism and interfaces?
Interfaces provide a contract, and different classes can implement it differently.

62. Can a class implement multiple interfaces and still use polymorphism?
Yes, a class can implement multiple interfaces and behave differently based on the interface reference.

63. How does polymorphism improve maintainability?
It reduces the need for many conditional statements and makes code easier to extend.

64. What is the difference between overloading and overriding with respect to binding?
Overloading uses static binding, while overriding uses dynamic binding.

65. What is static binding?
Static binding is resolved during compile time.

66. What is dynamic binding?
Dynamic binding is resolved during runtime.

67. Which concept is used in compile-time polymorphism?
Static binding.

68. Which concept is used in runtime polymorphism?
Dynamic binding.

69. What is the main advantage of runtime polymorphism?
It allows flexible behavior based on actual runtime objects.

70. What is the main advantage of compile-time polymorphism?
It allows cleaner code with multiple ways to call the same method.

71. Can we overload a method with the same parameter types but different return types?
No, return type alone is not enough.

72. Can we override a method with a different return type if it is a subclass type?
Yes, this is called covariant return type.

73. Does polymorphism only apply to methods?
No, polymorphism can also be seen in operators and objects in some contexts, but in Java it mainly applies to methods.

74. Why is polymorphism considered one of the four pillars of OOP?
Because it allows flexibility and behavior customization in object-oriented design.

75. How would you explain polymorphism in one sentence?
Polymorphism is the ability of different objects to respond differently to the same message.

76. What is the best real-world analogy for polymorphism?
A remote control can send the same command, but different devices respond differently.

77. Can we say that method overloading is an example of polymorphism?
Yes, it is compile-time polymorphism.

78. Can we say that method overriding is an example of polymorphism?
Yes, it is runtime polymorphism.

79. Why are interfaces useful for polymorphism?
Because they allow many classes to share the same method contract while having different implementations.

80. What is the most important rule for method overriding?
The method signature must match and the access level must not be more restrictive.

81. What is the difference between parent class and superclass?
They are the same concept.

82. What is the difference between child class and subclass?
They are the same concept.

83. What is the difference between runtime polymorphism and dynamic binding?
They are closely related; runtime polymorphism is the concept, dynamic binding is the mechanism.

84. What is the difference between compile-time polymorphism and static binding?
They are closely related; compile-time polymorphism is the concept, static binding is the mechanism.

85. What is the relation between method overriding and dynamic binding?
Method overriding uses dynamic binding.

86. What is the relation between method overloading and static binding?
Method overloading uses static binding.

87. Can polymorphism be used with arrays of objects?
Yes, a parent type array can hold child objects.

88. Can polymorphism be used with collections?
Yes, collections of parent types can store different child objects.

89. What is an example of polymorphism in software design?
A payment system where different payment methods like card, wallet, and UPI use the same processPayment() method.

90. Why do interviewers ask differences between overloading and overriding?
Because this is one of the most commonly tested OOP concepts.

91. How would you explain polymorphism to a beginner?
You can think of the same button doing different actions depending on the object that owns it.

92. What is the role of inheritance in runtime polymorphism?
Inheritance allows subclasses to override parent methods.

93. Are all method calls in Java polymorphic?
No, only those where overriding or overloading is involved.

94. What is the difference between method hiding and method overriding?
Method hiding occurs with static methods, while overriding occurs with instance methods.

95. Can static methods be polymorphic?
They can be hidden, but not overridden in the normal sense.

96. Why can't private methods be overridden?
Because private methods are not inherited.

97. Why can't final methods be overridden?
Because final methods are explicitly prevented from being changed.

98. Why must the return type be compatible in overriding?
Because Java must ensure the child version can safely substitute the parent version.

99. Why does polymorphism matter in large applications?
It reduces repeated code and makes the system easier to extend.

100. What is the most important takeaway about polymorphism?
Polymorphism lets one method name work differently across objects, making Java programs flexible and object-oriented.
