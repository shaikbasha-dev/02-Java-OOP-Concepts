// Demonstrates constructor overloading using different parameter types.

class Box {

    int x;
    double y;

    // Constructor with an integer parameter
    Box(int x) {
        this.x = x;
        this.y = 0.0;
    }

    // Constructor with a double parameter
    Box(double y) {
        this.x = 0;
        this.y = y;
    }

    // Displays box information
    public void display() {
        System.out.println("Box Details");
        System.out.println("-----------");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}

public class ConstructorOverloadingDifferentParameterTypes {

    public static void main(String[] args) {

        // Create a Box object using the integer constructor
        Box firstBox = new Box(5);

        // Create a Box object using the double constructor
        Box secondBox = new Box(5.5);

        // Display details of the first object
        firstBox.display();

        System.out.println();

        // Display details of the second object
        secondBox.display();
    }
}
