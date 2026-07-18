// Demonstrates the use of a parameterized constructor to initialize
// the dimensions of a rectangle and calculate its area.

class Rectangle {

    int length;
    int breadth;

    // Parameterized constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Calculates and displays the area of the rectangle
    public void displayArea() {
        int area = length * breadth;

        System.out.println("Rectangle Details");
        System.out.println("-----------------");
        System.out.println("Length : " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area   : " + area);
    }
}

public class ParameterizedConstructorRectangle {

    public static void main(String[] args) {

        // Create a Rectangle object using the parameterized constructor
        Rectangle rectangle = new Rectangle(5, 4);

        // Display rectangle details and area
        rectangle.displayArea();
    }
}
