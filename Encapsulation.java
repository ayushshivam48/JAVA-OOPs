// Class demonstrating encapsulation
class Employee {

    // Private variables, accessible only within this class
    private String name;
    private int age;
    private double salary;

    // Constructor to initialize Employee objects
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;  // Only set age if it's valid (positive)
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    // Public getter method for salary
    public double getSalary() {
        return salary;
    }

    // Public setter method for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;  // Only set salary if it's valid (positive)
        } else {
            System.out.println("Please enter a valid salary.");
        }
    }

    // Public method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an Employee object using encapsulation
        Employee emp = new Employee("John Doe", 30, 55000);

        // Accessing private variables using public getter methods
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());

        // Modifying private variables using public setter methods
        emp.setName("Jane Smith");
        emp.setAge(35);
        emp.setSalary(60000);

        // Displaying the updated employee details
        emp.displayEmployeeInfo();
    }
}
