Inheritance Diagrams in Java

Definition
Inheritance diagrams show how classes are related to each other.
They help us understand which class is the parent and which class is the child.

Why diagrams are useful
- They make inheritance easy to understand.
- They show the structure of the program clearly.
- They help in learning the parent-child relationship.
- They are very useful for exams and interviews.

Important idea
A parent class is also called a superclass or base class.
A child class is also called a subclass or derived class.

1) Single Inheritance Diagram

Meaning
One child class inherits from one parent class.

Diagram
Animal
  |
  | extends
  v
Dog

Example idea
Animal -> Dog

Simple visual
[Animal]
   |
   |---> [Dog]

2) Multilevel Inheritance Diagram

Meaning
A class inherits from another class, and that class again inherits from another class.

Diagram
Animal
  |
  v
Mammal
  |
  v
Dog

Example idea
Animal -> Mammal -> Dog

Simple visual
[Animal] -> [Mammal] -> [Dog]

3) Hierarchical Inheritance Diagram

Meaning
One parent class has many child classes.

Diagram
       Animal
      /    |    \
     /     |     \
   Dog    Cat    Cow

Example idea
Animal is the parent.
Dog, Cat, and Cow are children.

Simple visual
[Animal]
  |---> [Dog]
  |---> [Cat]
  |---> [Cow]

4) Multiple Inheritance Using Interface

Meaning
Java does not allow one class to inherit from two classes directly.
But a class can implement multiple interfaces.

Diagram
   Fly         Swim
    \           /
     \         /
      \       /
         Duck

Example idea
Duck can both fly and swim.

Simple visual
[Fly] + [Swim] -> [Duck]

5) Hybrid Inheritance Diagram

Meaning
It is a combination of more than one inheritance type.

Diagram
          Animal
         /      \
        /        \
     Bird         Fish
      |             |
      |             |
     Sparrow       GoldFish

Example idea
Bird and Fish are children of Animal.
Sparrow is a child of Bird.
GoldFish is a child of Fish.

Simple visual
[Animal]
  |---> [Bird]---> [Sparrow]
  |---> [Fish]---> [GoldFish]

6) IS-A Relationship Diagram

Meaning
The child is a type of the parent.

Examples
- Dog is-a Animal
- Car is-a Vehicle
- Student is-a Person

Diagram
Dog
 |
 | is-a
 v
Animal

Simple visual
[Dog] is-a [Animal]

7) Quick Diagram Summary

Single:
Animal -> Dog

Multilevel:
Animal -> Mammal -> Dog

Hierarchical:
Animal -> Dog, Cat, Cow

Multiple (via interface):
Fly + Swim -> Duck

Hybrid:
Animal -> Bird/Fish -> Sparrow/GoldFish

8) One-line definitions
- Single inheritance: one class inherits one parent class.
- Multilevel inheritance: parent-child-grandchild chain.
- Hierarchical inheritance: one parent with many children.
- Multiple inheritance: one class gets features from multiple parents.
- Hybrid inheritance: combination of two or more inheritance forms.

9) Exam Tip
When you see a diagram, always check:
- Who is the parent?
- Who is the child?
- Is it one parent or many?
- Is the relationship shown using extends or implements?

10) Final Summary
Inheritance diagrams help us understand how classes are connected.
They make Java OOP easier to visualize and remember.
