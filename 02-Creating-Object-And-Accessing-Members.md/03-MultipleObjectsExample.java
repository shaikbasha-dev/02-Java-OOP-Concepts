// Demonstrates creating multiple objects and accessing their individual data members and methods.

public class MultipleObjectsExample {

    public static void main(String[] args) {

        // Create the first Car object
        Car firstCar = new Car();

        // Assign values to the first car
        firstCar.brand = "Maruti";
        firstCar.color = "Red";
        firstCar.price = 987654;

        // Display first car details
        System.out.println("First Car Details");
        System.out.println("-----------------");
        System.out.println("Brand : " + firstCar.brand);
        System.out.println("Color : " + firstCar.color);
        System.out.println("Price : ₹" + firstCar.price);

        // Invoke first car behavior
        firstCar.accelerate();

        System.out.println();

        // Create the second Car object
        Car secondCar = new Car();

        // Assign values to the second car
        secondCar.brand = "Audi";
        secondCar.color = "Blue";
        secondCar.price = 10646464;

        // Display second car details
        System.out.println("Second Car Details");
        System.out.println("------------------");
        System.out.println("Brand : " + secondCar.brand);
        System.out.println("Color : " + secondCar.color);
        System.out.println("Price : ₹" + secondCar.price);

        // Invoke second car behavior
        secondCar.accelerate();
    }
}

// Represents a car with its attributes and behavior.
class Car {

    String brand;
    String color;
    double price;

    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
}
