// Demonstrates constructor overloading using different numbers of parameters.

class Circle {

    double radius;

    // No-argument constructor
    Circle() {
        radius = 1.0;
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Displays circle information
    public void display() {
        System.out.println("Circle Details");
        System.out.println("--------------");
        System.out.println("Radius : " + radius);
    }
}

public class ConstructorOverloadingDifferentNumberOfParameters {

    public static void main(String[] args) {

        // Create a Circle object using the no-argument constructor
        Circle defaultCircle = new Circle();

        // Create a Circle object using the parameterized constructor
        Circle customCircle = new Circle(3.5);

        // Display details of the default circle
        defaultCircle.display();

        System.out.println();

        // Display details of the custom circle
        customCircle.display();
    }
}
