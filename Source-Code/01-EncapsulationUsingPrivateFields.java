// Program: Encapsulation Using Private Fields

// Declaring Employee class
class Employee {

    // Private instance variables
    // These variables cannot be accessed directly from outside the class
    private int employeeId;
    private String employeeName;
    private String department;
    private double salary;

    // Parameterized Constructor
    // Initializes employee object with user-defined values
    Employee(int employeeId, String employeeName, String department, double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    // Setter method to update employee ID
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter method to retrieve employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter method to update employee name
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter method to retrieve employee name
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter method to update department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter method to retrieve department
    public String getDepartment() {
        return department;
    }

    // Setter method to update salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter method to retrieve salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {

        System.out.println("Employee ID   : " + getEmployeeId());
        System.out.println("Employee Name : " + getEmployeeName());
        System.out.println("Department    : " + getDepartment());
        System.out.println("Salary        : ₹" + getSalary());
    }
}

// Main class
public class EncapsulationUsingPrivateFields {

    // Main method
    public static void main(String[] args) {

        // Creating Employee object
        Employee employee = new Employee(
                101,
                "Rahul Sharma",
                "Software Development",
                75000.00);

        // Displaying original employee details
        System.out.println("Employee Details Before Modification");
        employee.displayEmployeeDetails();

        System.out.println();

        // Updating employee details using setter methods
        employee.setEmployeeName("Ananya Reddy");
        employee.setDepartment("Quality Assurance");
        employee.setSalary(82000.00);

        // Displaying updated employee details
        System.out.println("Employee Details After Modification");
        employee.displayEmployeeDetails();
    }
}
