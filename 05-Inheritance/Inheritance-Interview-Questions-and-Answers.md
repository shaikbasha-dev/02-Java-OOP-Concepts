Inheritance Interview Questions and Answers in Java

This file contains many beginner-friendly interview questions and answers about inheritance in Java.

1) What is inheritance in Java?
Answer:
Inheritance is a mechanism in Java where one class acquires the properties and behaviors of another class.
The class that inherits is called the child class or subclass.
The class being inherited from is called the parent class or superclass.

2) Why is inheritance used in Java?
Answer:
Inheritance is used for code reusability, reducing duplication, and organizing classes in a hierarchy.

3) Which keyword is used for inheritance in Java?
Answer:
The extends keyword is used to inherit a class.

4) What is the difference between superclass and subclass?
Answer:
The superclass is the parent class.
The subclass is the class that inherits from the superclass.

5) Can a class inherit from multiple classes directly in Java?
Answer:
No, Java does not support multiple inheritance using classes directly.
A class can inherit from only one class.

6) How is multiple inheritance achieved in Java?
Answer:
Multiple inheritance is achieved using interfaces.
A class can implement multiple interfaces.

7) What is the IS-A relationship in inheritance?
Answer:
The IS-A relationship means that an object of the child class is also an object of the parent class.
Example: Dog IS-A Animal.

8) What is the HAS-A relationship?
Answer:
HAS-A means composition or aggregation, where one class contains another class as a field.
It is different from inheritance.

9) What is a base class?
Answer:
A base class is the class from which other classes inherit.
It is also called a superclass.

10) What is a derived class?
Answer:
A derived class is a class that inherits from another class.
It is also called a subclass.

11) What is single inheritance?
Answer:
Single inheritance is when one class inherits from only one parent class.

12) What is multilevel inheritance?
Answer:
Multilevel inheritance is when a class is derived from a class that is also derived from another class.
Example: Animal -> Mammal -> Dog.

13) What is hierarchical inheritance?
Answer:
Hierarchical inheritance is when one parent class has multiple child classes.
Example: Animal -> Dog, Cat, Cow.

14) What is hybrid inheritance?
Answer:
Hybrid inheritance is a combination of two or more types of inheritance.

15) Can constructors be inherited in Java?
Answer:
No, constructors are not inherited in Java.
But constructors can be called from another constructor using this() or super().

16) What is the use of super keyword in inheritance?
Answer:
The super keyword is used to access members of the parent class.
It is used to call the parent constructor or access parent methods/variables.

17) What is the difference between this and super?
Answer:
this refers to the current object.
super refers to the parent class object or parent class members.

18) Can a subclass have a method with the same name as a superclass method?
Answer:
Yes, this is called method overriding.

19) What is method overriding?
Answer:
Method overriding happens when a subclass provides a specific implementation of a method already defined in the parent class.

20) What is method overloading?
Answer:
Method overloading means having multiple methods with the same name but different parameters.
It is not inheritance-specific.

21) What is the difference between overloading and overriding?
Answer:
Overloading is compile-time polymorphism and happens in the same class.
Overriding is runtime polymorphism and happens in the parent-child relationship.

22) Can we override static methods?
Answer:
No, static methods cannot be overridden, because they belong to the class, not the object.

23) Can we override private methods?
Answer:
No, private methods cannot be overridden because they are not visible to subclasses.

24) Can we call a parent class method from a child class?
Answer:
Yes, by using the super keyword or by simply calling it if it is inherited.

25) What is constructor chaining in inheritance?
Answer:
Constructor chaining means a constructor calling another constructor, either in the same class or in the parent class.

26) Which constructor is called first in inheritance?
Answer:
The parent class constructor is called first, then the child class constructor.

27) Why is the parent constructor called first?
Answer:
Because the child object must first initialize the inherited part before the child-specific part.

28) What happens if a subclass does not define any constructor?
Answer:
Java provides a default constructor in the subclass, and it automatically calls the parent no-argument constructor.

29) What happens if the parent class has only a parameterized constructor?
Answer:
The child class must explicitly call that constructor using super(...).

30) Can a subclass access private members of the parent class?
Answer:
No, private members cannot be accessed directly by the subclass.

31) Can a subclass access protected members of the parent class?
Answer:
Yes, protected members are accessible in the subclass.

32) What is the default access modifier in Java?
Answer:
The default access modifier is package-private, which allows access only within the same package.

33) What is protected access in Java?
Answer:
Protected allows access within the same package and also to subclasses in other packages.

34) What is the advantage of using inheritance?
Answer:
It improves code reuse and improves maintainability.

35) What is the disadvantage of inheritance?
Answer:
Too much inheritance can make code complex and tightly coupled.

36) What is polymorphism in Java?
Answer:
Polymorphism means one object can take many forms.
Inheritance is one of the main ways polymorphism is achieved.

37) How is runtime polymorphism achieved?
Answer:
Runtime polymorphism is achieved using method overriding and reference variables of the parent type.

38) What is dynamic method dispatch?
Answer:
Dynamic method dispatch is the process where the JVM decides which overridden method to call at runtime.

39) Can a subclass object be assigned to a superclass reference?
Answer:
Yes, for example: Animal a = new Dog();

40) What happens when we call a method using a superclass reference pointing to a subclass object?
Answer:
The overridden method in the subclass is executed at runtime.

41) What is the role of the Object class in inheritance?
Answer:
Every class in Java inherits directly or indirectly from the Object class.

42) Is Object class a superclass of all classes?
Answer:
Yes.

43) Can a class extend the Object class explicitly?
Answer:
Yes, but it is not necessary because it happens implicitly.

44) What is the difference between extends and implements?
Answer:
extends is used for classes.
implements is used for interfaces.

45) Can an interface extend another interface?
Answer:
Yes, an interface can extend one or more interfaces.

46) Can an interface implement another interface?
Answer:
No, an interface cannot implement another interface.
It can only extend it.

47) Can a class implement multiple interfaces?
Answer:
Yes.

48) Why does Java not support multiple inheritance with classes?
Answer:
To avoid ambiguity and complexity caused by multiple parent classes.

49) What is the diamond problem?
Answer:
The diamond problem occurs in multiple inheritance when two parent classes have a method with the same signature and the child class becomes confused.
Java avoids this by not allowing multiple inheritance for classes.

50) What is the difference between inheritance and abstraction?
Answer:
Inheritance is about reusing and extending behavior.
Abstraction focuses on hiding implementation details and showing only essential features.

51) What is the difference between inheritance and encapsulation?
Answer:
Inheritance is about relationships between classes.
Encapsulation is about wrapping data and methods together and restricting direct access.

52) Can a subclass inherit private members?
Answer:
No, private members are not inherited in terms of accessibility.

53) Can a subclass inherit default members from another package?
Answer:
No, default members are accessible only within the same package.

54) Can a subclass call a parent class constructor explicitly?
Answer:
Yes, using super(...).

55) What is the rule for using super() in a constructor?
Answer:
super() must be the first statement in the child constructor.

56) What is the rule for using this() in a constructor?
Answer:
this() must also be the first statement in the constructor.

57) Can we use both this() and super() together in a constructor?
Answer:
No, only one of them can be used as the first statement.

58) What is the difference between this() and super()?
Answer:
this() calls another constructor in the same class.
super() calls a constructor in the parent class.

59) What is the role of inheritance in code reuse?
Answer:
A child class can reuse methods and variables of the parent class instead of rewriting them.

60) What is the role of inheritance in object modeling?
Answer:
It helps model real-world relationships using classes.

61) What is the use of the final keyword with inheritance?
Answer:
final can be used to prevent method overriding or class inheritance.

62) Can a final class be inherited?
Answer:
No.

63) Can a final method be overridden?
Answer:
No.

64) What happens if a subclass defines a method with the same signature but different return type?
Answer:
It is not valid for overriding unless the return type is covariant and compatible.

65) Can a subclass increase the visibility of an inherited method?
Answer:
Yes, a subclass can make a method less restrictive, but not more restrictive.

66) What is covariant return type?
Answer:
It means the overriding method can return a subtype of the parent method's return type.

67) What is method hiding?
Answer:
Method hiding occurs when a subclass declares a static method with the same signature as a static method in the parent class.

68) What is the difference between overriding and hiding?
Answer:
Overriding uses runtime polymorphism.
Hiding uses compile-time binding.

69) Can an object of a subclass be assigned to a parent reference?
Answer:
Yes.

70) Can a parent reference call child-specific methods?
Answer:
No, only methods available in the parent type can be called directly.

71) What is the difference between inheritance and composition?
Answer:
Inheritance represents IS-A relationship.
Composition represents HAS-A relationship.

72) Which is better: inheritance or composition?
Answer:
It depends on the design. Composition is often preferred for flexibility.

73) Why is inheritance considered powerful in OOP?
Answer:
Because it allows reuse, extension, and polymorphism.

74) Why should inheritance be used carefully?
Answer:
Overuse can make code rigid and difficult to maintain.

75) What is the output of a program where parent and child classes have same method names?
Answer:
The subclass version is executed when the object is of the child class.

76) What is the importance of inheritance in Java interviews?
Answer:
It is one of the most commonly asked OOP concepts and helps test understanding of class relationships and polymorphism.

77) What is the difference between class inheritance and interface inheritance?
Answer:
Class inheritance uses extends.
Interface inheritance uses extends or implements depending on the context.

78) Can a class extend an abstract class?
Answer:
Yes, a class can extend an abstract class if it provides implementations for all abstract methods.

79) Can an abstract class have a constructor?
Answer:
Yes, abstract classes can have constructors.

80) Can an abstract class be instantiated?
Answer:
No.

81) Can a child class call the parent class method without using super?
Answer:
Yes, if the parent method is inherited and not hidden.

82) What is the significance of inheritance in real-world applications?
Answer:
It models real-world categories such as animals, vehicles, robots, and employees.

83) What is a package in relation to inheritance?
Answer:
A package organizes related classes, and access modifiers affect inheritance across packages.

84) What is the role of access modifiers in inheritance?
Answer:
They control which members can be accessed by the subclass.

85) Why is protected important in inheritance?
Answer:
It allows subclasses to access data while keeping it hidden from unrelated classes.

86) Can a subclass override a method and change its access level?
Answer:
Yes, it can make it more accessible but not less accessible.

87) What is the difference between inheritance and instantiation?
Answer:
Inheritance defines a relationship between classes.
Instantiation creates objects from classes.

88) What is the role of the subclass constructor in inheritance?
Answer:
It initializes the child object and may also call the parent constructor.

89) What is the importance of the Object class in inheritance hierarchy?
Answer:
It is the root of all classes.

90) What is the simple rule of inheritance in Java?
Answer:
A class can inherit from only one class, but can implement many interfaces.

91) What is the difference between a class and an interface?
Answer:
A class defines implementation.
An interface defines contract or behavior.

92) Why do we use interfaces with inheritance?
Answer:
To achieve abstraction and support multiple inheritance of behavior.

93) What is the relation between inheritance and polymorphism?
Answer:
Inheritance allows polymorphism because a parent reference can point to a child object.

94) What is a parent reference and child object?
Answer:
A parent reference is a variable declared with the parent type, and it can hold a child object.

95) Can a child class reference a parent object?
Answer:
No, a child reference cannot directly point to a parent object unless the parent object is actually a child object.

96) What is the purpose of using super in method overriding?
Answer:
It is used to call the parent class method from the child class.

97) Why is method overriding important?
Answer:
It allows runtime behavior to be customized for subclasses.

98) What is a Java inheritance hierarchy?
Answer:
It is the arrangement of classes from top to bottom based on parent-child relationships.

99) What is the topmost class in Java inheritance hierarchy?
Answer:
The Object class.

100) What is the most common interview answer for inheritance?
Answer:
Inheritance is a mechanism where one class inherits the properties and methods of another class to achieve code reuse and establish an IS-A relationship.

Bonus Questions

101) Can we use inheritance for all real-world relationships?
Answer:
No, only when the relationship is clearly IS-A.

102) What is the difference between extends and implements in one line?
Answer:
extends is for classes, implements is for interfaces.

103) Can a class inherit from another class and implement an interface together?
Answer:
Yes.

104) What is the benefit of using inheritance with abstraction?
Answer:
It helps create common behavior in a base class while allowing subclasses to define specific behavior.

105) What is the importance of inheritance in exam questions?
Answer:
It is frequently asked because it tests understanding of class relationships, access modifiers, and polymorphism.

106) Can a parent class reference access child-only methods?
Answer:
No.

107) Why does Java use single inheritance for classes?
Answer:
To reduce ambiguity and complexity.

108) What are the main pillars of OOP?
Answer:
Encapsulation, Inheritance, Polymorphism, and Abstraction.

109) Which OOP concept is most connected with inheritance?
Answer:
Polymorphism.

110) What is the best short definition of inheritance?
Answer:
Inheritance is the ability of one class to reuse and extend another class.

111) What is an example of inheritance in real life?
Answer:
A car is a vehicle, and a bike is also a vehicle.

112) What is the example of inheritance in Java using Animal and Dog?
Answer:
Dog extends Animal, so Dog inherits methods and fields of Animal.

113) What is the example of inheritance using Employee and Manager?
Answer:
Manager extends Employee, so Manager can use Employee properties.

114) Why is inheritance useful in building large applications?
Answer:
It allows code organization, reuse, and extension across many modules.

115) What is a subclass constructor calling a superclass constructor called?
Answer:
Constructor chaining.

116) Can we inherit constructors directly?
Answer:
No.

117) What is the first line of a subclass constructor usually used for?
Answer:
It usually calls super() or this().

118) What happens if we don’t call super() in a constructor?
Answer:
Java automatically inserts super() if no constructor call is written.

119) What is the relation between inheritance and method visibility?
Answer:
Visibility rules decide whether subclasses can access inherited members.

120) What is one important interview tip for inheritance?
Answer:
Always explain code reuse, IS-A relationship, and how the child class extends the parent class.
