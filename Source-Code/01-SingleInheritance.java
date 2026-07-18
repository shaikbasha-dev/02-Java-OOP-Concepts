// Program: Single Inheritance

// Parent class
class Person {

    // Instance variables
    int personId;
    String personName;

    // Method to assign person details
    void setPersonDetails(int personId, String personName) {

        this.personId = personId;
        this.personName = personName;
    }

    // Method to display person details
    void displayPersonDetails() {

        System.out.println("Person ID   : " + personId);
        System.out.println("Person Name : " + personName);
    }
}

// Child class inheriting from Person
class Employee extends Person {

    // Additional instance variables
    String department;
    double salary;

    // Method to assign employee details
    void setEmployeeDetails(String department, double salary) {

        this.department = department;
        this.salary = salary;
    }

    // Method to display complete employee details
    void displayEmployeeDetails() {

        // Calling parent class method
        displayPersonDetails();

        // Displaying child class data
        System.out.println("Department  : " + department);
        System.out.println("Salary      : ₹" + salary);
    }
}

// Main class
public class SingleInheritance {

    // Main method
    public static void main(String[] args) {

        // Creating Employee object
        Employee employee = new Employee();

        // Setting inherited data
        employee.setPersonDetails(101, "Rahul Sharma");

        // Setting child class data
        employee.setEmployeeDetails("Software Development", 75000.00);

        // Displaying complete employee information
        employee.displayEmployeeDetails();
    }
}
